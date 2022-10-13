package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.EducatorService;
import kodlama.io.core.validate.EducatorValidator;
import kodlama.io.dataAccess.abstracts.EducatorDao;
import kodlama.io.entities.Educator;

public class EducatorManager implements EducatorService{
	
	private EducatorDao educatorDao;
	private EducatorValidator educatorValidator;
	
	

	public EducatorManager(EducatorDao educatorDao, EducatorValidator educatorValidator) {
		
		this.educatorDao = educatorDao;
		this.educatorValidator = educatorValidator;
	}



	@Override
	public void add(Educator educator) throws Exception {
		if (educatorValidator.isValid(educator)==true) {
			this.educatorDao.add(educator);
			System.out.println("Eğitmen eklendi = "+educator.getFirstName()+" "+educator.getLastName());
		}
		
	}

}
