package kodlama.io.entities;

public class Course implements BaseEntities{

	

	private int id;
	private Category categoryName;
	private Educator educatorName;
	private String courseName;
	private double salary;

	public Course() {

	}

	public Course(int id, Category categoryName, String courseName,Educator educatorName, double salary) {

		this.id = id;
		this.categoryName=categoryName;
		this.educatorName=educatorName;
		this.courseName = courseName;
		this.salary = salary;
	}

	

	public Category getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Category categoryName) {
		this.categoryName = categoryName;
	}

	public Educator getEducatorName() {
		return educatorName;
	}

	public void setEducatorName(Educator educatorName) {
		this.educatorName = educatorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
