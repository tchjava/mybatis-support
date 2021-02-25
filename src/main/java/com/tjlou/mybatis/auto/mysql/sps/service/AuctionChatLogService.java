package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.AuctionChatLog;

/**
 * <p>
 * 锤定聊天内容记录日志表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-22
 */
public interface AuctionChatLogService extends IService<AuctionChatLog> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default AuctionChatLog getOnly(EntityWrapper<AuctionChatLog> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
