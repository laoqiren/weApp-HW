package com.umis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "extraobtain_tb")
public class ExtraObtain {
	
	@Id
	@GeneratedValue(generator = "userNumber")
	@GenericGenerator(name = "userNumber", strategy = "assigned")
	@Column(length = 10)
	private String userNumber;     //默认为学号，其他为工号，可为无号人员分配编号，仅供该系统使用
	
	//奖学金情况
	private int scholarship1;
	private int scholarship2;
	private int scholarship3;
	private int scholarship4;
	private int scholarship5;
	private int scholarship6;
	private int scholarship7;
	private int scholarship8;
	
	//助学金情况
	private int educationGrants1;
	private int educationGrants2;
	private int educationGrants3;
	private int educationGrants4;
	
	
	//社会奖励
	private String socialAward1;
	private String socialAward2;
	private String socialAward3;
	private String socialAward4;
	
	 @OneToOne(mappedBy = "extraObtain")
	private UsersAll userAll;

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public int getScholarship1() {
		return scholarship1;
	}

	public void setScholarship1(int scholarship1) {
		this.scholarship1 = scholarship1;
	}

	public int getScholarship2() {
		return scholarship2;
	}

	public void setScholarship2(int scholarship2) {
		this.scholarship2 = scholarship2;
	}

	public int getScholarship3() {
		return scholarship3;
	}

	public void setScholarship3(int scholarship3) {
		this.scholarship3 = scholarship3;
	}

	public int getScholarship4() {
		return scholarship4;
	}

	public void setScholarship4(int scholarship4) {
		this.scholarship4 = scholarship4;
	}

	public int getScholarship5() {
		return scholarship5;
	}

	public void setScholarship5(int scholarship5) {
		this.scholarship5 = scholarship5;
	}

	public int getScholarship6() {
		return scholarship6;
	}

	public void setScholarship6(int scholarship6) {
		this.scholarship6 = scholarship6;
	}

	public int getScholarship7() {
		return scholarship7;
	}

	public void setScholarship7(int scholarship7) {
		this.scholarship7 = scholarship7;
	}

	public int getScholarship8() {
		return scholarship8;
	}

	public void setScholarship8(int scholarship8) {
		this.scholarship8 = scholarship8;
	}

	public int getEducationGrants1() {
		return educationGrants1;
	}

	public void setEducationGrants1(int educationGrants1) {
		this.educationGrants1 = educationGrants1;
	}

	public int getEducationGrants2() {
		return educationGrants2;
	}

	public void setEducationGrants2(int educationGrants2) {
		this.educationGrants2 = educationGrants2;
	}

	public int getEducationGrants3() {
		return educationGrants3;
	}

	public void setEducationGrants3(int educationGrants3) {
		this.educationGrants3 = educationGrants3;
	}

	public int getEducationGrants4() {
		return educationGrants4;
	}

	public void setEducationGrants4(int educationGrants4) {
		this.educationGrants4 = educationGrants4;
	}

	public String getSocialAward1() {
		return socialAward1;
	}

	public void setSocialAward1(String socialAward1) {
		this.socialAward1 = socialAward1;
	}

	public String getSocialAward2() {
		return socialAward2;
	}

	public void setSocialAward2(String socialAward2) {
		this.socialAward2 = socialAward2;
	}

	public String getSocialAward3() {
		return socialAward3;
	}

	public void setSocialAward3(String socialAward3) {
		this.socialAward3 = socialAward3;
	}

	public String getSocialAward4() {
		return socialAward4;
	}

	public void setSocialAward4(String socialAward4) {
		this.socialAward4 = socialAward4;
	}

	public UsersAll getUserAll() {
		return userAll;
	}

	public void setUserAll(UsersAll userAll) {
		this.userAll = userAll;
	}

	public ExtraObtain(String userNumber, int scholarship1, int scholarship2, int scholarship3, int scholarship4,
			int scholarship5, int scholarship6, int scholarship7, int scholarship8, int educationGrants1,
			int educationGrants2, int educationGrants3, int educationGrants4, String socialAward1, String socialAward2,
			String socialAward3, String socialAward4, UsersAll userAll) {
		super();
		this.userNumber = userNumber;
		this.scholarship1 = scholarship1;
		this.scholarship2 = scholarship2;
		this.scholarship3 = scholarship3;
		this.scholarship4 = scholarship4;
		this.scholarship5 = scholarship5;
		this.scholarship6 = scholarship6;
		this.scholarship7 = scholarship7;
		this.scholarship8 = scholarship8;
		this.educationGrants1 = educationGrants1;
		this.educationGrants2 = educationGrants2;
		this.educationGrants3 = educationGrants3;
		this.educationGrants4 = educationGrants4;
		this.socialAward1 = socialAward1;
		this.socialAward2 = socialAward2;
		this.socialAward3 = socialAward3;
		this.socialAward4 = socialAward4;
		this.userAll = userAll;
	}

	public ExtraObtain() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	 

}
