package net.as.smvc.web.entity;

import java.io.Serializable;

public class SubIndex implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String id;
	
	public String name;
	
	public String parentId;

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

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
