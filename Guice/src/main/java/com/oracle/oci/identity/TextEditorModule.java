package com.oracle.oci.identity;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * @author Amit Chawla
 **/
public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc connection string");
        bind(ISpellChecker.class).to(SpellChecker.class);
        bind(SpellChecker.class).annotatedWith(WinWordAnnotation.class).to(WinWordSpellCheckerImpl.class);
    }
}
