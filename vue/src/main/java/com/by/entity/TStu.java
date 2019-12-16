package com.by.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (TStu)实体类
 *
 * @author makejava
 * @since 2019-12-12 21:13:27
 */
@Data
public class TStu implements Serializable {
    private static final long serialVersionUID = -70320315003439141L;
    
    private Integer stuId;
    
    private String stuName;
    
    private Integer stuAge;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBir;




}