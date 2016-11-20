package com.umis.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/*
 * 主控类，该类中信息管理员可见，部分信息都可见
 * 
 */
@Entity
@Table(name = "users_tb")
public class Users {

	@Id
	@GeneratedValue(generator = "userNumber")
	@GenericGenerator(name = "userNumber", strategy = "assigned")
	@Column(length = 10)
	private String userNumber;     //默认为学号，其他为工号，可为无号人员分配编号，仅供该系统使用

	@Column(name = "name_user")
	private String userName;

	@Column(name = "password_user")
	private String passWord;
	
	@Column(name = "classNumber_user")
	private String classNumber;

	
	@Column(name = "birthDate_user")
	private String birthDate;
	
	 @Column(name = "sex_user")
	    private String sex = "M";

	@OneToOne(cascade = CascadeType.ALL)     
	@JoinColumn(name = "userPhone", unique = true)
	private UsersAll userAll;

	// @DateTimeFormat(pattern="yyyy-MM-dd") //设置从jsp页面传的字符串格式的日期
	// private Date birth;

	// @NumberFormat(pattern="#,###,###.#") /设置从jsp页面传的字符串格式的数字
	// private Float salary;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public UsersAll getUserAll() {
		return userAll;
	}

	public void setUserAll(UsersAll userAll) {
		this.userAll = userAll;
	}

	public Users(String userNumber, String userName, String passWord, String classNumber, String birthDate, String sex,
			UsersAll userAll) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.classNumber = classNumber;
		this.birthDate = birthDate;
		this.sex = sex;
		this.userAll = userAll;
	}
	
	

	
}
