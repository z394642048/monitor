package com.cm.monitor.service.impl;

import com.cm.monitor.dao.RoomBaseDao;
import com.cm.monitor.model.RoomBase;
import com.cm.monitor.service.RoomBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 床位表 serverImpl
 */
@Service
public class RoomBaseServiceImpl implements RoomBaseService {

    @Resource
    private RoomBaseDao roomBaseDao;

    @Override
    public RoomBase getDetail(Integer roomId) {
        return roomBaseDao.selectByPrimaryKey(roomId);
    }

}
