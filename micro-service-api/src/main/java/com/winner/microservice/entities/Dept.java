package com.winner.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yongs
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private static final long serialVersionUID = -4530074361558422392L;

    private Long deptno;
    private String dname;
    private String db_source;

}
