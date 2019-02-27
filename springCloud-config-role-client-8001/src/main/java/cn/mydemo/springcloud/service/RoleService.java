package cn.mydemo.springcloud.service;

import java.util.List;

import cn.mydemo.springcloud.entities.Role;

public interface RoleService {

	Role findById(Long roleno);
	
	List<Role> findAll();
	
	boolean addRole(Role role);
	
}
