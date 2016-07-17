package net.as.smvc.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Select;

import net.as.smvc.web.entity.IndexEntity;

public interface TutorMapper {
	@Select("select addr_id as addrId, street, city, state, zip,country from addresses where addr_id=#{id}")
	void findAddressById(int id);

	@Select("select * from courses where tutor_id=#{tutorId}")	
	@Results({@Result(id = true, column = "course_id", property = "courseId"),
		@Result(column = "name", property = "name"),
		@Result(column = "description", property = "description"),
		@Result(column = "start_date", property = "startDate"),
		@Result(column = "end_date", property = "endDate")	})	
	List<IndexEntity> findCoursesByTutorId(int tutorId);

	@Select("SELECT tutor_id, name as tutor_name, email, addr_id FROM tutors where tutor_id=#{tutorId}")
	@Results({ @Result(id = true, column = "tutor_id", property = "tutorId"),
			@Result(column = "tutor_name", property = "name"), 
			@Result(column = "email", property = "email"),
			@Result(property = "address", column = "addr_id", one = @One(select = " com.mybatis3.mappers.TutorMapper.findAddressById")),
			@Result(property = "courses", column = "tutor_id", many = @Many(select = "com.mybatis3.mappers.TutorMapper.findCoursesByTutorId")) })
	IndexEntity findTutorById(int tutorId);
}
