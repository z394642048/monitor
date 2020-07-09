package com.cm.monitor.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * 房间管理表
 */
@Data
@NoArgsConstructor
public class RoomBase implements Serializable {

    public static final String REDIS_LOCK_KEY = "room_base_lock_key_";

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 房间名称
     */
    @NotBlank
    private String name;
    /**
     * 类别：1-单人间；2-双人间；3-三人间；4-多人间
     */
    @NotNull
    private Byte type;
    /**
     * 床位数量
     */
    @NotNull
    private Integer count;
    /**
     * 剩余床位数量
     */
    private Integer remainNumber;
    /**
     * 门店id
     */
    private Integer shopId;
    /**
     * 数据状态
     */
    private Byte statusFlag;
    /**
     * 创建人id
     */
    private Integer createUserId;
    /**
     * 更新人id
     */
    private Integer updateUserId;

}
