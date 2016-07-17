package net.as.smvc.web.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages="net.as", excludeFilters={
		@ComponentScan.Filter(type=FilterType.ANNOTATION, value={Controller.class})
})
//@EnableAspectJAutoProxy(proxyTargetClass=true)
@Import({DataSourceConfig.class})
public class SpringContextConfiguration {
	
	@Resource
	private DataSource dataSource;
	
	//配置扫描器
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("net.as.smvc.web.dao");
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return mapperScannerConfigurer;
	}
	
}
