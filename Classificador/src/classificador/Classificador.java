/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificador;
import Interface.Interface;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author jorge
 */
public class Classificador {

    private int pnNumWords;
    private int pnNumDocs;
    private Classe paClasses[];
    private Hashtable <String,Integer> poVocabulary;
    
    public Classificador(String taClasses[])
    {
        this.paClasses = new Classe[taClasses.length];
        this.mxInitializeClasses(taClasses);
        this.mxInitializeProperties();
    }
    
    private void mxInitializeClasses(String taClasses[])
    {
        int lnNunClasses = taClasses.length;
        for(int i = 0; i < lnNunClasses; i++)
        {
            this.paClasses[i] = new Classe(taClasses[i]);
        }
    }
    
    public void mxInitializeProperties()
    {
        this.pnNumWords = 0;
        this.pnNumDocs = 0;
        this.poVocabulary = new Hashtable<String,Integer>();
        
        for(Classe loClasse : this.paClasses)
        {
            loClasse.mxInitializeProperties();
        }
    }
    
    public void mxAddDocument(Document toDocument, int tnClasse)
    {
        int lnNumWords = toDocument.mxGetNumWords();
        String lsWord = "";
        this.paClasses[tnClasse].mxAddDocument();
                   
        for(int i = 0; i < lnNumWords; i++)
        {
            lsWord = toDocument.paWords.get(i);
            this.pnNumWords++;            
            //Verify if the word is in our vocabulary
            if(this.poVocabulary.containsKey(lsWord))
                this.poVocabulary.put(lsWord, this.poVocabulary.get(lsWord)+1);
            else
                this.poVocabulary.put(lsWord, 1);
            //Add word to class
            this.paClasses[tnClasse].mxAddWord(lsWord);
        }       
        this.pnNumDocs++;
    }
    
    public int mxClassificarNaiveBayesText(Document toDocument)
    {
        int lnNumWords = toDocument.mxGetNumWords();
        String lsWord;
        int lnNumClasses = this.paClasses.length;
        double laProbabilities[] = new double[lnNumClasses];
        
        for(int i = 0; i < lnNumClasses; i++)
            laProbabilities[i] = Math.log(this.paClasses[i].getClassProbability());

        for(int i = 0; i < lnNumWords; i++)
        {
            lsWord = toDocument.paWords.get(i);
            if(this.poVocabulary.containsKey(lsWord))
            {
                for(int j = 0; j < lnNumClasses; j++)
                    laProbabilities[j] += Math.log(this.paClasses[j].mxGetProbability(lsWord));                        
            }
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
        this.paClasses[tnClass].setClassProbability(tnProCla);
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
