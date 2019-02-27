package cn.mydemo.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Role {

	
	private String roleno;
	private String rolename;
	private String db_source;
	
	public Role(String rolename){
		this.rolename=rolename;
	}
	
}
