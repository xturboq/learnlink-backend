package com.zecola.learnlink.constant;

public interface Constant {
    /**
     * Redisson 锁前缀
     */
    String REDISSON_LOCK_PER_KEY = "learnlink:precachejob:docache:lock";

    String REDISSON_LOCK_JOIN_TEAM = "learnlink:join_team";

    /**
     * 最大验证码
     */
    int MAXIMUM_VERIFICATION_CODE_NUM = 999999;
    /**
     * 最小验证码
     */
    int MINIMUM_VERIFICATION_CODE_NUM = 100000;

    /**
     * 注册验证码键
     */
    String REGISTER_CODE_KEY = "learnlink:register:";

    /**
     * 注册验证码过期时间
     */
    Long REGISTER_CODE_TTL = 1L;
}
