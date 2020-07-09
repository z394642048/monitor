package com.cm.monitor.dao;

import com.cm.monitor.model.RoomBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * 床位表 dao
 */
@Mapper
public interface RoomBaseDao {

    /**
     * 通过主键id查询
     *
     * @param roomId
     * @return
     */
    RoomBase selectByPrimaryKey(@Param("roomId") Integer roomId);
}
