package com.xjf.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 *断路器看板 入口
 */
//启用HystrixDashboard断路器看板 相关配置
@EnableHystrixDashboard
//启用发现服务
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaHystrixDashboardApplication.class, args);
    }

}
