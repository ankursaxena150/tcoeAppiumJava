package components.reporting.xray;

import java.lang.annotation.*;

/**
 * A Custom Annotation to inject additional information into a TestNG Test
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Xray {

    String requirement() default "";

    String test() default "";

    String labels() default "";

}