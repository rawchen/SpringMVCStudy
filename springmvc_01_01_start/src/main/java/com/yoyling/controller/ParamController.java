package com.yoyling.controller;

import com.yoyling.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

	/**
	 * 请求参数绑定入门
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(path = "/testParam")
	public String testParam(String username, String password) {
		System.out.println("执行testParam方法");
		System.out.println("用户名：" + username + ",密码：" + password);
		return "success";
	}

	/**
	 * 请求参数绑定把数据封装到JavaBean的类中
	 * @param account
	 * @return
	 */
	@RequestMapping(path = "/saveAccount")
	public String saveAccount(Account account) {
		System.out.println("执行了saveAccount方法");
		System.out.println(account);
		return "success";
	}
}
