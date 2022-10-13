package kodlama.io.dataAccess.concretes.Hibernate;

import kodlama.io.dataAccess.abstracts.EducatorDao;
import kodlama.io.entities.Educator;

public class HibernateEducator implements EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile eklendi : "+educator.getFirstName());
		
	}

}
