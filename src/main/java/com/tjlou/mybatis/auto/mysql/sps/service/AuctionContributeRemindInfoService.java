package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionContributeRemindInfo;

/**
 * <p>
 * 贡献提示信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
public interface AuctionContributeRemindInfoService extends IService<AuctionContributeRemindInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionContributeRemindInfo getOnly(Wrapper<AuctionContributeRemindInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
