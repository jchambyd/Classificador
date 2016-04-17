/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificador;

import java.util.Hashtable;

/**
 *
 * @author jorge
 */
public class Classe {
    private String psName = "";
    private int pnNumWords = 0;
    private int pnNumDoc = 0;
    private float pnProbClasse = 0.0F;
    private Hashtable <String,Integer> poWords = new Hashtable<String,Integer>();
    private Hashtable <String,Float> poProbWord = new Hashtable<String,Float>();
    
    public Classe(String tsName)
    {
        this.psName = tsName;        
    }
    public void mxAddDocument()
    {
        this.pnNumDoc++;
    }
    public void mxAddWord(String psWord)
    {
        if(this.poWords.containsKey(psWord))
            this.poWords.put(psWord, this.poWords.get(psWord)+1);
        else
            this.poWords.put(psWord, 1);
        
        this.pnNumWords++;
    }
    
    public void mxCalculateProb(String tsWord, int tnLenVocabulary)
    {
        float lnProbabi = 0.0f;
        //Number of times word "tsWord" occurs
        Integer lnCountWord = this.poWords.get(tsWord);
        if(lnCountWord == null)
            lnCountWord = 0;
        
        lnProbabi = (float)(1 + lnCountWord)/(float)(this.pnNumWords + tnLenVocabulary);
        this.poProbWord.put(tsWord, lnProbabi);
    }
    public void setProbClass(float tnProCla)
    {
        this.pnProbClasse = tnProCla;
    }
    
    public float mxGetProbability(String tsWord)
    {        
        return this.poProbWord.get(tsWord);
    }
    public float mxGetClassProbability()
    {
        return this.pnProbClasse;
    }
}
