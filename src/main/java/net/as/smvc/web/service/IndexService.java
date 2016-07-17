package net.as.smvc.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.as.smvc.web.dao.IndexDao;
import net.as.smvc.web.dao.IndexDaoMapper;
import net.as.smvc.web.entity.IndexEntity;

@Service
public class IndexService {
	
	@Autowired
	private IndexDao indexDao;
	
	@Autowired
	private IndexDaoMapper indexDaoMapper;
	
	public String getService(){
		indexDaoMapper.delById("101");
		IndexEntity in = new IndexEntity();
		in.setId("101");
		in.setName("test1");
		indexDaoMapper.insertIndex(in);
		return this.toString() + " - " + indexDao.getMyName() + " " + indexDaoMapper.selectByid("100").getName();
	}
	
	public IndexEntity getIndex(String id){
		IndexEntity indexEntity = indexDaoMapper.selectByid("100");
		return indexEntity;
	}
	
	public List<IndexEntity> getIndexList(){
		List<IndexEntity> entityList = indexDaoMapper.getAll();
		return entityList;
	}
	
	public List<IndexEntity> getWithChildren(){
		List<IndexEntity> entityList = indexDaoMapper.getWithChildren();
		return entityList;
	}

}
