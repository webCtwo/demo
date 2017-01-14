package com.fz.model;


import lombok.Data;

import java.util.List;

/**
 * Created by Sir.Cui on 2017/1/13 12:01.
 */
@Data
public class User {
    private int id;
    private String name;
    private String pass;
    private List<Role> roles;
}
