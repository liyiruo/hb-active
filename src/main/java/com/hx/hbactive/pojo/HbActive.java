package com.hx.hbactive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HbActive {
    /**
     ACTIVE_ID   VARCHAR2(20) not null,
     ACTIVE_NAME VARCHAR2(200),
     ACTIVE_DESC VARCHAR2(4000),
     CREATE_DATE DATE,
     UPDATE_DATE DATE
     **/
    private String activeId;
    private String activeName;
    private String activeDesc;
    private Date createDate;
    private Date updateDate;

}



