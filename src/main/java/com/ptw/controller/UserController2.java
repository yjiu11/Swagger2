package com.ptw.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ptw.pojo.User;
import com.ptw.utils.PTWResult;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class UserController2 {
	// paramType = path表示通过URL传过来的值{id}
	@ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path")
	@GetMapping("index/{id}")
	public PTWResult t1(Integer id) {
		User user = new User();
		user.setAge(18);
		user.setId(1);
		user.setUsername("yjiu");
		return PTWResult.ok(user);
	}

	@ApiOperation(value = "删除用户", notes = "要删除喽")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path")
	@DeleteMapping("index/{id}")
	public PTWResult t2(Integer id) {
		return PTWResult.ok();
	}

	@ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
	@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "user")
	@PostMapping("user")
	public PTWResult add(@RequestBody @ApiParam(value = "user") User user) {
		return PTWResult.ok();
	}

	@ApiOperation(value = "更新信息", notes = "根据url的id来指定更新用户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User") })
	@RequestMapping(value = "user/{id}", method = RequestMethod.PUT)
	public PTWResult update(@PathVariable("id") Integer id, @RequestBody User user) {
		return PTWResult.ok();
	}

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public User jsonTest() {
		User user = new User();
		user.setAge(18);
		user.setId(1);
		user.setUsername("yjiu");
		return user;
	}
}
