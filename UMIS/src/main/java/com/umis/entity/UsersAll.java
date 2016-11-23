package com.umis.entity;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.umis.util.UsersLevel;

import java.util.Date;

/*
 * 被控类 ，该类中信息admin用户可见，如辅导员
 * 
 */
@Entity
@Table(name = "userAll_tb")
public class UsersAll {
	
	@Id
	@GeneratedValue(generator = "userPhone")
	@GenericGenerator(name = "userPhone", strategy = "assigned")
	@Column(length = 15)
	private String userPhone;
	
	@Column(name = "eMail_user")
	private String userEmail;
	
	@Column(name = "phone_user")
	private String wechatNumber;

    @Column(name = "address_user")
    private String address;
    
    
    @Column(name = "homeAddress_user")
    private String homeAdress;
    
    @Column(name = "officeAdress_user")
    private String officeAdress;
    
    /*
     * socialWork直接输入具体内容，以#区分
     * xueji字段，以固定格式输入，规定不同学籍状态
     */
    @Column(name = "coietyWork_user")
    private String societyWork;     
    
    @Column(name = "xueji_user")
    private String xueji;  
    
    
    
    @OneToOne(mappedBy = "userAll")
    private Users user;
    
    
    @OneToOne(cascade = CascadeType.ALL)     
	@JoinColumn(name = "userNumber", unique = true)
    private ExtraObtain extraObtain;

    @Column(name = "level_staff")
    private Integer level = UsersLevel.NORMALUSERS;

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getWechatNumber() {
		return wechatNumber;
	}

	public void setWechatNumber(String wechatNumber) {
		this.wechatNumber = wechatNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}

	public String getOfficeAdress() {
		return officeAdress;
	}

	public void setOfficeAdress(String officeAdress) {
		this.officeAdress = officeAdress;
	}

	public String getSocietyWork() {
		return societyWork;
	}

	public void setSocietyWork(String societyWork) {
		this.societyWork = societyWork;
	}

	public String getXueji() {
		return xueji;
	}

	public void setXueji(String xueji) {
		this.xueji = xueji;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public ExtraObtain getExtraObtain() {
		return extraObtain;
	}

	public void setExtraObtain(ExtraObtain extraObtain) {
		this.extraObtain = extraObtain;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public UsersAll(String userPhone, String userEmail, String wechatNumber, String address, String homeAdress,
			String officeAdress, String societyWork, String xueji, Users user, ExtraObtain extraObtain, Integer level) {
		super();
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.wechatNumber = wechatNumber;
		this.address = address;
		this.homeAdress = homeAdress;
		this.officeAdress = officeAdress;
		this.societyWork = societyWork;
		this.xueji = xueji;
		this.user = user;
		this.extraObtain = extraObtain;
		this.level = level;
	}

	public UsersAll() {
		// TODO Auto-generated constructor stub
	}
    
    
    



}
