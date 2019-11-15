package com.hx.hbactive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HbQuestion {
/**
 * ACTIVE_ID      VARCHAR2(20) not null,
 *   QUESTION_ID    VARCHAR2(20) not null,
 *   QUESTTION_DESC VARCHAR2(500),
 *   CREATE_DATE    DATE,
 *   UPDATE_DATE    DATE,
 *   TEMP           VARCHAR2(4000)
 */
    private String activeId;
    private String questionId;
    private String questionDesc;
    private Date createDate;
    private Date updateDate;
    private String temp;

}
