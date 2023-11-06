package com.example.lottery.domain.strategy.service.draw;
import com.example.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.example.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DrawConfig{

   @Resource
   private IDrawAlgorithm defaultRateRandomDrawAlgorithm;


   @Resource
   private IDrawAlgorithm  singleRateRandomDrawAlgorithm;


   private static Map<Integer,IDrawAlgorithm>  drawAlgorithmMap =new ConcurrentHashMap<>();


   @PostConstruct
   public void  init(){
       drawAlgorithmMap.put(1,defaultRateRandomDrawAlgorithm);
       drawAlgorithmMap.put(2,singleRateRandomDrawAlgorithm);
   }



}
