package cn.mydemo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.mydemo.myrole.MySelfRule;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.mydemo.springcloud"})
@RibbonClient(name="MICROSERVICECLOUD-ROLE",configuration=MySelfRule.class)
public class ConsumerRoleFeignApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRoleFeignApplication.class, args);
	}
	
}
