package com.example.lottery.domain.strategy.repository.Impl;

import com.example.lottery.domain.strategy.repository.IStrategyRepository;
import com.example.lottery.infrastructure.dao.IAwardDao;
import com.example.lottery.infrastructure.po.Award;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class StrategyRepository implements IStrategyRepository {
  @Resource
  private IAwardDao iAwardDao;
  @Override
  public Award queryAwardInfo(String awardId) {
    return iAwardDao.queryAwardInfo(awardId);
  }

}
