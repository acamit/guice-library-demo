package com.oracle.oci.identity;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Amit Chawla
 **/
@BindingAnnotation @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD}) @Retention(RetentionPolicy.RUNTIME)
@interface WinWordAnnotation {
}
