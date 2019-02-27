package cn.mydemo.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.mydemo.springcloud.entities.Role;

@FeignClient(value = "MICROSERVICECLOUD-ROLE",fallbackFactory=RoleClientServiceFallbackFactory.class)
public interface RoleClientService {

	@RequestMapping(value = "/role/get/{id}", method = RequestMethod.GET)
	public Role get(@PathVariable("id") long id);

	@RequestMapping(value = "/role/get/all", method = RequestMethod.GET)
	public List<Role> list();

	@RequestMapping(value = "/role/add", method = RequestMethod.POST)
	public boolean add(Role role);
	
}
