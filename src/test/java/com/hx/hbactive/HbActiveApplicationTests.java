package com.hx.hbactive;

import com.hx.hbactive.dao.HbActiveDao;
import com.hx.hbactive.dao.QAndSDao;
import com.hx.hbactive.pojo.HbActive;
import com.hx.hbactive.pojo.HbQuestion;
import com.hx.hbactive.pojo.HbSelect;
import com.hx.hbactive.pojo.QAndS;
import com.hx.hbactive.service.impl.HbActiveImpl;
import com.hx.hbactive.service.impl.HbQuestionImpl;
import com.hx.hbactive.service.impl.HbSelectImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@SpringBootTest
class HbActiveApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {

    }

    @Test
    void connect() throws Exception {
        Connection connection = dataSource.getConnection();
        log.info("连接成功了吗:{}", connection);
    }

    @Autowired
    HbActiveDao hbActiveDao;
    @Autowired
    HbActiveImpl hbActiveImpl;
    @Autowired
    HbQuestionImpl hbQuestionImpl;
    @Autowired
    HbSelectImpl hbSelectImpl;

    @Test
    void insert() {
        HbActive hbActive = new HbActive();
        hbActive.setActiveName("999");
        hbActive.setActiveDesc("999");
        Integer i = hbActiveDao.insertHbActive(hbActive);
        log.info("=================================>{}", i);
    }

    @Test
    void select() {
        List<HbActive> hbActives = hbActiveDao.getHbActive();
        for (int i = 0; i < hbActives.size(); i++) {
            log.info("hbActive=====>{}", hbActives.get(i));
        }
    }

    @Test
    void selectService() {
        List<HbActive> hbActives = hbActiveImpl.getHbActive();

        for (int i = 0; i < hbActives.size(); i++) {
            log.info("hbActive=====>{}", hbActives.get(i));
        }
    }


    @Test
    void update() {

        HbActive hbActive = hbActiveDao.getHbActiveById("0000000096");
        hbActive.setActiveName("活动3");
        hbActive.setActiveDesc("描述3");
        Integer i = hbActiveDao.updateHbActive(hbActive);
        HbActive newHbActive = hbActiveDao.getHbActiveById("0000000096");
        log.info("newHbActive=====>修改后：{}", newHbActive);
    }


    @Test
    void insertHbQuestion() {
        HbQuestion hbQuestion = new HbQuestion();
        hbQuestion.setActiveId("777");
        hbQuestion.setQuestionId("77777");
        hbQuestion.setQuestionDesc("这是一个测试的描述");
        hbQuestion.setTemp("temp");
        hbQuestion.setCreateDate(new Date());
        hbQuestion.setUpdateDate(new Date());
        Integer i = hbQuestionImpl.insertHbQuestion(hbQuestion);
        log.info("=================================>{}", i);
    }

    @Test
    void insertHbSelect() {
        HbSelect hbSelect = new HbSelect();
        hbSelect.setActiveId("99");
        hbSelect.setQuestionId("999");
        hbSelect.setSelectId("9999");
        hbSelect.setSelectDesc("描述");
        hbSelect.setTemp("temp");
        hbSelect.setCreateDate(new Date());
        hbSelect.setUpdateDate(new Date());

        Integer i = hbSelectImpl.insertHbSelect(hbSelect);
        log.info("=================================>{}", i);
    }

    @Autowired
    private QAndSDao qAndSDao;

    @Test
    void getAll() {
        List<QAndS> qAndS = qAndSDao.quertAllInfo();
        log.info("qAndS======================>{}", qAndS);
    }


    @Test
    void t() {

        LinkedList list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            log.info(list.get(i).toString());
        }
    }

    @Test
    void t2() {

        char i = '1';
        int m = i;
        System.out.println(m);
    }
}
