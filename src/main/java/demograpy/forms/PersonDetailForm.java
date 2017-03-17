package demograpy.forms;

import demograpy.forms.validators.AgeConstraint;
import demograpy.forms.validators.MobileNumberConstraint;
import demograpy.forms.validators.PPSConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

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
    @Past(message = "Birthday should be past")
    @AgeConstraint(age = 16,message = "You should be at least 16 years older")
    private Date birthday;

    @MobileNumberConstraint(message = "Digits must be 0 or 11 and start with ZERO.")
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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
