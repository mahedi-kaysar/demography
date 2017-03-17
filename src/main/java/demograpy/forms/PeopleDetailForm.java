package demograpy.forms;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by mahedi on 3/17/2017.
 */
public class PeopleDetailForm {

    @Size(min=4, max = 20)
    private String name;

    @Size(min=6, max=6)
    private String pps;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

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
        return "PeopleDetailForm{" +
                "name='" + name + '\'' +
                ", pps='" + pps + '\'' +
                ", birthday=" + birthday +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
