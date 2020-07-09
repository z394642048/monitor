package com.cm.monitor.controller;

import com.cm.monitor.model.BaseResult;
import com.cm.monitor.model.RoomBase;
import com.cm.monitor.service.RoomBaseService;
import com.cm.monitor.util.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;


@RestController
@Slf4j
@Validated
@RequestMapping("room")
public class RoomBaseController {


    @Resource
    private RoomBaseService roomBaseService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResult<RoomBase> getDetail(@NotNull Integer roomId) {
        try {
            RoomBase brand = roomBaseService.getDetail(roomId);
            return BaseResult.ok(brand);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.error(ErrorCode.UNKNOWN_ERROR);
        }
    }


}
