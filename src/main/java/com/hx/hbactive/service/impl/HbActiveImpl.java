package com.hx.hbactive.service.impl;

import com.hx.hbactive.dao.HbActiveDao;
import com.hx.hbactive.pojo.HbActive;
import com.hx.hbactive.service.IHbActive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HbActiveImpl implements IHbActive {
    @Autowired
    private HbActiveDao hbActiveDao;

    @Override
    public Integer insertHbActive(HbActive hbActive) {
        return hbActiveDao.insertHbActive(hbActive);
    }


    @Override
    public HbActive getInsertHbActive(HbActive hbActive) {
        insertHbActive(hbActive);
        String activeId = hbActiveDao.getSeqCurrval();
        return getHbActiveById(activeId);
    }

    @Override
    public List<HbActive> getHbActive() {
        return hbActiveDao.getHbActive();
    }

    @Override
    public Integer updateHbActive(HbActive hbActive) {
        return hbActiveDao.updateHbActive(hbActive);
    }

    @Override
    public HbActive getHbActiveById(String activeId) {
        return hbActiveDao.getHbActiveById(activeId);
    }
}
