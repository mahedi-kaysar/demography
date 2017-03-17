package demograpy.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by mahedi on 3/16/2017.
 */
public class Person {
    private String name;
    private String pps;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String mobileNumber;

    public Person(){ }
    public Person(String name, String pps, Date birthday, String mobileNumber) {
        this.name = name;
        this.pps = pps;
        this.birthday = birthday;
        this.mobileNumber = mobileNumber;
    }

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
        return "Person{" +
                "name='" + name + '\'' +
                ", pps='" + pps + '\'' +
                ", birthday=" + birthday +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
