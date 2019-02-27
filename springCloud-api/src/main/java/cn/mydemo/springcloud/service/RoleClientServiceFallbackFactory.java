package cn.mydemo.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.mydemo.springcloud.entities.Role;
import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class RoleClientServiceFallbackFactory implements FallbackFactory<RoleClientService>
{
	@Override
	public RoleClientService create(Throwable throwable)
	{
		return new RoleClientService() {
			@Override
			public Role get(long id)
			{
				return new Role().setRoleno(id+"").setRolename("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL");
			}

			@Override
			public List<Role> list()
			{
				return null;
			}

			@Override
			public boolean add(Role dept)
			{
				return false;
			}
		};
	}
}
