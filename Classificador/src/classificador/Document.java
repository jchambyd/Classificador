/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author jorge
 */
public class Document {
    public ArrayList<String> paWords;
    private int pnNumWords;
    private String psPath;
    
    public Document()
    {
        this.paWords = new ArrayList();
        this.pnNumWords = 0;
    }
    
    public Document(String tsPath)
    {
        this.paWords = new ArrayList();
        this.pnNumWords = 0;
        this.psPath = tsPath;
        this.mxLoadDocument();        
    }
    
    void mxLoadDocument()
    {
        File file = new File(this.psPath);
        Scanner loScan;
        String lsLine, lsWord;
        StringTokenizer loToken;
        
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
                    //Add word to document
                    this.pnNumWords++;                    
                    this.paWords.add(lsWord);
                }
            }
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
    
    void mxAddWord(String tsWord)
    {
        this.paWords.add(tsWord);
    }
    
    int mxGetNumWords()
    {
        return this.pnNumWords;
    }
}
