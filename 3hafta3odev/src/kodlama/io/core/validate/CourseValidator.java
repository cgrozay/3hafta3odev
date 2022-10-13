package kodlama.io.core.validate;

import kodlama.io.entities.Course;

public class CourseValidator {

	private Course[] courses;

	public CourseValidator(Course[] courses) {
		
		this.courses = courses;
	}
	
	public boolean isValid(Course course) throws Exception {
		for (Course item : courses ) {
			if (item.getCourseName()==course.getCourseName()) {
				throw new Exception("Aynı isimde kurs bulunamaz");
				
			}
			
			if (course.getSalary()<=0) {
				throw new Exception("Kurs ücreti 0 veya 0 dan küçük olamaz.");
			}
			break;
		}
		
		return true;
	}
	
}
