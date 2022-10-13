package kodlama.io.dataAccess.concretes.Jdbs;


import kodlama.io.dataAccess.abstracts.CategoryDao;
import kodlama.io.entities.Category;

public class JdbsCategory implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBS ile eklendi : "+category.getCategoryName());
		
	}

	

}
