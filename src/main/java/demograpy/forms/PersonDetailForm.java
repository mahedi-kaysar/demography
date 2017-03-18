package demograpy.forms;

import demograpy.forms.validators.AgeConstraint;
import demograpy.forms.validators.MobileNumberConstraint;
import demograpy.forms.validators.PPSConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * Created by mahedi on 3/17/2017.
 */
public class PersonDetailForm {

    @NotNull @Size(min=4, message = "Length should be between 4 to 20")
    private String name;

    @NotNull @Size(min=6, max=6,message = "PPS must be 6 digits")
    @PPSConstraint(message = "PPS is already registered or its invalid(If starts with ZERO)")
    private String pps;

    @NotNull @DateTimeFormat(pattern = "yyyy-MM-dd")
    @AgeConstraint(age = 16,message = "You should be at least 16 years older")
    private LocalDate birthday;

    @MobileNumberConstraint(message = "Num digits either 0 or 11 (must start with 0)")
    private String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
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
