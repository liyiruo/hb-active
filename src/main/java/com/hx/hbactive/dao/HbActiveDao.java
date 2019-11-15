package com.hx.hbactive.dao;

import com.hx.hbactive.pojo.HbActive;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HbActiveDao {
    Integer insertHbActive(HbActive hbActive);

    List<HbActive> getHbActive();

    Integer updateHbActive(HbActive hbActive);

    HbActive getHbActiveById(@Param("activeId") String activeId);

    String getSeqCurrval();

}
