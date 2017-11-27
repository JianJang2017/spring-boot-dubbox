package com.jianzhang.student.dubbox.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.jianzhang.student.model.Student;

import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Description: 学生信息查询接口:Rest
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@Path("users")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public interface AnotherQueryStudentRestService {
	/**
	 * 学生信息查询方法 <dubbo:protocol name="rest" port="8888" threads="500"
	 * contextpath="services" server="tomcat" accepts="500"
	 * 非dubbo消费者可以通过如下方式进行调用 http://localhost:8888/contentpath/users/1.json
	 * http://localhost:8888/contentpath(参照配置文件：dubbox-provider.xml中配置)/users/1.xml
	 * @param queryStudentRequest
	 * @return
	 */
	@GET
	@Path("{id : \\d+}")
	public Student queryStudentRestByUserID(
			@Min(value = 1L, message = "User ID must be greater than 1") @PathParam("id") Long id);
}
