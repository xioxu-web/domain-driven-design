package com.example.lottery.infrastructure.dao;
import com.example.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface IActivityDao{
  Activity queryActivityById(Long activityId);
}

