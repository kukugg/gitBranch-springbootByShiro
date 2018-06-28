package com.bpglr.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bpglr.test.service.MytestService;


/**
 * @Title:HelloController
 * @Description: 测试类： 启动主类后 打开http://localhost:8080/HelloController/hello 即可看到返回的	
 * @Author hjp	
 * @Date 2018年5月29日
 */
@RestController
@RequestMapping("HelloController")
public class HelloController {
	
	@Autowired
	private MytestService mytestService;
	
	
	@RequestMapping("/index")
	public String index() {
		return "Hello index!!!";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello hello!!!";
	}
	
	@ResponseBody
	@PostMapping("/findAllUser")
	public Object findAllUser() {
		Map<String, Object> params = new HashMap<String, Object>();
		return mytestService.findAllUser(params);
	}
}
