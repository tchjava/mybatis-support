package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ExpressCodeInfo;

/**
 * <p>
 * 快递编码表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-07-10
 */
public interface ExpressCodeInfoService extends IService<ExpressCodeInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ExpressCodeInfo getOnly(EntityWrapper<ExpressCodeInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
