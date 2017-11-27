package com.jianzhang.dubbox.consumer;

import com.jianzhang.student.model.QueryStudentRequest;
import com.jianzhang.student.model.QueryStudentResponse;
import com.jianzhang.student.model.Student;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.jianzhang.student.dubbox.service.AnotherQueryStudentRestService;
import com.jianzhang.student.dubbox.service.QueryStudentRestService;
import com.jianzhang.student.dubbox.service.QueryStudentService;

/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author Jian Jang
 * @version 1.0 2017/11/19
 */
public class QueryStudentServiceTest extends DubboxConsumerApplicationTests {
	private long currentTimeMillis;
	@Autowired
	private QueryStudentService queryStudentService;
	@Autowired
	private QueryStudentRestService queryStudentRestService;
	@Autowired
	private AnotherQueryStudentRestService anotherQueryStudentRestService;
	

	@Before
	public void begin() {
		currentTimeMillis = System.currentTimeMillis();
	}

	@After
	public void end() {
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
	}

	@Test
	public void testQueryStudentServiceTest() {
		QueryStudentRequest request = new QueryStudentRequest();
		QueryStudentResponse response = queryStudentService.queryStudent(request);
		System.out.println(JSONObject.toJSONString(response));
	}
	
	@Test
	public void testQueryStudentRestServiceTest() {

		QueryStudentRequest request = new QueryStudentRequest();
		QueryStudentResponse response = queryStudentRestService.queryStudentRest(request);
		System.out.println(JSONObject.toJSONString(response));
	}
	@Test
	public void testAnotherQueryStudentRestServiceTest() {

		Student response = anotherQueryStudentRestService.queryStudentRestByUserID(1l);
		System.out.println(JSONObject.toJSONString(response));
	}
}
