package net.as.smvc.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.as.smvc.web.dao.IndexDao;

@Service
public class IndexService {
	
	@Autowired
	private IndexDao indexDao;
	
	public String getService(){
		return this.toString() + " - " + indexDao.getMyName();
	}

}
