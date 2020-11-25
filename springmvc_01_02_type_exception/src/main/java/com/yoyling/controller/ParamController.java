package com.yoyling.controller;

import com.yoyling.domain.Account;
import com.yoyling.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	/**
	 * 自定义类型转换器
	 * @param user
	 * @return
	 */
	@RequestMapping(path = "/saveUser")
	public String saveUser(User user) {
		System.out.println("执行了saveUser方法");
		System.out.println(user);
		return "success";
	}

	/**
	 * 获取Servlet原生API
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(path = "/testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request);
		System.out.println(response);
		HttpSession session = request.getSession();
		System.out.println(session);
		ServletContext servletContext = session.getServletContext();
		System.out.println(servletContext);
		return "success";
	}
}
