//package com.chryl.redisson;
//
///**
// * Created by Chr.yl on 2020/6/4.
// *
// * @author Chr.yl
// */
//
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RedissonConfig {
//
//    @Bean
//    public RedissonClient redissonClient() {
//        Config config = new Config();
//        config.useClusterServers()
//                .setScanInterval(2000)
//                .addNodeAddress("redis://10.0.29.30:6379", "redis://10.0.29.95:6379")
//                .addNodeAddress("redis://10.0.29.205:6379");
//                .setPassword("123456");
//
//        RedissonClient redisson = Redisson.create(config);
//
//        return redisson;
//    }
//}