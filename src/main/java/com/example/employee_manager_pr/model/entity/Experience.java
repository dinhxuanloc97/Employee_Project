package com.example.employee_manager_pr.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "part") //vi tri lam viec
    private String part;
    @Column(name = "scale") // so luong nguoi tham gia du an
    private int scale;
    @Column(name = "language")
    private String language;
    @Column(name = "framework")
    private int framework;
    @Column(name = "os")
    private String os;
    @Column(name = "start_work")
    private Date startWork;
    @Column(name = "end_work")
    private Date endWork;
    @Column(name = "content")
    private String content;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    private String url;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
