package com.task.employeeadministration.domain.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LocationRequest {
    private String name;
    private String locality;
    private String region;
    private String country;
    private String continent;
    private String street_address;
    private String address_line_2;
    private String postal_code;
    private String geo;
}
