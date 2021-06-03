package com.task.employeeadministration.domain.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SuccessResponse {
    private String id;
    private int httpStatus;
}
