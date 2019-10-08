package com.oocl.api.entites;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Dept implements Serializable {
    private String deptName;
    private Integer employerNumber;
    private String db_source;

    public Dept(String deptName){
        this.deptName = deptName;
    }
}
