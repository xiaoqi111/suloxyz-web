package com.suloxyz.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class CorporatePartner {

    @TableId(type = IdType.AUTO)
    private Integer id ;
    private String name ;
    private String companyName ;
    private Integer number ;
    private String title ;
    @Email
    private String email ;
    private String phoneNumber ;
    private String location ;
    private String description ;

}
