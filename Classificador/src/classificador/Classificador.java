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
    
    public void mxAddDocument(String tsPath, int lnClasse)
    {
        this.pnNumDocs++;
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
