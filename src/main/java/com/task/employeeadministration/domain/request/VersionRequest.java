package com.task.employeeadministration.domain.request;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VersionRequest {
    private String status;
    private List<String> contains;
    private String previous_version;
    private String current_version;
}
