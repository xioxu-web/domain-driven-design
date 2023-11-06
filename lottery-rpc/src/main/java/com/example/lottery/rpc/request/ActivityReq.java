package com.example.lottery.rpc.request;
import java.io.Serializable;

public class ActivityReq implements Serializable {
  private Long activityId;

  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }
}
