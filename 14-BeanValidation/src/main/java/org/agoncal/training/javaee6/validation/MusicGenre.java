package org.agoncal.training.javaee6.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

/**
 * @author Antonio Goncalves
 *         Training - Beginning with The Java EE 6 Platform
 *         http://www.antoniogoncalves.org
 *         --
 */
@Pattern(regexp = "[A-Z][a-z]{1,}")
@Size(min = 3, max = 20)
@Constraint(validatedBy = {})
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MusicGenre {

    String message() default "Wrong music genre";

    Class<? extends Payload>[] payload() default {};

    Class<?>[] groups() default {};
}
