package cn.mydemo.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.mydemo.springcloud.entities.Role;
import cn.mydemo.springcloud.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/get/{id}")
	@HystrixCommand
	public Role getById(@PathVariable Long id){
		return roleService.findById(id);
	}
	
	@RequestMapping(value="/get/all")
	public List<Role> getAll(){
		return roleService.findAll();
	}
	
	
	@PostMapping(value="add")
	public boolean addRole(@RequestBody Role role){
		return roleService.addRole(role);
	}
	
}
