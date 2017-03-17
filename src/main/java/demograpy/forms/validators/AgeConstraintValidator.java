package demograpy.forms.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

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

    @Override
    public boolean isValid(Object date, ConstraintValidatorContext context) {
        if(date==null) return false;
        Date inputDate = (Date) date;
        Calendar cal = Calendar.getInstance();
        cal.setTime(inputDate);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month,day);
        Period p = Period.between(birthday,today);
        System.out.println("Input Age="+p.getYears());
        System.out.println("Required Age="+age);
        return p.getYears()>=age;
    }
}
