package com.ptw.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author zh
 * @ClassName cn.saytime.bean.User
 * @Description
 */
@ApiModel(value = "user",description = "描述")
public class User {
	@ApiModelProperty(value="用户id",name="id",example="001")
	private int id;
	@ApiModelProperty(value="姓名",name="username",example="yjiu")
	private String username;
	@ApiModelProperty(value="年龄",name="age",example="18")
	private int age;
	@ApiModelProperty(value="日期",name="ctm",example="2019-06-01")
	private Date ctm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getCtm() {
		return ctm;
	}
	public void setCtm(Date ctm) {
		this.ctm = ctm;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", ctm=" + ctm + "]";
	}
	
	
}