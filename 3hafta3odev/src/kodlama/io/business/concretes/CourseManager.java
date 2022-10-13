package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.CourseManagerService;
import kodlama.io.core.logging.abstracts.LoggerDao;
import kodlama.io.core.validate.CourseValidator;
import kodlama.io.dataAccess.abstracts.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager implements CourseManagerService {

	private CourseDao courseDao;
	private CourseValidator courseValidator;
	private LoggerDao loggerDao;

	public CourseManager(CourseDao courseDao, CourseValidator courseValidator, LoggerDao loggerDao) {
		this.loggerDao = loggerDao;
		this.courseDao = courseDao;
		this.courseValidator = courseValidator;
	}

	@Override
	public void add(Course course) throws Exception {

		if (courseValidator.isValid(course) == true) {
			this.courseDao.add(course);
			System.out.println("Kurs eklendi =" + course.getCourseName());

		}

		courseDao.add(course);
		loggerDao.log(course.getCourseName());

	}

}
