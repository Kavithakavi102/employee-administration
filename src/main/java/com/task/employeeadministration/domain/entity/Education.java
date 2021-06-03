package com.task.employeeadministration.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Education {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sno;
    @Column(name = "eduid")
    private String eduId;
    private String name;
    private String type;
    private String id;
    private String linkedin_url;
    private String facebook_url;
    private String twitter_url;
    private String linkedin_id;
    private String website;
    private String domain;
    private String location;
    private String degrees;
    private String majors;
    private String minors;
    private String start_date;
    private String end_date;
    private String gpa;
    private String summary;
    @ManyToMany(mappedBy = "experience")
    private List<Employee> employees;
}
