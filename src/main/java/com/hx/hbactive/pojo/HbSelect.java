package com.hx.hbactive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HbSelect {

    /**
     * ACTIVE_ID   VARCHAR2(20) not null,
     * QUESTION_ID VARCHAR2(20) not null,
     * SELECT_ID   VARCHAR2(20) not null,
     * SELECT_DESC VARCHAR2(20),
     * TEMP        VARCHAR2(4000),
     * CREATE_DATE DATE,
     * UPDATE_DATE DATE
     */
    private String activeId;
    private String questionId;
    private String selectId;
    private String selectDesc;
    private String temp;
    private Date createDate;
    private Date updateDate;

}
