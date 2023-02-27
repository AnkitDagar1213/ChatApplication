package com.example.ChatApplication.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="User_Id")
    private int userId;
    @Column(name="User_Name")
    private String Username;
    @Column
    private String password;
    @Column(name="First_Name")
    private String firstname;
    @Column(name="")
    private String lastname;
    @Column
    private String email;
    @Column
    private String phonenumber;
    @Column
    private String gender;
    @Column(name="")
    private Integer age;
    private Timestamp Created_date;
    private Timestamp Update_date;
    @Column(name="")
    @ManyToOne
    private Status statusId;
}
