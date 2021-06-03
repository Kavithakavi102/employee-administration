package com.task.employeeadministration.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Location {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sno;
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
