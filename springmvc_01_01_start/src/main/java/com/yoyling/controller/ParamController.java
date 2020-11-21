package com.yoyling.controller;

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
}
