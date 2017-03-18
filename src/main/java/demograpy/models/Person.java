package demograpy.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * The class represent a Person Entity,
 * Analogous to person table
 *
 * need to define the JPA annotations
 *
 * Created by mahedi on 3/16/2017.
 */
public class Person {

    private String name;
    private String pps;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String mobileNumber="08";

    public Person(){ }
    public Person(String name, String pps, LocalDate birthday, String mobileNumber) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", pps='" + pps + '\'' +
                ", birthday=" + birthday +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
