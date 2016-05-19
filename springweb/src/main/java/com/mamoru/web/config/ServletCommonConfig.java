package com.mamoru.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// servlet-context-common.xml 대체
@Configuration
@EnableWebMvc	// <mvc:annotation-driven/>
@ComponentScan(basePackages = {"com.mamoru.webapp"}) // <context:component-scan base-package="com.mamoru.webapp.*" />
public class ServletCommonConfig extends WebMvcConfigurerAdapter
{
	// <mvc:resources mapping="/resources/**" location="/resources/" />
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**")
				.addResourceLocations("/resources/");
	}

	/*
		<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
			<property name="prefix" value="/WEB-INF/jsp/" />
			<property name="suffix" value=".jsp" />
		</bean>
	 */
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		// viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
}
