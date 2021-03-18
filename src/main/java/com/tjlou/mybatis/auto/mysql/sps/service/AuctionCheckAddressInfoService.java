package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionCheckAddressInfo;

/**
 * <p>
 * 锤定鉴定地址信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-29
 */
public interface AuctionCheckAddressInfoService extends IService<AuctionCheckAddressInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionCheckAddressInfo getOnly(Wrapper<AuctionCheckAddressInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
