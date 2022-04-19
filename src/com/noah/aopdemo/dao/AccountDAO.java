package com.noah.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.noah.aopdemo.Account;

@Component
public class AccountDAO {
	private String name ;
	
	private String serviceCode;

	public void addAccount(Account account,boolean vipFlag) {
		System.out.println(getClass()+" 資料庫執行 : 新增帳戶");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+"DOING WORK");
		return true;
	}
	
	public String getName() {
		System.out.println("在getName方法");
		return name;
	}

	public void setName(String name) {
		System.out.println("在setName方法");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("在getServiceCode方法");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("在setServiceCode方法");
		this.serviceCode = serviceCode;
	}
}
