package com.oracle.oci.identity;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Amit Chawla
 **/
public class TextEditor {
    private SpellChecker spellChecker;

    @Inject
//    public TextEditor(@WinWordAnnotation SpellChecker spellChecker) {
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Main constructor called");
        this.spellChecker = spellChecker;
    }
    @Inject
    public void TextEditor(@Named("JDBC") String dbUrl){
        System.out.println("Jdbc connection established");
        System.out.println(dbUrl);
    }
    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}
