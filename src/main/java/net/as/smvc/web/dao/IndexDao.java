package net.as.smvc.web.dao;

import org.springframework.stereotype.Repository;

/**
 * 数据访问层
 * @author 阿树
 *
 */
@Repository
public class IndexDao {
	
	public String getMyName(){
		return this.getClass().getSimpleName();
	}

}
