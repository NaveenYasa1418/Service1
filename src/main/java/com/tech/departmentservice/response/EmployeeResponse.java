package com.tech.departmentservice.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

    private long id;
    private String name;
    private long departmentId;

}
