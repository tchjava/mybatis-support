package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionContributeExplainInfo;

/**
 * <p>
 * 贡献计划表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
public interface AuctionContributeExplainInfoService extends IService<AuctionContributeExplainInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionContributeExplainInfo getOnly(Wrapper<AuctionContributeExplainInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
