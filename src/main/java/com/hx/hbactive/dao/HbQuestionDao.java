package com.hx.hbactive.dao;

import com.hx.hbactive.pojo.HbQuestion;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HbQuestionDao {
    Integer insertHbQuestion(HbQuestion hbQuestion);
}
