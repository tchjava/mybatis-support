package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.ExpressCodeAliInfo;

/**
 * <p>
 * 阿里物流信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2019-09-27
 */
public interface ExpressCodeAliInfoService extends IService<ExpressCodeAliInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default ExpressCodeAliInfo getOnly(EntityWrapper<ExpressCodeAliInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
