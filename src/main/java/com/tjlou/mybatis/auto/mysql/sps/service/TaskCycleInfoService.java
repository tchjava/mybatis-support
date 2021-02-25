package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.TaskCycleInfo;

/**
 * <p>
 * 任务周期表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-06
 */
public interface TaskCycleInfoService extends IService<TaskCycleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default TaskCycleInfo getOnly(EntityWrapper<TaskCycleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
