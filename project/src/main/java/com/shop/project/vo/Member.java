package com.shop.project.vo;

// import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
    // @NotNull
    private String id;
    private String pwd;
    private String name;
    private String address;
    private String phone;
    private String email;
}