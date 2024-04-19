package com.itheima.dao;

import com.itheima.pojo.Worker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author teacher_shi
 * @project mybatistest04
 * @date 2024/4/18
 */
public interface WorkerMapper {
    @Select("select * from tb_worker where id = #{id}")
    Worker selectWorker(int id);

    @Insert("insert into tb_worker(name,age,sex,worker_id)"+"value(#{name},#{age},#{sex},#{worker_id})")
    int insertWorker(Worker worker);
}
