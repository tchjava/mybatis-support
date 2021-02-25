package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionReportExtInfo;

/**
 * <p>
 * 举报拓展信息 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-18
 */
public interface AuctionReportExtInfoService extends IService<AuctionReportExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionReportExtInfo getOnly(EntityWrapper<AuctionReportExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
