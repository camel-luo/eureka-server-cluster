package com.lyq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description	: @EnableEurekaServer开启此端为服务注册中心
 * @author 		: lyq
 * @date		: 2018/01/10
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerClusterApplication.class, args);
	}

}
