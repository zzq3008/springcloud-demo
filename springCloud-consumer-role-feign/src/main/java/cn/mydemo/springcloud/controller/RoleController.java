package cn.mydemo.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.mydemo.springcloud.entities.Role;
import cn.mydemo.springcloud.service.RoleClientService;

@RestController
@RequestMapping("/role")
public class RoleController {

	/*@Autowired
	private RestTemplate template;
	
	//private static final String ROLECLIENTURL="http://localhost:8001";
	private static final String ROLECLIENTURL="http://microservicecloud-role";*/
	
	@Autowired
	private RoleClientService service;
	
	@RequestMapping(value="/get/{id}")
	public Role getById(@PathVariable Long id){
		return service.get(id);
	}
	
	@RequestMapping(value="/get/all")
	public List<Role> getAll(){
		return service.list();
	}
	
	
	@PostMapping(value="add")
	public boolean addRole(@RequestBody Role role){
		return service.add(role);
	}
}
