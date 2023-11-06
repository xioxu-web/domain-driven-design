package com.example.lottery.domain.strategy.model.res;

public class DrawResult {
  private String uId;
  private Long  strategyId;
  private String awardId;
  private String awardName;

  public DrawResult() {
  }

  public DrawResult(String uId, Long strategyId, String rewardId, String awardName) {
    this.uId = uId;
    this.strategyId = strategyId;
    this.awardId= awardId;
    this.awardName = awardName;
  }


  public String getuId() {
    return uId;
  }

  public void setuId(String uId) {
    this.uId = uId;
  }

  public Long getStrategyId() {
    return strategyId;
  }

  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }

  public String getAwardId() {
    return awardId;
  }

  public void setAwardId(String awardId) {
    this.awardId = awardId;
  }

  public String getAwardName() {
    return awardName;
  }

  public void setAwardName(String awardName) {
    this.awardName = awardName;
  }
}
