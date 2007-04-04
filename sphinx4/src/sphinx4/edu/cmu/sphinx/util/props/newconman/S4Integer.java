package edu.cmu.sphinx.util.props.newconman;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An integer property.
 *
 * @author Holger Brandl
 * @see edu.cmu.sphinx.util.props.newconman.ConMan
 */
@Retention(RetentionPolicy.RUNTIME)
@S4Property
public @interface S4Integer {

    int defaultValue();


    int[] range() default {-Integer.MAX_VALUE, Integer.MAX_VALUE};
}
