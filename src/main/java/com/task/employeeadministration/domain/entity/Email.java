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
@Table(name = "emails")
public class Email {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sno;
    @Column(name = "mailid")
    private String mailId;
    private String address;
    private String type;
    @ManyToMany(mappedBy = "emails")
    private List<Employee> employees;
}
