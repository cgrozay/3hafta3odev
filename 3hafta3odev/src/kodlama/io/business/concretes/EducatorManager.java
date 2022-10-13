package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.EducatorService;
import kodlama.io.core.logging.abstracts.LoggerDao;
import kodlama.io.core.validate.EducatorValidator;
import kodlama.io.dataAccess.abstracts.EducatorDao;
import kodlama.io.entities.Educator;

public class EducatorManager implements EducatorService {

	private EducatorDao educatorDao;
	private EducatorValidator educatorValidator;
	private LoggerDao loggerDao;

	public EducatorManager(EducatorDao educatorDao, EducatorValidator educatorValidator,LoggerDao loggerDao) {
		this.loggerDao=loggerDao;
		this.educatorDao = educatorDao;
		this.educatorValidator = educatorValidator;
	}

	@Override
	public void add(Educator educator) throws Exception {
		if (educatorValidator.isValid(educator) == true) {
			this.educatorDao.add(educator);
			System.out.println("Eğitmen eklendi = " + educator.getFirstName() + " " + educator.getLastName());
		}
		educatorDao.add(educator);
		loggerDao.log(educator.getFirstName()+" "+educator.getLastName());
		

	}

}
