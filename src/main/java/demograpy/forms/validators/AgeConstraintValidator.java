package demograpy.forms.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by mahedi on 3/17/2017.
 */
public class AgeConstraintValidator implements ConstraintValidator<AgeConstraint,Object>{

    private String message;
    private int age;
    @Override
    public void initialize(AgeConstraint constraintAnnotation) {
        this.message = constraintAnnotation.message();
        this.age = constraintAnnotation.age();
    }

    /**
     * This method validate a date by
     *  checking future date, checking given age limit and empty date
     * @param localDate
     * @param context
     * @return true if valid, otherwise false
     */
    @Override
    public boolean isValid(Object localDate, ConstraintValidatorContext context) {
        // if no date has been selected in the form
        if(localDate==null) return false;
        LocalDate inputDate = (LocalDate) localDate;
        LocalDate today = LocalDate.now();
        Period p = Period.between(inputDate,today);
        return p.getYears()>=age;
    }
}
