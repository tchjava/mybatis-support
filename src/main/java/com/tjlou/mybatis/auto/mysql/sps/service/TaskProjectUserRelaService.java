package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.TaskProjectUserRela;

/**
 * <p>
 * 项目人员关联表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-06
 */
public interface TaskProjectUserRelaService extends IService<TaskProjectUserRela> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default TaskProjectUserRela getOnly(EntityWrapper<TaskProjectUserRela> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
