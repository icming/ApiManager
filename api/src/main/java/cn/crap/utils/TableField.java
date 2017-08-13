package cn.crap.utils;

public class TableField {

    public static class USER {
        public final static String USER_TYPE = "userType"; // userType 只记录用户账号初始化来源
        public final static String EMAIL = "email";
        public final static String USER_NAME = "userName";
        public final static String LOGIN_TYPE = "loginTYpe";
        public final static String THIRDLY_ID = "thirdlyId"; // 第三方账号ID = 第三方前缀 + 唯一标识
        public final static String PASSWORD = "password"; // MD5 加密（旧数据），MD5+盐（新数据）
    }

}