package com.yoyling.controller;

import com.yoyling.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

/**
 * 常用的注解
 */
@Controller
@SessionAttributes(value = {"msg"})	//把msg=123456存到session域中
@RequestMapping("/anno")
public class AnnoController {

	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(name = "name") String username) {
		System.out.println("执行了...");
		System.out.println(username);
		return "success";
	}

	/**
	 * 获取到请求体内容
	 * @param body
	 * @return
	 */
	@RequestMapping("/testRequestBody")
	public String testRequestBody(@RequestBody String body) {
		System.out.println("执行了...");
		System.out.println(body);
		return "success";
	}

	/**
	 * PathVariable注解
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{sid}")
	public String testPathVariable(@PathVariable(name = "sid") String id) {
		System.out.println("执行了...");
		System.out.println(id);
		return "success";
	}

	/**
	 * 获取请求头的值
	 * @param header
	 * @return
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value = "User-Agent") String header) {
		System.out.println("执行了...");
		System.out.println(header);
		return "success";
	}


	/**
	 * 获取Cookie的值
	 * @param cookieValue
	 * @return
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
		System.out.println("执行了...");
		System.out.println(cookieValue);
		return "success";
	}

	/**
	 * ModelAttribute注解
	 * @return
	 */
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(@ModelAttribute(value = "abc") User user) {
		System.out.println("testModelAttribute执行了...");
		System.out.println(user);
		return "success";
	}

	/**
	 * 该方法会先执行

	@ModelAttribute
	public User showUser(String uname) {
		System.out.println("showUser执行了...");
		System.out.println("拿到的uname：" + uname);

		//通过用户名uname查询数据库得到该user，拿到年龄（模拟）
		User user = new User();
		user.setUname(uname);
		user.setAge(20);
		return user;
	}
	 */

	/**
	 * 该方法会先执行
	 */
	@ModelAttribute
	public void showUser(String uname, Map<String,User> map) {
		System.out.println("showUser执行了...");
		System.out.println("拿到的uname：" + uname);

		//通过用户名uname查询数据库得到该user，拿到年龄（模拟）
		User user = new User();
		user.setUname(uname);
		user.setAge(20);
		map.put("abc",user);
	}

	/**
	 * SessionAttributes注解
	 * @return
	 */
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Model model) {
		//底层会存到request域对象
		System.out.println("testSessionAttributes执行了...");
		model.addAttribute("msg","123456");
		return "success";
	}

	@RequestMapping("/getSessionAttributes")
	public String getSessionAttributes(ModelMap modelMap) {
		System.out.println("getSessionAttributes执行了...");
		String msg = (String) modelMap.get("msg");
		System.out.println(msg);
		return "success";
	}

	@RequestMapping("/deleteSessionAttributes")
	public String deleteSessionAttributes(SessionStatus status) {
		System.out.println("deleteSessionAttributes执行了...");
		status.setComplete();
		return "success";
	}

}
