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

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RestTemplate template;
	
	//private static final String ROLECLIENTURL="http://localhost:8001";
	private static final String ROLECLIENTURL="http://microservicecloud-role";
	
	@RequestMapping(value="/get/{id}")
	public Role getById(@PathVariable Long id){
		return template.getForObject(ROLECLIENTURL+"/role/get/"+id, Role.class);
	}
	
	@RequestMapping(value="/get/all")
	public List<Role> getAll(){
		return template.getForObject(ROLECLIENTURL+"/role/get/all", List.class);
	}
	
	
	@PostMapping(value="add")
	public boolean addRole(@RequestBody Role role){
		return template.postForObject(ROLECLIENTURL+"/role/add", role, Boolean.class);
	}
}
