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
public class Profile {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sno;
    @Column(name = "proid")
    private String proId;
    private String network;
    private String id;
    private String url;
    @Column(name = "username")
    private String username;
    @ManyToMany(mappedBy = "profiles")
    private List<Employee> employees;
}
