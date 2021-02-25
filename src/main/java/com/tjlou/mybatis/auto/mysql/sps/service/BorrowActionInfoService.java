package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.BorrowActionInfo;

/**
 * <p>
 * 直播行为信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-05-31
 */
public interface BorrowActionInfoService extends IService<BorrowActionInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default BorrowActionInfo getOnly(EntityWrapper<BorrowActionInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
