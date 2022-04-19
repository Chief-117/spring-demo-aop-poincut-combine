package com.noah.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public boolean addAccount() {
		System.out.println(getClass()+" 新增會員帳號");
		return true;
	}
	public boolean doSleep() {
		System.out.println(getClass()+"Going To Sleep");
		return true;
	}
}
