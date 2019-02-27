package cn.mydemo.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.mydemo.springcloud.entities.Role;

@Mapper
public interface RoleDao {

	Role findById(Long roleno);
	
	List<Role> findAll();
	
	boolean addRole(Role role);
}
