package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionDTO {
    private Long id;

    private CustomerDTO customerDTO;

    private Date createdAt;

    private Date modifiedAt;

    private int status;

}