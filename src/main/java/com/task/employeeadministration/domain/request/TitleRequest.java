package com.task.employeeadministration.domain.request;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TitleRequest {
    private int sno;
    private String name;
    private String role;
    private String sub_role;
    private List<String> levels;
}
