package com.example.lottery.domain.strategy.service.algorithm;

import com.example.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author admin
 * @deprecated 通用的抽奖算法
 */
public abstract class BaseAlgorithm implements IDrawAlgorithm{

    private final int HASH_INCREMENT = 0x61c88647;

    //数组初始化长度
    private final int RATE_TUPLE_LENGTH = 128;

    //存放概率与奖品对应的散列结果
    protected Map<Long, String[]> rateTupleMap= new ConcurrentHashMap<>();

    //奖品区间概率值
    protected  Map<Long, List<AwardRateInfo>> awardRateInfoMap = new ConcurrentHashMap<>();



    @Override
    public void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList){
        //保存奖品概率信息
        awardRateInfoMap.put(strategyId,awardRateInfoList);

        String[] rateTuple  = rateTupleMap.computeIfAbsent( strategyId, k -> new String[RATE_TUPLE_LENGTH] );

        int cursorValue=0;
        for (AwardRateInfo awardRateInfo:awardRateInfoList) {
            int rateValue = awardRateInfo.getAwardRate().multiply( new BigDecimal( 100 ) ).intValue();

            // 循环填充概率范围值
            for (int i =cursorValue+1; i <=(rateValue+cursorValue) ; i++) {
                 rateTuple[hashIdx(i)]=awardRateInfo.getAwardId();
            }

            cursorValue+=rateValue;

        }

    }

    @Override
    public boolean isExistRateTuple(Long strategyId) {
        return rateTupleMap.containsKey(strategyId);
    }


    /**
     * 斐波那契（Fibonacci）散列法，计算哈希索引下标值
     *
     * @param val 值
     * @return 索引
     */
    protected int hashIdx(int val) {
        int hashCode = val * HASH_INCREMENT + HASH_INCREMENT;
        return hashCode & (RATE_TUPLE_LENGTH - 1);
    }

}
