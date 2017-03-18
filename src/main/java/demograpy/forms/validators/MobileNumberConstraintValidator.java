package demograpy.forms.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by mahedi on 3/17/2017.
 */
public class MobileNumberConstraintValidator implements ConstraintValidator<MobileNumberConstraint,Object>{

    int digits;
    @Override
    public void initialize(MobileNumberConstraint constraintAnnotation) {
        this.digits = constraintAnnotation.digits();
    }


    /**
     *
     * @param value
     * @param context
     * @return true if empty or num digits is equal 10
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String mobileNumber = (String) value;
        if(mobileNumber.length()==0) return true;
        if(!mobileNumber.startsWith("08") || mobileNumber.length()!=digits)
            return false;
        return true;
    }
}
