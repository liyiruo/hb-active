package com.hx.hbactive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QAndS {
 private String activeId;
 private String activeName;
 private String activeDesc;
 private String questionId;
 private String questtionDesc;
 private String selectId;
 private String selectDesc;


 /**
  * a.active_id,a.active_name,a.active_desc,q.question_id,q.questtion_desc,s.select_id,s.select_desc
  */
}
