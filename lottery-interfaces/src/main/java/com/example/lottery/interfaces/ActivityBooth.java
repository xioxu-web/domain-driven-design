package com.example.lottery.interfaces;
import com.example.lottery.common.Constants;
import com.example.lottery.common.Result;
import com.example.lottery.infrastructure.dao.IActivityDao;
import com.example.lottery.infrastructure.po.Activity;
import com.example.lottery.rpc.Dto.ActivityDto;
import com.example.lottery.rpc.IActivityBooth;
import com.example.lottery.rpc.request.ActivityReq;
import com.example.lottery.rpc.respone.ActivityRes;
import org.apache.dubbo.config.annotation.Service;
import javax.annotation.Resource;

@Service
public class ActivityBooth implements IActivityBooth {
  @Resource
  private IActivityDao activityDao;

  @Override
  public ActivityRes queryActivityById(ActivityReq request) {
    Activity activity = activityDao.queryActivityById(request.getActivityId());
    ActivityDto dto = new ActivityDto();
    dto.setActivityId(activity.getActivityId());
    dto.setActivityDesc(activity.getActivityDesc());
    dto.setActivityName(activity.getActivityName());
    dto.setState(activity.getState());
    dto.setBeginDateTime(activity.getBeginDateTime());
    dto.setEndDateTime(activity.getEndDateTime());
    dto.setStockCount(activity.getStockCount());
    dto.setTakeCount(activity.getTakeCount());
    return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()),dto);
  }
}
