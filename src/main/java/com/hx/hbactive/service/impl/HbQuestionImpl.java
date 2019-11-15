package com.hx.hbactive.service.impl;

import com.hx.hbactive.dao.HbQuestionDao;
import com.hx.hbactive.pojo.HbQuestion;
import com.hx.hbactive.service.IHbQuestion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class HbQuestionImpl implements IHbQuestion {
    @Autowired
    private HbQuestionDao hbQuestionDao;
    @Override
    public Integer insertHbQuestion(HbQuestion hbQuestion) {
        return hbQuestionDao.insertHbQuestion(hbQuestion);
    }

}
