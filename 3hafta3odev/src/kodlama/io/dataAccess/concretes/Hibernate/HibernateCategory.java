package kodlama.io.dataAccess.concretes.Hibernate;


import kodlama.io.dataAccess.abstracts.CategoryDao;
import kodlama.io.entities.Category;

public class HibernateCategory implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi : "+category.getCategoryName());
		
	}

	

}
