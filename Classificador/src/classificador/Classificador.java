/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificador;
import Interface.Interface;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jorge
 */
public class Classificador {

    private int pnNumWords = 0;
    private int pnNumDocs = 0;
    private Classe paClasses[];
    private Hashtable <String,Integer> poVocabulary = new Hashtable<String,Integer>();
    
    public Classificador(String taClasses[])
    {
        this.paClasses = new Classe[taClasses.length];
        this.mxInitializeClasses(taClasses);
    }
    
    private void mxInitializeClasses(String taClasses[])
    {
        int lnNunClasses = taClasses.length;
        for(int i = 0; i < lnNunClasses; i++)
        {
            this.paClasses[i] = new Classe(taClasses[i]);
        }
    }
    
    public void mxAddDocument(String tsPath, int tnClasse)
    {
        File file = new File(tsPath);
        Scanner loScan;
        String lsLine, lsWord;
        StringTokenizer loToken;
        
        this.paClasses[tnClasse].mxAddDocument();
        try
        {
            //Read document
            loScan = new Scanner(file);
            if (loScan.hasNextLine()) 
            {
                lsLine = loScan.nextLine();
                loToken = new StringTokenizer(lsLine, " ,;.(){}[]-!|¡?¿");
                while(loToken.hasMoreTokens()) 
                {
                    lsWord = loToken.nextToken();
                    
                    //Add word to classificador
                    this.pnNumWords++;
                    
                    if(this.poVocabulary.containsKey(lsWord))
                        this.poVocabulary.put(lsWord, this.poVocabulary.get(lsWord)+1);
                    else
                        this.poVocabulary.put(lsWord, 1);
                    
                    //Add word to class
                    this.paClasses[tnClasse].mxAddWord(lsWord);
                }
            }
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        this.pnNumDocs++;
    }
    
    public int mxClassificarDocument(String tsPath)
    {
        File file = new File(tsPath);
        Scanner loScan;
        String lsLine, lsWord;
        StringTokenizer loToken;
        int lnNumClasses = this.paClasses.length;
        double laProbabilities[] = new double[lnNumClasses];
        
        try
        {
            for(int i = 0; i < lnNumClasses; i++)
                laProbabilities[i] = Math.log(this.paClasses[i].mxGetClassProbability());
                        
            //Read document
            loScan = new Scanner(file);
            if (loScan.hasNextLine()) 
            {
                lsLine = loScan.nextLine();
                loToken = new StringTokenizer(lsLine, " ,;.(){}[]-!|¡?¿");
                while(loToken.hasMoreTokens()) 
                {
                    lsWord = loToken.nextToken();
                    if(this.poVocabulary.containsKey(lsWord))
                    {
                        for(int i = 0; i < lnNumClasses; i++)
                            laProbabilities[i] += Math.log(this.paClasses[i].mxGetProbability(lsWord));                        
                    }
                }
            }
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        return this.mxMaxValue(laProbabilities);
    }
    
    public int mxMaxValue(double taValues[])
    {
        double lnMaxValue = taValues[0];
        int lnMaxIndex = 0;
        for(int i = 1; i < taValues.length; i++)
        {
            if(taValues[i] > lnMaxValue)
            {
                lnMaxValue = taValues[i];
                lnMaxIndex = i;
            }
        }
        return lnMaxIndex;
    }
    
    public void setProbaClass(int tnClass, float tnProCla)
    {
        this.paClasses[tnClass].setProbClass(tnProCla);
    }
    
    public int getNumDocs()
    {
        return this.pnNumDocs;
    }
    
    public void mxCalculateProbabilityTerms(int tnClass)
    {
        Enumeration<String> loWords = this.poVocabulary.keys();
        int lnNumVocabulary = this.poVocabulary.size();        
        
        while(loWords.hasMoreElements())
        {
            String lsWord = loWords.nextElement();            
            this.paClasses[tnClass].mxCalculateProb(lsWord, lnNumVocabulary);            
        }        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interface i = new Interface();
        i.setVisible(true);
    }    
}
