package kodlama.io.core.validate;

import kodlama.io.entities.Educator;

public class EducatorValidator {

	private Educator[] educators;

	public EducatorValidator(Educator[] educators) {
		
		this.educators = educators;
	}
	
	public boolean isValid(Educator educator) throws Exception {
		for (Educator item : educators) {
			if (item.getFirstName()==educator.getFirstName()&item.getLastName()==educator.getLastName()) {
				throw new Exception("Ayın isim ve soyisimde eğitmen olamaz");
			}
		}
		
		return true;
	}
}
