package kodlama.io.dataAccess.concretes.Jdbs;

import kodlama.io.dataAccess.abstracts.EducatorDao;
import kodlama.io.entities.Educator;

public class JdbsEducator implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Jdbs ile eklendi : "+educator.getFirstName());
		
	}

}
