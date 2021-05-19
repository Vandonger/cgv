package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private Long id;

    private String fullName;
    private String firstName;

    private String lastName;

    private String sex;

    private String email;

    private String mobile;

    private String password;

    private Timestamp dob;

    private Long point;

    private Level level;

    private int status;

    private List<OrderDTO> orderDTOS;

    private List<TransactionDTO> transactionDTOS;

    private Date createdAt;

    private Date modifiedAt;

}