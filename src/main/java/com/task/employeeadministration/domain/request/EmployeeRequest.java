package com.task.employeeadministration.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.task.employeeadministration.domain.entity.Education;
import com.task.employeeadministration.domain.entity.Email;
import com.task.employeeadministration.domain.entity.Profile;
import com.task.employeeadministration.domain.entity.Version;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeRequest {

    private int sno;
    private String id;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_initial")
    private String middleInitial;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_name")
    private String lastName;
    private String gender;
    @JsonProperty("birth_year")
    private String birthYear;
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
    private List<String> job_title_levels;
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
    private List<String>  phone_numbers;

    private List<Email> emails;
    private List<String> interests;
    private List<String> skills;
    private List<String> location_names;
    private List<String> regions;
    private List<String> countries;
    private List<String> street_addresses;
    private List<ExperienceRequest> experience;

    private List<Education> education;

    private List<Profile> profiles;

    private Version version_status;
}
