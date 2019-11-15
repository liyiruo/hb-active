package com.hx.hbactive.controller;

import com.hx.hbactive.pojo.HbActive;
import com.hx.hbactive.service.impl.HbActiveImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Slf4j
public class ActiveController {

    @Autowired
    private HbActiveImpl hbActiveImpl;

    @RequestMapping("/toActivePage")
    public String to() {
        log.info("====================================》toActivePage");
        return "activeConfigPage";
    }


    /**
     * 插入一条数据，把数据的id存入到session,并将出入的这条数据从数据库取出返回
     *
     * @param hbActive
     * @param request
     * @return
     */
    @RequestMapping("insert")
    public String insert(HbActive hbActive, HttpServletRequest request) {
        log.info("insert====>activeId========================>jinru insert");

        HbActive hbActiveData = hbActiveImpl.getInsertHbActive(hbActive);
        HttpSession session = request.getSession();
        session.setAttribute("activeId", hbActiveData.getActiveId());
        session.setAttribute("activeName", hbActiveData.getActiveName());
        session.setAttribute("activeDesc", hbActiveData.getActiveDesc());

        String activeId = (String) session.getAttribute("activeId");
        log.info("insert====>activeId========================>{}",activeId);
        return "qAndSConfigPage";
    }
    /**
     * 查询出所有的Active
     *
     * @return
     */
    @RequestMapping("/getAllHbActive")
    @ResponseBody
    public List<HbActive> getAllHbActive() {
        List list = hbActiveImpl.getHbActive();
        log.info("List===========>{}", list);
        return list;
    }
}
