package com.example.lottery.domain.strategy.model.req;

/**
 * @author admin
 */
public class DrawReq {

  private String uId;
  private String strategyId;

  public DrawReq() {

  }

  public DrawReq(String uId, String strategyId) {
    this.uId = uId;
    this.strategyId = strategyId;
  }

  public String getuId() {
    return uId;
  }

  public void setuId(String uId) {
    this.uId = uId;
  }

  public String getStrategyId() {
    return strategyId;
  }

  public void setStrategyId(String strategyId) {
    this.strategyId = strategyId;
  }
}
