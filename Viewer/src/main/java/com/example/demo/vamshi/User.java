package com.example.demo.vamshi;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {

	@Override
	public String toString() {
		
		return "User [fullname=" + fullname + ",lastname="+ lastname +", email=" + email + ", mobile=" + mobile + ", school=" + school
				+ ", school_year=" + school_year + ", intermediate=" + intermediate + ", intermediate_year="
				+ intermediate_year + ", degree=" + degree + ", degree_year=" + degree_year + ", certificate_1="
				+ certificate_1 + ", certificate_2=" + certificate_2 + ", certificate_3=" + certificate_3 + ", skills="
				+ skills + ", project_1=" + project_1 + ", project_2=" + project_2 + ", project_3=" + project_3
				+ ", project_4=" + project_4 + ", project_5=" + project_5 + ", languages=" + languages
				+ ", experience_1=" + experience_1 + ", exp_years=" + exp_years + ", address=" + address + ", userdesc="
				+ userdesc + ", profession=" + profession + ", interests=" + interests + "]";
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool_year() {
		return school_year;
	}
	public void setSchool_year(String school_year) {
		this.school_year = school_year;
	}
	public String getIntermediate() {
		return intermediate;
	}
	public void setIntermediate(String intermediate) {
		this.intermediate = intermediate;
	}
	public String getIntermediate_year() {
		return intermediate_year;
	}
	public void setIntermediate_year(String intermediate_year) {
		this.intermediate_year = intermediate_year;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree_year() {
		return degree_year;
	}
	public void setDegree_year(String degree_year) {
		this.degree_year = degree_year;
	}
	public String getCertificate_1() {
		return certificate_1;
	}
	public void setCertificate_1(String certificate_1) {
		this.certificate_1 = certificate_1;
	}
	public String getCertificate_2() {
		return certificate_2;
	}
	public void setCertificate_2(String certificate_2) {
		this.certificate_2 = certificate_2;
	}
	public String getCertificate_3() {
		return certificate_3;
	}
	public void setCertificate_3(String certificate_3) {
		this.certificate_3 = certificate_3;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getProject_1() {
		return project_1;
	}
	public void setProject_1(String project_1) {
		this.project_1 = project_1;
	}
	public String getProject_2() {
		return project_2;
	}
	public void setProject_2(String project_2) {
		this.project_2 = project_2;
	}
	public String getProject_3() {
		return project_3;
	}
	public void setProject_3(String project_3) {
		this.project_3 = project_3;
	}
	public String getProject_4() {
		return project_4;
	}
	public void setProject_4(String project_4) {
		this.project_4 = project_4;
	}
	public String getProject_5() {
		return project_5;
	}
	public void setProject_5(String project_5) {
		this.project_5 = project_5;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getExperience_1() {
		return experience_1;
	}
	public void setExperience_1(String experience_1) {
		this.experience_1 = experience_1;
	}
	public String getExp_years() {
		return exp_years;
	}
	public void setExp_years(String exp_years) {
		this.exp_years = exp_years;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserdesc() {
		return userdesc;
	}
	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	String fullname;
	String lastname;
	@Id
	String email;
	String mobile;
	String school;
	String school_year;
	String intermediate;
	String intermediate_year;
	String degree;
	String degree_year;
	String certificate_1;
	String certificate_2;
	String certificate_3;
	String skills;
	String project_1;
	String project_2;
	String project_3;
	String project_4;
	String project_5;
	String languages;
	String experience_1;
	String exp_years;
	String address;
	String userdesc;
	String profession;
	String interests;
	
	
	
	
}
