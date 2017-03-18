package demograpy.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Comparator;

/**
 * The class represent a Person Entity,
 * Analogous to person table
 *
 * need to define the JPA annotations
 *
 * Created by mahedi on 3/16/2017.
 */
@Entity
@Table(name = "persons")
public class Person implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false, unique = true)
    private Long pps;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private LocalDate birthday;

    @Column
    private String mobileNumber="08";

    @Column(nullable = false)
    private LocalDateTime createTime = LocalDateTime.now();
    public Person(){ }
    public Person(String name, Long pps, LocalDate birthday, String mobileNumber) {
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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


//    @Override
//    public int compareTo(Person that) {
//
//        LocalDateTime thisDateTime = this.getCreateTime();
//        LocalDateTime thatDateTime = that.getCreateTime();
//        if(thisDateTime.isAfter(thatDateTime))
//            return -1;
//        else if(thatDateTime.isAfter(thisDateTime))
//            return 1;
//        return 0;
//    }
}
