package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.TaskScheduleInfo;

/**
 * <p>
 * 任务调度信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-09-02
 */
public interface TaskScheduleInfoService extends IService<TaskScheduleInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default TaskScheduleInfo getOnly(EntityWrapper<TaskScheduleInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
