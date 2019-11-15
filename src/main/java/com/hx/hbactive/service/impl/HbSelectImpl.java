package com.hx.hbactive.service.impl;

import com.hx.hbactive.dao.HbSelectDao;
import com.hx.hbactive.pojo.HbSelect;
import com.hx.hbactive.service.IHbSelect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HbSelectImpl implements IHbSelect {
    @Autowired
    HbSelectDao hbSelectDao;
    @Override
    public Integer insertHbSelect(HbSelect hbSelect) {
        return hbSelectDao.insertHbSelect(hbSelect);
    }
}
