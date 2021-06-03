package com.task.employeeadministration.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Version {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int sno;
    private String status;
    @JsonIgnore
    private String contains;
    private String previous_version;
    private String current_version;
}
