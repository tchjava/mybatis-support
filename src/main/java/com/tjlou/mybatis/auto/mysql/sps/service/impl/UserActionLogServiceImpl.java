package com.tjlou.mybatis.auto.mysql.sps.service.impl;

import com.tjlou.mybatis.auto.mysql.sps.entity.UserActionLog;
import com.tjlou.mybatis.auto.mysql.sps.mapper.UserActionLogMapper;
import com.tjlou.mybatis.auto.mysql.sps.service.UserActionLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户行为记录表 服务实现类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-28
 */
@Service
public class UserActionLogServiceImpl extends ServiceImpl<UserActionLogMapper, UserActionLog> implements UserActionLogService {

}
