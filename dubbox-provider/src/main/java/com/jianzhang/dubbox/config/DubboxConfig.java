package com.jianzhang.dubbox.config;

import com.alibaba.dubbo.remoting.http.servlet.BootstrapListener;
import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * @Description:dubbox配置
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@Configuration
@ImportResource({"classpath:dubbox/*.xml"})
public class DubboxConfig {

	@Bean
	public ServletListenerRegistrationBean<EventListener> dubboListener()
	{
		ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<>();
		registrationBean.setListener(new BootstrapListener());
		registrationBean.setName("dubboListener");
		registrationBean.setOrder(1);

		return registrationBean;
	}


	/**
	 * 配置rest servlet
	 */
	@Bean
	public ServletRegistrationBean dubboServlet()
	{
		ServletRegistrationBean registrationBean = new ServletRegistrationBean();
		registrationBean.setServlet(new DispatcherServlet());
		registrationBean.setName("dubboServlet");
		List<String> urlMappings = new ArrayList<String>();
		urlMappings.add("/restServices/*");////访问，可以添加多个
		registrationBean.setUrlMappings(urlMappings);
		registrationBean.setLoadOnStartup(1);

		return registrationBean;
	}
}
