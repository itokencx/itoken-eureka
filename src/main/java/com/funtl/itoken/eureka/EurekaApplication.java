package com.funtl.itoken.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cx
 * @Package: com.funtl.itoken.eureka
 * @ClassName: EurekaApplication
 * @Description:
 * @Date 2019/11/29 14:15
 * @Version 1.0
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class, args);
    	}
}
