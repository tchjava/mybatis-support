package com.tjlou.mybatis.auto.mysql.sps.service.impl;

import com.tjlou.mybatis.auto.mysql.sps.entity.RequestLog;
import com.tjlou.mybatis.auto.mysql.sps.mapper.RequestLogMapper;
import com.tjlou.mybatis.auto.mysql.sps.service.RequestLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 请求参数日志表 服务实现类
 * </p>
 *
 * @author Gaby
 * @since 2020-04-15
 */
@Service
public class RequestLogServiceImpl extends ServiceImpl<RequestLogMapper, RequestLog> implements RequestLogService {

}
