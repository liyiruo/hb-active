package com.hx.hbactive.service.impl;

import com.hx.hbactive.dao.QAndSDao;
import com.hx.hbactive.service.IQAndS;
import com.hx.hbactive.pojo.QAndS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class QAndSImpl implements IQAndS {

    @Autowired
    private QAndSDao qAndSDao;
    @Override
    public List<QAndS> quertAllInfo() {
        return qAndSDao.quertAllInfo();
    }
}

