package com.jianzhang.student.dubbox.service;

import com.jianzhang.student.model.QueryStudentRequest;
import com.jianzhang.student.model.QueryStudentResponse;

/**
 * @Description: 学生信息查询接口
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
public interface QueryStudentService {
    /**
     * 学生信息查询方法
     * @param queryStudentRequest
     * @return
     */
    public QueryStudentResponse queryStudent(QueryStudentRequest queryStudentRequest);
}
