package com.task.employeeadministration.domain.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CompanyRequest {

    private int sno;
    private String name;
    private String size;
    private String id;
    private String linkedin_url;
    private String facebook_url;
    private String twitter_url;
    private String linkedin_id;
    private String website;
    private String founded;
    private String industry;
    private LocationRequest location;
}
