package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.TaskDevInfo;

/**
 * <p>
 * 任务信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-10
 */
public interface TaskDevInfoService extends IService<TaskDevInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default TaskDevInfo getOnly(EntityWrapper<TaskDevInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
