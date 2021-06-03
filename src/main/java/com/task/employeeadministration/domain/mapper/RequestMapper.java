package com.task.employeeadministration.domain.mapper;

import com.task.employeeadministration.domain.entity.Employee;
import com.task.employeeadministration.domain.entity.Experience;
import com.task.employeeadministration.domain.request.EmployeeRequest;
import com.task.employeeadministration.domain.request.ExperienceRequest;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Component
public class RequestMapper {
    public Employee mapRequestToEntity(EmployeeRequest employeeRequest) {

        Employee employee = Employee.builder()
                .id(employeeRequest.getId())
                .full_name(employeeRequest.getFullName())
                .first_name(employeeRequest.getFirstName())
                .middle_initial(employeeRequest.getMiddleInitial())
                .middle_name(employeeRequest.getMiddleName())
                .last_name(employeeRequest.getLastName())
                .gender(employeeRequest.getGender())
                .birth_year(employeeRequest.getBirthYear())
                .birth_date(employeeRequest.getBirth_date())
                .linkedin_url(employeeRequest.getLinkedin_url())
                .linkedin_username(employeeRequest.getLinkedin_username())
                .linkedin_id(employeeRequest.getLinkedin_id())
                .facebook_url(employeeRequest.getFacebook_url())
                .facebook_username(employeeRequest.getFacebook_username())
                .facebook_id(employeeRequest.getFacebook_id())
                .twitter_url(employeeRequest.getTwitter_url())
                .twitter_username(employeeRequest.getTwitter_username())
                .github_url(employeeRequest.getGithub_url())
                .github_username(employeeRequest.getGithub_username())
                .work_email(employeeRequest.getWork_email())
                .mobile_phone(employeeRequest.getMobile_phone())
                .industry(employeeRequest.getIndustry())
                .job_title(employeeRequest.getJob_title())
                .job_title_role(employeeRequest.getJob_title_role())
                .job_title_sub_role(employeeRequest.getJob_title_sub_role())
                .job_title_levels(listToString(employeeRequest.getJob_title_levels()))
                .job_company_id(employeeRequest.getJob_company_id())
                .job_company_name(employeeRequest.getJob_company_name())
                .job_company_website(employeeRequest.getJob_company_website())
                .job_company_size(employeeRequest.getJob_company_size())
                .job_company_founded(employeeRequest.getJob_company_founded())
                .job_company_industry(employeeRequest.getJob_company_industry())
                .job_company_linkedin_url(employeeRequest.getJob_company_linkedin_url())
                .job_company_linkedin_id(employeeRequest.getJob_company_linkedin_id())
                .job_company_facebook_url(employeeRequest.getJob_company_facebook_url())
                .job_company_twitter_url(employeeRequest.getJob_company_twitter_url())
                .job_company_location_name(employeeRequest.getJob_company_location_name())
                .job_company_location_locality(employeeRequest.getJob_company_location_locality())
                .job_company_location_region(employeeRequest.getJob_company_location_region())
                .job_company_location_geo(employeeRequest.getJob_company_location_geo())
                .job_company_location_street_address(employeeRequest.getJob_company_location_street_address())
                .job_company_location_address_line_2(employeeRequest.getJob_company_location_address_line_2())
                .job_company_location_postal_code(employeeRequest.getJob_company_location_postal_code())
                .job_company_location_country(employeeRequest.getJob_company_location_country())
                .job_company_location_continent(employeeRequest.getJob_company_location_continent())
                .job_last_updated(employeeRequest.getJob_last_updated())
                .job_start_date(employeeRequest.getJob_start_date())
                .job_summary(employeeRequest.getJob_summary())
                .location_name(employeeRequest.getLocation_name())
                .location_locality(employeeRequest.getLocation_locality())
                .location_region(employeeRequest.getLocation_region())
                .location_country(employeeRequest.getLocation_country())
                .location_continent(employeeRequest.getLocation_continent())
                .location_street_address(employeeRequest.getLocation_street_address())
                .location_address_line_2(employeeRequest.getLocation_address_line_2())
                .location_postal_code(employeeRequest.getLocation_postal_code())
                .location_geo(employeeRequest.getLocation_geo())
                .location_last_updated(employeeRequest.getLocation_last_updated())
                .inferred_salary(employeeRequest.getInferred_salary())
                .inferred_years_experience(employeeRequest.getInferred_years_experience())
                .summary(employeeRequest.getSummary())
                .phone_numbers(listToString(employeeRequest.getPhone_numbers()))
                .emails(employeeRequest.getEmails())
                .interests(listToString(employeeRequest.getInterests()))
                .skills(listToString(employeeRequest.getSkills()))
                .location_names(listToString(employeeRequest.getLocation_names()))
                .regions(listToString(employeeRequest.getRegions()))
                .countries(listToString(employeeRequest.getCountries()))
                .street_addresses(listToString(employeeRequest.getStreet_addresses()))
                .experience(buildExperienceMapper(employeeRequest.getExperience()))
                .education(employeeRequest.getEducation())
                .profiles(employeeRequest.getProfiles())
                .version_status_sno(employeeRequest.getVersion_status())
                .build();
        return  employee;
    }

    private List<Experience> buildExperienceMapper(List<ExperienceRequest> experienceRequests) {
        List<Experience> experiences = new ArrayList<>();
        for (ExperienceRequest experienceRequest:experienceRequests) {
            Experience experience = Experience.builder()
                    .expId(experienceRequest.getCompany().getId())
                    .name(experienceRequest.getCompany().getName())
                   .size(experienceRequest.getCompany().getSize())
                   .id(experienceRequest.getCompany().getId())
                   .founded(experienceRequest.getCompany().getFounded())
                   .industry(experienceRequest.getCompany().getIndustry())
                   .lname(experienceRequest.getCompany().getLocation().getName())
                   .locality(experienceRequest.getCompany().getLocation().getLocality())
                   .egion(experienceRequest.getCompany().getLocation().getRegion())
                   .country(experienceRequest.getCompany().getLocation().getCountry())
                   .continent(experienceRequest.getCompany().getLocation().getContinent())
                   .street_address(experienceRequest.getCompany().getLocation().getStreet_address())
                   .address_line_2(experienceRequest.getCompany().getLocation().getAddress_line_2())
                   .postal_code(experienceRequest.getCompany().getLocation().getPostal_code())
                   .geo(experienceRequest.getCompany().getLocation().getGeo())
                   .linkedin_url(experienceRequest.getCompany().getLinkedin_url())
                   .linkedin_id(experienceRequest.getCompany().getLinkedin_id())
                   .facebook_url(experienceRequest.getCompany().getFacebook_url())
                   .twitter_url(experienceRequest.getCompany().getTwitter_url())
                   .website(experienceRequest.getCompany().getWebsite())
                   .location_names(listToString(experienceRequest.getLocation_names()))
                   .end_date(experienceRequest.getEnd_date())
                   .start_date(experienceRequest.getStart_date())
                   .title_name(experienceRequest.getTitle().getName())
                   .title_role(experienceRequest.getTitle().getRole())
                   .title_level(listToString(experienceRequest.getTitle().getLevels()))
                   .is_primary(experienceRequest.getIs_primary())
                   .summary(experienceRequest.getSummary())
                    .build();
            experiences.add(experience);
        }
        return experiences;
    }

    private String listToString(List data){
            String delimiter = ",";
            String response = String.join(delimiter, data);
            return response;
    }
}
