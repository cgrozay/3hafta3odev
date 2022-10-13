package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.CategoryManagerService;
import kodlama.io.core.validate.CategoryValidator;
import kodlama.io.dataAccess.abstracts.CategoryDao;
import kodlama.io.entities.Category;



public class CategoryManager implements CategoryManagerService{

	private CategoryDao categoryDao;
	private CategoryValidator categoryValidator;

	public CategoryManager(CategoryDao categoryDao,CategoryValidator categoryValidator) {
		this.categoryValidator = categoryValidator;
		this.categoryDao=categoryDao;

	}

	@Override
	public void add(Category cetegory) throws Exception {
		if (categoryValidator.isValid(cetegory)) {
			this.categoryDao.add(cetegory);
			System.out.println("Kategori eklendi ="+cetegory.getCategoryName());
		}
		
	}

}
