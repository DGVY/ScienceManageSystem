package com.mryao.gxkygl.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/30 15:30
 * @Description: 启动后做一些事情
 * @Version: 1.0
 */
public class Init implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Init.class);

    @Override
    public void run(String... strings) throws Exception {
        //这里加载数据字典缓存? 感觉没有必要 数据量不大 直接走数据库 或者用二级缓存？
    }
}
