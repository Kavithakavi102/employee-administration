package com.task.employeeadministration.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "main1")
public class Employee {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sno;
    private String id;
    private String full_name;
    private String first_name;
    private String middle_initial;
    private String middle_name;
    private String last_name;
    private String gender;
    private String birth_year;
    private String birth_date;
    private String linkedin_url;
    private String linkedin_username;
    private String linkedin_id;
    private String facebook_url;
    private String facebook_username;
    private String facebook_id;
    private String twitter_url;
    private String twitter_username;
    private String github_url;
    private String github_username;
    private String work_email;
    private String mobile_phone;
    private String industry;
    private String job_title;
    private String job_title_role;
    private String job_title_sub_role;
    private String job_title_levels;
    private String job_company_id;
    private String job_company_name;
    private String job_company_website;
    private String job_company_size;
    private String job_company_founded;
    private String job_company_industry;
    private String job_company_linkedin_url;
    private String job_company_linkedin_id;
    private String job_company_facebook_url;
    private String job_company_twitter_url;
    private String job_company_location_name;
    private String job_company_location_locality;
    private String job_company_location_region;
    private String job_company_location_geo;
    private String job_company_location_street_address;
    private String job_company_location_address_line_2;
    private String job_company_location_postal_code;
    private String job_company_location_country;
    private String job_company_location_continent;
    private String job_last_updated;
    private String job_start_date;
    private String job_summary;
    private String location_name;
    private String location_locality;
    private String location_region;
    private String location_country;
    private String location_continent;
    private String location_street_address;
    private String location_address_line_2;
    private String location_postal_code;
    private String location_geo;
    private String location_last_updated;
    private String inferred_salary;
    private String inferred_years_experience;
    private String summary;
    private String  phone_numbers;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "email_link",
            joinColumns = @JoinColumn(name = "Employee_id",  referencedColumnName = "sno"),
            inverseJoinColumns = @JoinColumn(name = "sno",  referencedColumnName = "sno"))
    private List<Email> emails;
    private String interests;
    private String skills;
    private String location_names;
    private String regions;
    private String countries;
    private String street_addresses;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "experience_link",
            joinColumns = @JoinColumn(name = "Employee_id"),
            inverseJoinColumns = @JoinColumn(name = "experience_id"))
    private List<Experience> experience;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "education_link",
            joinColumns = @JoinColumn(name = "Employee_id"),
            inverseJoinColumns = @JoinColumn(name = "education_id"))
    private List<Education> education;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "profile_link",
            joinColumns = @JoinColumn(name = "Employee_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private List<Profile> profiles;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sno")
    private Version version_status_sno;

}
