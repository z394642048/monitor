package com.cm.monitor.service;

import com.cm.monitor.model.RoomBase;

/**
 * 床位表 service
 */
public interface RoomBaseService {



    /**
     * 查询指定房间信息
     *
     * @param roomId
     * @return
     */
    RoomBase getDetail(Integer roomId);

}
