package com.jianzhang.dubbox.service.impl;

import com.jianzhang.student.dubbox.service.AnotherQueryStudentRestService;
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
@Component("anotherQueryStudentRestServiceImpl")
public class AnotherQueryStudentRestServiceImpl implements AnotherQueryStudentRestService {
	/***
	 * 结合参照配置文件dubbox-provider.xml中contextpath配置进行访问 
	 * 1、非dubbo端调用方式
	 * http://localhost:8888/services/users/1.json
	 * http://localhost:8888/services/users/1.xml 
	 * 2、dubbo 消费者通过dubbo provider
	 * 方式进行调用 备注：如果通过restful接口url中传递参数，不能在实现类里添加注解，否则dubbo消费者端调用时会报参数缺失异常
	 */
	@Override
	public Student queryStudentRestByUserID(Long id) {
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
		return student;
	}
}
