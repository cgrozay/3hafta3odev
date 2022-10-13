package kodlama.io.dataAccess.concretes.Jdbs;

import kodlama.io.dataAccess.abstracts.CourseDao;
import kodlama.io.entities.Course;

public class JdbsCourse implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBS ile eklendi : "+course.getCourseName());
		
	}

}
