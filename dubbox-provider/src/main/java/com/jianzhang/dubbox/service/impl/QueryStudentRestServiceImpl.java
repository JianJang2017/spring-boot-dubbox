package com.jianzhang.dubbox.service.impl;

import com.jianzhang.student.dubbox.service.QueryStudentRestService;
import com.jianzhang.student.model.QueryStudentRequest;
import com.jianzhang.student.model.QueryStudentResponse;
import com.jianzhang.student.model.Student;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 学生信息查询服务实现类
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@Component("queryStudentRestServiceImpl")
public class QueryStudentRestServiceImpl implements QueryStudentRestService {
	/***
	 * 
	 * 1、非dubbo 消费者调用方式： http://localhost:8888/services/restServices/users/queryStudentRest.xml
	 *                  http://localhost:8888/services/restServices/users/queryStudentRest.json
	 * 2、dubbo 消费者通过dubbo provider方式调用
	 */
	@Override
	public QueryStudentResponse queryStudentRest(QueryStudentRequest queryStudentRequest) {
		List<Student> studentList2 = new ArrayList<>();
		Student student = new Student();
		student.setSno(20171117l);
		student.setSname("张三");
		student.setEmail("zhangsan@zj.com");
		student.setAge(22);
		student.setGender("M");
		studentList2.add(student);
		studentList2.add(student);
		studentList2.add(student);
		QueryStudentResponse response = new QueryStudentResponse();
		response.setRepCode("000000");
		response.setRepMsg("成功");
		response.setStudentList(studentList2);
		return response;
	}

	/***
	 * 1、非dubbo 消费者调用方式： http://localhost:8888/services/restServices/users/queryStudentRestByUserID.xml?id=1
	 *                  http://localhost:8888/services/restServices/users/queryStudentRestByUserID.json?id=1
	 * 2、dubbo 消费者通过dubbo provider方式调用
	 */
	@Override
	public QueryStudentResponse queryStudentRestByUserID(Long userId) {
		QueryStudentResponse response = new QueryStudentResponse();
		List<Student> studentList2 = new ArrayList<>();
		Student student = new Student();
		student.setSno(2017112601l);
		student.setSname("张三");
		student.setEmail("zhangsan@zj.com");
		student.setAge(22);
		student.setGender("M");
		studentList2.add(student);
		response.setStudentList(studentList2);
		response.setRepCode("000000");
		response.setRepMsg("操作成功");
		return response;
	}
}
