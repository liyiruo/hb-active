package com.hx.hbactive.service;

import com.hx.hbactive.pojo.HbActive;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IHbActive {

    Integer insertHbActive(HbActive hbActive);

    HbActive getInsertHbActive(HbActive hbActive);

    List<HbActive> getHbActive();

    Integer updateHbActive(HbActive hbActive);

    HbActive getHbActiveById(@Param("activeId") String activeId);
}
