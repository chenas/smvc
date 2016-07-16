package net.as.smvc.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages="net.as", excludeFilters={
		@ComponentScan.Filter(type=FilterType.ANNOTATION, value={Controller.class})
})
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringContextConfiguration {
	

}
