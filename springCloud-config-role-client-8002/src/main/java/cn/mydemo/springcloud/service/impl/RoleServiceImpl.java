package cn.mydemo.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mydemo.springcloud.dao.RoleDao;
import cn.mydemo.springcloud.entities.Role;
import cn.mydemo.springcloud.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public Role findById(Long roleno) {
		
		return roleDao.findById(roleno);
	}

	@Override
	public List<Role> findAll() {
		
		return roleDao.findAll();
	}

	@Override
	public boolean addRole(Role role) {
		
		return roleDao.addRole(role);
	}

}
