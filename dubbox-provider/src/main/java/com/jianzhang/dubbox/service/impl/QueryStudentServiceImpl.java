package com.jianzhang.dubbox.service.impl;
import com.jianzhang.student.dubbox.service.QueryStudentService;
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
@Component("queryStudentServiceImpl")
public class QueryStudentServiceImpl implements QueryStudentService {
	@Override
	public QueryStudentResponse queryStudent(QueryStudentRequest queryStudentRequest) {
		List<Student> studentList = new ArrayList<>();
		Student student = new Student();
		student.setSno(20171117l);
		student.setSname("张三");
		student.setEmail("zhangsan@zj.com");
		student.setAge(22);
		student.setGender("M");
		studentList.add(student);
		studentList.add(student);
		studentList.add(student);
		QueryStudentResponse response = new QueryStudentResponse();
		response.setRepCode("000000");
		response.setRepMsg("成功");
		response.setStudentList(studentList);
		return response;
	}
}
