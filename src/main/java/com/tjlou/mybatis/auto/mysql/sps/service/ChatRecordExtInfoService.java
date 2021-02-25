package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ChatRecordExtInfo;

/**
 * <p>
 * 聊天记录内容信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-03-26
 */
public interface ChatRecordExtInfoService extends IService<ChatRecordExtInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ChatRecordExtInfo getOnly(EntityWrapper<ChatRecordExtInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
