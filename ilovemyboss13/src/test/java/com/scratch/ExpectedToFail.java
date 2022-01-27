
package com.scratch;

import java.lang.annotation.*;


/**
 * @author emaph
 */
@Retention(RetentionPolicy.RUNTIME)
@Target((ElementType.METHOD))
public @interface ExpectedToFail {

}
