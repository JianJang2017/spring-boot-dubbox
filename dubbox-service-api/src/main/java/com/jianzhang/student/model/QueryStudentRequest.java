package com.jianzhang.student.model;

import java.io.Serializable;

/**
 * @Description: 学生信息查询请求条件类
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
public class QueryStudentRequest implements Serializable {

	private static final long serialVersionUID = -1461133161087348694L;
	private Long sno;

	private String sname;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}
