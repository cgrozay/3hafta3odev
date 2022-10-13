package kodlama.io;

import kodlama.io.business.concretes.CategoryManager;
import kodlama.io.business.concretes.CourseManager;
import kodlama.io.business.concretes.EducatorManager;
import kodlama.io.core.logging.abstracts.LoggerDao;
import kodlama.io.core.logging.concretes.DatabaseLogger;
import kodlama.io.core.logging.concretes.FileLogger;
import kodlama.io.core.logging.concretes.MailLogger;
import kodlama.io.core.validate.CategoryValidator;
import kodlama.io.core.validate.CourseValidator;
import kodlama.io.core.validate.EducatorValidator;
import kodlama.io.dataAccess.abstracts.EducatorDao;
import kodlama.io.dataAccess.concretes.Hibernate.HibernateCategory;
import kodlama.io.dataAccess.concretes.Hibernate.HibernateEducator;
import kodlama.io.dataAccess.concretes.Jdbs.JdbsCourse;
import kodlama.io.dataAccess.concretes.Jdbs.JdbsEducator;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Grafik Tasarım");
		Category category3 = new Category(3, "İşletim Sistemi");
		Category[] categories = { category1, category2 };

		Educator educator1 = new Educator();
		educator1.setId(1);
		educator1.setFirstName("Engin");
		educator1.setLastName("Demiroğ");

		Educator educator2 = new Educator();
		educator2.setId(2);
		educator2.setFirstName("Çağrı");
		educator2.setLastName("Özay");

		Educator[] educators = { educator1 };

		Course course1 = new Course();
		course1.setId(1);
		course1.setCategoryName(category1);
		course1.setCourseName("Java");
		course1.setEducatorName(educator1);
		course1.setSalary(70);

		Course course2 = new Course();
		course2.setId(2);
		course2.setCategoryName(category1);
		course2.setCourseName("C#");
		course2.setEducatorName(educator1);
		course2.setSalary(70);
		Course[] courses = { course1 };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategory(),
				new CategoryValidator(categories), new DatabaseLogger());
		categoryManager.add(category3);

		CourseManager courseManager = new CourseManager(new JdbsCourse(), new CourseValidator(courses),
				new DatabaseLogger());
		courseManager.add(course2);

		EducatorManager educatorManager = new EducatorManager(new HibernateEducator(), new EducatorValidator(educators),
				new MailLogger());
		educatorManager.add(educator2);
	}

}
