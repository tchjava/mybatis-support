package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.GoodsCommentInfo;

/**
 * <p>
 * 商品评价表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-11-26
 */
public interface GoodsCommentInfoService extends IService<GoodsCommentInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default GoodsCommentInfo getOnly(EntityWrapper<GoodsCommentInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
