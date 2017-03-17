package demograpy.forms.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by mahedi on 3/17/2017.
 */

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = AgeConstraintValidator.class)
public @interface AgeConstraint {
    String message();
    int age();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
