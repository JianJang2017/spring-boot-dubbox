package com.jianzhang.student.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: 学生实体
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@XmlRootElement
public class Student implements Serializable {
	private static final long serialVersionUID = 7502616319239213999L;
	private Long sno;

	private String sname;

	private String email;

	private String gender;

	private int age;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
