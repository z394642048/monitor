package com.cm.monitor.util;

/**
 * 错误码，通用状态码100以内
 * 各个子系统状态码自己定义，100+以上空间自选
 */
public enum ErrorCode {

    OK(1000, "成功"),
    UNKNOWN_ERROR(1, "未知异常"),
    INVALID_ARGUMENT(2, "无效参数"),
    INVALID_STATE(3, "无效状态"),
    INTERNAL_ERROR(4, "美町系统内部错误"),
    EXIST_PERMISSION_CODE(5, "权限码已存在"),
    /* 不完整数据 */
    INVALID_DATA_ERROR(6, "无效数据"),
    /* MySQL数据操作失败 */
    RD_DATA_ERROR(7, "操作数据出错"),
    /* Redis数据操作失败 */
    RDS_DATA_ERROR(8, "操作数据出错"),
    INNER_API_ERROR(9, "访问数据出错"),
    OUTER_API_ERROR(10, "访问数据出错"),
    USER_NOT_LOGIN_ERROR(11, "用户未登录"),
    DATA_PERMISSION_DENIED_ERROR(12, "数据权限不足"),
    NULL_PRIMARY_KEY_ERROR(13, "主键id不能为空"),
    DATA_PERMISSION_ACCESS_ERROR(22, "数据权限不足"),
    /**
     * 常用的编码,名称,电话号码等等的重复校验码
     */
    EXISTED(13, "值已经存在"),
    CREDITLINE(14, "账户剩余额度不足"),
    REPEATED_ADD(15, "数据已存在，请勿重复添加数据"),
    DATA_IS_NULL_ERROR(16, "数据不存在"),
    CONNECT_OUT_TIME_ERROR(17, "缓存加锁超时"),
    /**
     * 菜单模块错误码 100 ～～ 199
     */
    EXIST_MENU_ERROR(101, "菜单已存在"),
    NOT_SUBMENU_ERROR(102, "非子菜单不能做此操作"),
    NOT_EXIST_MENU(103, "菜单不存在"),
    CREATE_MENU_ERROR(104, "当前菜单已经绑定了权限，不允许再创建子菜单"),
    REPAYMENT_CODE(99, "未放款,请先放款再进行此操作"),
    /**
     * 登录模块错误码使用200~~299
     */
    INVALID_USER_NAME_OR_PASSWORD(200, "用户名或者密码错误"),
    PASSWORD_ERROR_TIMES_THAN_LIMIT(201, "密码连续错误超限"),
    SUSPEND_USER_LOGIN(202, "当前用户账户处于冻结状态"),
    NON_USER_LOGINED_STATE(203, "非用户登录状态"),

    /**
     * 组织单元错误码 300 ~~ 399
     */
    EXIST_DEPARTMENT_NAME(300, "组织单元名称已存在"),
    EXIST_DEPARTMENT_SHORTNAME(301, "组织单元简称已存在"),
    EXIST_CITE(302, "有子菜单或者被引用，不能做此操作"),

    /**
     * 工作流公用基础数据专用错误码
     */
    NULL_ROLE_KEYS(401, "请求参数，角色编码为空"),
    SERVICE_REMOTE_CALL_ERROR(601, "服务调用异常"),











    XX(900, "垫底");


    private Integer code;
    private String message;

    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCode getErrorByCode(int code) {
        ErrorCode[] codes = values();
        for (ErrorCode ec : codes) {
            if (ec.getCode() == code) {
                return ec;
            }
        }
        return ErrorCode.UNKNOWN_ERROR;
    }
}