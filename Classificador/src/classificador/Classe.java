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
public class Classe 
{
    private String psName;
    private int pnNumWords;
    private int pnNumDoc;
    private float pnProbClasse;
    private Hashtable <String,Integer> poWords;
    private Hashtable <String,Float> poProbWord;
    
    public Classe(String tsName)
    {
        this.psName = tsName;
        this.mxInitializeProperties();
    }
    public void mxInitializeProperties()
    {
        this.pnNumWords = 0;
        this.pnNumDoc = 0;
        this.pnProbClasse = 0.0F;
        this.poWords = new Hashtable<String,Integer>();
        this.poProbWord = new Hashtable<String,Float>();
    }
    public void setClassProbability(float tnProCla)
    {
        this.pnProbClasse = tnProCla;
    }
    public float getClassProbability()
    {
        return this.pnProbClasse;
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
    
    public float mxGetProbability(String tsWord)
    {        
        return this.poProbWord.get(tsWord);
    }   
}
