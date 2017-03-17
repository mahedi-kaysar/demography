package demograpy.forms.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by mahedi on 3/17/2017.
 */
public class MobileNumberConstraintValidator implements ConstraintValidator<MobileNumberConstraint,Object>{


    @Override
    public void initialize(MobileNumberConstraint constraintAnnotation) {
    }


    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String mobileNumber = (String) value;
        if(mobileNumber.length()==0) return true;
        if(!mobileNumber.startsWith("0") || mobileNumber.length()!=10)
            return false;
        return true;
    }
}
