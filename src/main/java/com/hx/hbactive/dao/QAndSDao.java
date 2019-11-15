package com.hx.hbactive.dao;

import com.hx.hbactive.pojo.QAndS;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface QAndSDao {
    List<QAndS> quertAllInfo();
}
