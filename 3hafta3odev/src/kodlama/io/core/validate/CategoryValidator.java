package kodlama.io.core.validate;

import kodlama.io.entities.Category;

public class CategoryValidator {

	private Category[] categories;

	public CategoryValidator(Category[] categories) {

		this.categories = categories;
	}

	public boolean isValid(Category category) throws Exception {
		for (Category item : categories) {
			if (item.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Aynı kategori ismi olamaz");
			}
		}
		return true;
	}

}
