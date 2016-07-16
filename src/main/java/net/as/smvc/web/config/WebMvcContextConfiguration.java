package net.as.smvc.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 相当于springmvc-servlet.xml
 * @author 阿树
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="net.as.smvc.web.controller")
public class WebMvcContextConfiguration {

}
