package com.hx.hbactive.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hx.hbactive.pojo.HbQuestion;
import com.hx.hbactive.pojo.HbSelect;
import com.hx.hbactive.service.InsertQSService;
import com.hx.hbactive.service.ReaderService;
import com.hx.hbactive.service.impl.HbQuestionImpl;
import com.hx.hbactive.service.impl.QAndSImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@Slf4j
public class QuestionAndSelectController {

    @Autowired
    QAndSImpl qAndSImpl;
    @Autowired
    ReaderService readerService;
    @Autowired
    HbQuestionImpl hbQuestionImpl;
    @Autowired
    InsertQSService insertQSService;

    /**
     * 一次性将数据都插入到数据库
     */
    @RequestMapping("/qAndSConfigPage")
    public void insertQAndS(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws IOException {
        String activeId = (String) session.getAttribute("activeId");

        log.info("activeId============>{}", activeId);
        String dataViaRead = readerService.getDataViaRead(request);

        JSONArray array = JSONArray.parseArray(dataViaRead);

        boolean b = insertQSService.myInsertServer(activeId, array);
        log.info("插入数据成功了吗===============》 {}", b);

    }

    @RequestMapping("/infoListPage")
    public String aVoid(Model model, HttpSession session) {
        String activeId = (String) session.getAttribute("activeId");
        List list = qAndSImpl.quertAllInfo();
        model.addAttribute("list", list);
        model.addAttribute("activeId", activeId);
        model.addAttribute("name", "lyr");
        log.info("list=================>{}", list);
        return "infoListPage";
    }

}
