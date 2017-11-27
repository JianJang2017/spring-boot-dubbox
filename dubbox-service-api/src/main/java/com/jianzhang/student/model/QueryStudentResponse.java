package com.jianzhang.student.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@XmlRootElement
public class QueryStudentResponse implements Serializable {

	private static final long serialVersionUID = 233002150690178266L;
	private String repCode;

	private String repMsg;

	private List<Student> studentList;

	public String getRepCode() {
		return repCode;
	}

	public void setRepCode(String repCode) {
		this.repCode = repCode;
	}

	public String getRepMsg() {
		return repMsg;
	}

	public void setRepMsg(String repMsg) {
		this.repMsg = repMsg;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
