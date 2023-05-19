package com.example.employee_manager_pr.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "citizen_id", unique = true)
    private String citzenId;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "sex")
    private int sex;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "nation")
    private String nation;
    @Column(name = "address")
    private String address;
    @Column(name = "issued_on")
    private Date issuedOn;
    @Column(name = "issued_by")
    private String issueBy;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "start_work")
    private Date startWork;
    @Column(name = "end_work")
    private Date endWork;
    @Column(name = "coefficients_salary")
    private float coefficientsSalary;
    @Column(name = "education")
    private String education;
    @Column(name = "role")
    private String role;
    @Column(name = "access_token")
    private String accessToken;
    @Column(name = "status")
    private int status;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Certificate> certificateList = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Experience> exp = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Skill> skill = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Notification> notification = new ArrayList<>();
}
