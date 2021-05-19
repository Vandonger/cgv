package com.onemount.cgv.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private Long id;

    private CustomerDTO customerDTO;

    private List<OrderLineDTO> orderLineDTOS;

    private Date createdAt;

    private Date modifiedAt;

    private float totalAmount;

    private int status;
}
