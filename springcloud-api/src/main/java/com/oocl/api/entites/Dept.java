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

    public Dept(String deptName,String db_source){
        this.deptName = deptName;
        this.db_source = db_source;
    }
}
