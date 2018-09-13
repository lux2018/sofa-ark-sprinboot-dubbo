package com.lux.sofa.ark.demo;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo.xml")
public class ArkSpringbootDubboApplication {

	public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
		SpringApplication.run(ArkSpringbootDubboApplication.class, args);
	}
}
