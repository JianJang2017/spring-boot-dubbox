package com.jianzhang.dubbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:dubbox配置
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@Configuration
@ImportResource({ "classpath:dubbox/*.xml" })
public class DubboxConfig {
}
