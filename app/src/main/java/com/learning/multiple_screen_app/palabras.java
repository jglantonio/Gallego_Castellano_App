package com.learning.multiple_screen_app;

/**
 * Created by jose on 9/03/17.
 */

public class palabras {
    private String mSpanishTranslation;
    private String mGalicianTranslation;
    public palabras(String spanishTranslation , String galicianTranslation){
        this.mGalicianTranslation = galicianTranslation;
        this.mSpanishTranslation = spanishTranslation;
    }
    public String getSpanishTranslation(){
        return this.mSpanishTranslation;
    }
    public String getGalicianTranslation(){
        return this.mGalicianTranslation;
    }
}
