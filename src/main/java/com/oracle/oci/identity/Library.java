package com.oracle.oci.identity;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.Builder;

import javax.annotation.Nullable;

/**
 * Hello world!
 *
 */
@Builder
public class Library
{
    private final Injector injector;

    public Library(Injector injector) {

        this.injector = injector;
    }

    public static class LibraryBuilder{
        public Library Build(){
            Injector injector = Guice.createInjector(new TextEditorModule());
            return new Library(injector);
        }
    }
    public void doSpellCheck() {
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}
