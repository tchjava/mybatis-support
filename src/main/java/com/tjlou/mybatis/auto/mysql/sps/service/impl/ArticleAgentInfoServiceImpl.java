package com.tjlou.mybatis.auto.mysql.sps.service.impl;

import com.tjlou.mybatis.auto.mysql.sps.entity.ArticleAgentInfo;
import com.tjlou.mybatis.auto.mysql.sps.mapper.ArticleAgentInfoMapper;
import com.tjlou.mybatis.auto.mysql.sps.service.ArticleAgentInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章-推荐人信息表(绑定给上下级关系) 服务实现类
 * </p>
 *
 * @author Gaby
 * @since 2020-02-24
 */
@Service
public class ArticleAgentInfoServiceImpl extends ServiceImpl<ArticleAgentInfoMapper, ArticleAgentInfo> implements ArticleAgentInfoService {

}
