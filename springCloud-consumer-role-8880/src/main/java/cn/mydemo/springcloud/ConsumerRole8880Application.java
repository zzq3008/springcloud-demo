package cn.mydemo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.mydemo.myrole.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="microservicecloud-role",configuration=MySelfRule.class)
public class ConsumerRole8880Application {

	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRole8880Application.class, args);
	}
	
}
