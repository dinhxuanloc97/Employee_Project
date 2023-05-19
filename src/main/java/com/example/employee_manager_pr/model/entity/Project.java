package com.example.employee_manager_pr.model.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "leader_id")
    private int leaderId;
    @Column(name = "part") //vi tri lam viec
    private String part;
    @Column(name = "scale") // so luong nguoi tham gia du an
    private int scale;
    @Column(name = "language")
    private String language;
    @Column(name = "framework")
    private String framework;
    @Column(name = "content")
    private String content;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    private String url;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
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
}
