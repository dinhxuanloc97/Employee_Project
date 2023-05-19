package com.example.employee_manager_pr.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProjectMemberId implements Serializable {
    @Column(name = "employee_id")
    int employeeId;
    @Column(name = "project_id")
    int projectId;
}
