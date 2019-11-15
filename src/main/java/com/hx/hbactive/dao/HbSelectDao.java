package com.hx.hbactive.dao;

import com.hx.hbactive.pojo.HbSelect;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HbSelectDao {
    Integer insertHbSelect(HbSelect hbSelect);
}
