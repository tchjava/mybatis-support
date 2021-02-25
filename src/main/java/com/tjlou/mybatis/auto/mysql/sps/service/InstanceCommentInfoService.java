package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.InstanceCommentInfo;

/**
 * <p>
 * 拍品评价表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-06-26
 */
public interface InstanceCommentInfoService extends IService<InstanceCommentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default InstanceCommentInfo getOnly(EntityWrapper<InstanceCommentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
