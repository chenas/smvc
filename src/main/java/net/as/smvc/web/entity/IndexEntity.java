package net.as.smvc.web.entity;

import java.io.Serializable;
import java.util.List;

public class IndexEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String name;
	
	private List<SubIndex> subIndexs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubIndex> getSubIndexs() {
		return subIndexs;
	}

	public void setSubIndexs(List<SubIndex> subIndexs) {
		this.subIndexs = subIndexs;
	}

}
