package com.tjlou.mybatis.auto.mysql.sps.service.impl;

import com.tjlou.mybatis.auto.mysql.sps.entity.OrderInfo;
import com.tjlou.mybatis.auto.mysql.sps.mapper.OrderInfoMapper;
import com.tjlou.mybatis.auto.mysql.sps.service.OrderInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单信息表 服务实现类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-03
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}