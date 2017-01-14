package com.fz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by Sir.Cui on 2017/1/12 10:09.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private int id;
    private String name;
    private String account;
    private String pass;
    private Address address;
    private List<Order> orders;
}
