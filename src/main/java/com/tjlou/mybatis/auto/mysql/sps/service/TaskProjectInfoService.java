package   com.tjlou.mybatis.auto.mysql.sps.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.tjlou.mybatis.auto.mysql.sps.entity.TaskProjectInfo;

/**
 * <p>
 * 项目信息表 服务类
 * </p>
 *
 * @author Gaby
 * @since 2020-01-07
 */
public interface TaskProjectInfoService extends IService<TaskProjectInfo> {

    /**
     * 仅有一条数据
     * @param wrapper
     * @return
     */
    default TaskProjectInfo getOnly(EntityWrapper<TaskProjectInfo> wrapper){
        wrapper.last("limit 1");
        return this.selectOne(wrapper);
    };
}
