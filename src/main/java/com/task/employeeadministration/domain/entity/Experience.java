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
public class Experience {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sno;
    @Column(name = "expid")
    private String expId;
    private String name;
    private String size;
    private String id;
    private String founded;
    private String industry;
    private String lname;
    private String locality;
    private String egion;
    private String country;
    private String continent;
    private String street_address;
    private String address_line_2;
    private String postal_code;
    private String geo;
    private String linkedin_url;
    private String linkedin_id;
    private String facebook_url;
    private String twitter_url;
    private String website;
    private String location_names;
    private String end_date;
    private String start_date;
    private String title_name;
    private String title_role;
    private String title_level;
    private String is_primary;
    private String summary;
    @ManyToMany(mappedBy = "experience")
    private List<Employee> employees;
}
