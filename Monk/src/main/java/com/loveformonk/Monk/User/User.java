package com.loveformonk.Monk.User;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity                                 // Maps the user to the database (For hibernate)
@Table(name = "users")                                          // For table in our database
public class User {

    @Id                                                         // We tell that this is gonna be id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(                                            // Used with primary keys, generates keys
            strategy = GenerationType.SEQUENCE,                 // This uses database sequence to generate values
            generator = "user_sequence"
    )
    private Long user_id;
    private String user_name;
    private LocalDate date_of_birth;
    @Transient
    private Integer age;                                        // We can calculate this on the basis of DOB
    private String email;
    private String profession_or_education;
    private String reason_of_stress;


    public User(Long user_id, String user_name, LocalDate date_of_birth, String email, String profession_or_education, String reason_of_stress) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.profession_or_education = profession_or_education;
        this.reason_of_stress = reason_of_stress;
    }

    public User() {
    }

    public User(String user_name,
                LocalDate date_of_birth,
                String email,
                String profession_or_education,
                String reason_of_stress) {
        this.user_name = user_name;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.profession_or_education = profession_or_education;
        this.reason_of_stress = reason_of_stress;
    }

    public Integer getAge() {

        return Period.between(this.date_of_birth, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession_or_education() {
        return profession_or_education;
    }

    public void setProfession_or_education(String profession_or_education) {
        this.profession_or_education = profession_or_education;
    }

    public String getReason_of_stress() {
        return reason_of_stress;
    }

    public void setReason_of_stress(String reason_of_stress) {
        this.reason_of_stress = reason_of_stress;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", profession_or_education='" + profession_or_education + '\'' +
                ", reason_of_stress='" + reason_of_stress + '\'' +
                '}';
    }
}
