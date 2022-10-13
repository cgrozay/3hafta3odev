package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.CategoryManagerService;
import kodlama.io.core.logging.abstracts.LoggerDao;
import kodlama.io.core.validate.CategoryValidator;
import kodlama.io.dataAccess.abstracts.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager implements CategoryManagerService {

	private CategoryDao categoryDao;
	private CategoryValidator categoryValidator;
	private LoggerDao loggerDao;

	public CategoryManager(CategoryDao categoryDao, CategoryValidator categoryValidator, LoggerDao loggerDao) {
		this.categoryValidator = categoryValidator;
		this.categoryDao = categoryDao;
		this.loggerDao = loggerDao;

	}

	@Override
	public void add(Category category) throws Exception {
		if (categoryValidator.isValid(category) == true) {
			this.categoryDao.add(category);
			System.out.println("Kategori eklendi =" + category.getCategoryName());

		}
		categoryDao.add(category);
		loggerDao.log(category.getCategoryName());

	}

}
