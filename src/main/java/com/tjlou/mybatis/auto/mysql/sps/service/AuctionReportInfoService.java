package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionReportInfo;

/**
 * <p>
 * 举报信息 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-07-18
 */
public interface AuctionReportInfoService extends IService<AuctionReportInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionReportInfo getOnly(EntityWrapper<AuctionReportInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
