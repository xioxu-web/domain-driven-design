package com.example.lottery.infrastructure.dao;

import com.example.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IAwardDao {
  public Award queryAwardInfo(@Param("awardId") String awardId);
}
