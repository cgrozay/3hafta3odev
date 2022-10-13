package kodlama.io.dataAccess.concretes.Hibernate;

import kodlama.io.dataAccess.abstracts.CourseDao;
import kodlama.io.entities.Course;

public class HibernateCourse implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi ="+course.getCourseName());
		
	}

}
