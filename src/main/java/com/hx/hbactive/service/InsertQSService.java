package com.hx.hbactive.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hx.hbactive.pojo.HbQuestion;
import com.hx.hbactive.pojo.HbSelect;
import com.hx.hbactive.service.impl.HbQuestionImpl;
import com.hx.hbactive.service.impl.HbSelectImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
public class InsertQSService {

    @Autowired
    HbSelectImpl hbSelectImpl;
    @Autowired
    HbQuestionImpl hbQuestionImpl;

    //这个方法需要支持事务

public   boolean myInsertServer(String activeId ,JSONArray array) {

        log.info("array.length====================>{}", array.size());
        //声明一个标志
        boolean flag = false;
        //声明2个对象
        HbQuestion hbQuestion;
        HbSelect hbSelect;
        /*获取数组中的每一个对象*/
        for (int i = 0; i < array.size(); i++) {
            //获取json对象
            JSONObject object = array.getJSONObject(i);

            log.info("object.toString()=============>{}", object.toString());

            if ((object.get("q").equals(""))
                    && (object.get("s1").equals(""))
                    && (object.get("s2").equals(""))
                    && (object.get("s3").equals(""))
                    && (object.get("s4").equals(""))) {
                continue;
            } else {
                //获取每一个值，存到问题表，存到选项表

                flag = true;
                //如果不全为空
                hbQuestion = new HbQuestion();
                hbSelect = new HbSelect();
                String q = (String) object.get("q");
                String s1 = (String) object.get("s1");
                String s2 = (String) object.get("s2");
                String s3 = (String) object.get("s3");
                String s4 = (String) object.get("s4");

                String[] s = {"s1","s2","s3","s4"};
                List sDesc = new LinkedList();
                String sx = "";
                for (int j = 0; j < 4; j++) {
                    sx = "s" + (1 + j);
                    String temp = (String) object.get(sx);

                    if (temp != null || !temp.equals("")) {
                        sDesc.add(temp);
                    }

                }
                //sDesc的长度就是选项的个数


                log.info("q====>{},s1==>{},s2==>{},s3==>{},s4==>{}",q,s1,s2,s3,s4);
                //问题是空也要添加一行
                //activeId 是活动ID
                String qId = "q" + (i + 1);//问题ID   此处可以改成枚举

                log.info("问题id===============>{}",qId);
                hbQuestion.setActiveId(activeId);
                hbQuestion.setQuestionId(qId);
                hbQuestion.setQuestionDesc(q);
                hbQuestion.setCreateDate(new Date());
                hbQuestion.setUpdateDate(new Date());
                hbQuestion.setTemp("");
                hbQuestionImpl.insertHbQuestion(hbQuestion);

                hbSelect.setActiveId(activeId);
                hbSelect.setQuestionId(qId);
                hbSelect.setUpdateDate(new Date());
                hbSelect.setCreateDate(new Date());
                hbSelect.setTemp("");
                //问题选项可能有多个
                for (int j = 0; j < sDesc.size(); j++) {
                    hbSelect.setSelectId(s[j]);
                    hbSelect.setSelectDesc(sDesc.get(j).toString());
                    //插入数据库
                    hbSelectImpl.insertHbSelect(hbSelect);
                }

            }
        }

        return true;
    }


}
