package com.jianzhang.dubbox.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jianzhang.student.dubbox.service.QueryStudentRestService;
import com.jianzhang.student.dubbox.service.QueryStudentService;
import com.jianzhang.student.model.QueryStudentRequest;
import com.jianzhang.student.model.QueryStudentResponse;

/**
 * @Description:
 * @author Jian Jang
 * @version 1.0 2017年11月25日
 */
@Controller
public class HomeController {
	private Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private QueryStudentService queryStudentService;
	@Autowired
	private QueryStudentRestService queryStudentRestService;

	@GetMapping("/test")
	@ResponseBody
	public QueryStudentResponse query() {
		QueryStudentRequest queryStudentRequest = new QueryStudentRequest();
		QueryStudentResponse response = queryStudentService.queryStudent(queryStudentRequest);
		logger.info("response:" + response);
		return response;
	}

	@GetMapping("/test2")
	@ResponseBody
	public QueryStudentResponse query2() {
		QueryStudentRequest queryStudentRequest = new QueryStudentRequest();
		QueryStudentResponse response = queryStudentRestService
				.queryStudentRest(queryStudentRequest);
		logger.info("response:" + response);
		return response;
	}
}
