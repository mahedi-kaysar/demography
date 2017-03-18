package demograpy.forms;

import demograpy.forms.validators.AgeConstraint;
import demograpy.forms.validators.MobileNumberConstraint;
import demograpy.forms.validators.PPSConstraint;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * Created by mahedi on 3/17/2017.
 */
public class PersonDetailForm {

    @NotEmpty @Size(max=25, message = "Max 25 Characters")
    private String name;

    @NotNull
    @PPSConstraint
    private Long pps;

    @NotNull @DateTimeFormat(pattern = "yyyy-MM-dd")
    @AgeConstraint(age = 16, message = "may not be over 16 years old")
    private LocalDate birthday;

    @MobileNumberConstraint(digits = 10, message = "Must begin with 08 prefix and 10 digits")
    private String mobileNumber="08";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPps() {
        return pps;
    }

    public void setPps(Long pps) {
        this.pps = pps;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "PersonDetailForm{" +
                "name='" + name + '\'' +
                ", pps='" + pps + '\'' +
                ", birthday=" + birthday +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
