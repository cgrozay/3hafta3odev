package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.CourseManagerService;
import kodlama.io.core.validate.CourseValidator;
import kodlama.io.dataAccess.abstracts.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager implements CourseManagerService{

	private CourseDao courseDao;
	private CourseValidator courseValidator;
	
	
	
	public CourseManager(CourseDao courseDao, CourseValidator courseValidator) {
		
		this.courseDao = courseDao;
		this.courseValidator = courseValidator;
	}



	@Override
	public void add(Course course) throws Exception {
		if (courseValidator.isValid(course)==true) {
			this.courseDao.add(course);
			System.out.println("Kurs eklendi ="+course.getCourseName());
		}
		
	}

}
