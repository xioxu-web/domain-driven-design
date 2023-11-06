package com.example.lottery.domain.strategy.repository;
import com.example.lottery.infrastructure.po.Award;

public interface IStrategyRepository {

  Award queryAwardInfo(String awardId);
}
