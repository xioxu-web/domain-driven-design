package com.example.lottery.rpc;

import com.example.lottery.rpc.request.ActivityReq;
import com.example.lottery.rpc.respone.ActivityRes;

public interface IActivityBooth {
   ActivityRes queryActivityById(ActivityReq request);
}
