package demograpy.forms.validators;

import demograpy.models.Person;
import demograpy.services.PeopleInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by mahedi on 3/17/2017.
 */
public class PPSConstraintValidator implements ConstraintValidator<PPSConstraint,Object> {

    @Autowired
    PeopleInfoService peopleInfoService;

    @Override
    public void initialize(PPSConstraint constraintAnnotation) {

    }

    /**
     *
     * @param value
     * @param context
     * @return true if not available in the peopleInfoService
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String pps = (String) value;
        if(pps.startsWith("0")) return false;
        Person person = peopleInfoService.findByPPS(pps);
        return person==null;
    }
}
