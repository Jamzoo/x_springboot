package com.suke.czx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableTransactionManagement
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
/*cpu 进程调度算法 进程迪奥度算法今晨个低啊坡度算法及ii禁言  玉溪 玉溪 用什么养的原则用  第二小节和第六小姐的

进程调度的功能是是
就绪太
abcde
        都回导致进程有更低优先级进程到来
        进程调度
                先来先服务
短进程优先
                        作业从提交给系统
周转时间
                                响应时间要快
保证系统在单位时间内完成的吞吐量
                    越高越好
周转时间
                            算法调度
处理机
                                    是这样
试试
                                            写写页面
微信qq
                                                    程序
*/