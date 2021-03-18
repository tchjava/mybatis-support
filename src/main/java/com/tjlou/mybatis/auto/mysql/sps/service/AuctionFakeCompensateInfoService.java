package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionFakeCompensateInfo;

/**
 * <p>
 * 拍卖-假货赔付信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-10-16
 */
public interface AuctionFakeCompensateInfoService extends IService<AuctionFakeCompensateInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionFakeCompensateInfo getOnly(Wrapper<AuctionFakeCompensateInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
