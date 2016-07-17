package net.as.smvc.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import net.as.smvc.web.entity.IndexEntity;
import net.as.smvc.web.entity.SubIndex;

public interface IndexDaoMapper {
	
	@Select("select * from t_user where id=#{id}")
	public IndexEntity selectByid(String id);
	
	@Insert("insert into t_user(id, name) values(#{id}, #{name})")
	public void insertIndex(IndexEntity indexEntity);
	
	@Delete("delete from t_user where id = #{id}")
	public void delById(String id);
	
	@Select("select * from t_user")
	public List<IndexEntity> getAll();
	

	//@Select("select p.id, p.name, s.id s_id , s.name s_name,"
	//		+ " s.parentId from t_user p left join t_sub s on p.id=s.parentId")
	@Select("select * from t_sub where parentId=#{id}")
	List<SubIndex> findSubByParentId(String id);

	@Select("select p.id, p.name from t_user p left join t_sub s on p.id=s.parentId")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(property = "subIndexs", column = "id", many = @Many(select = "net.as.smvc.web.dao.IndexDaoMapper.findSubByParentId")) })
	public List<IndexEntity> getWithChildren();

}
