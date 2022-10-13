package kodlama.io.entities;

public class Category implements BaseEntities{

	private int id;
	private String categoryName;

	public Category() {

	}

	public Category(int id, String courseName) {

		this.id = id;
		this.categoryName = courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCourseName(String courseName) {
		this.categoryName = courseName;
	}
}
