package com.task.employeeadministration.domain.request;

import lombok.*;

import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExperienceRequest {

    private CompanyRequest company;
    private String end_date;
    private String start_date;

    private TitleRequest title;

    private List<String> location_names;
    private String is_primary;
    private String summary;
}
