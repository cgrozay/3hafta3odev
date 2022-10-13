package kodlama.io.core.logging.concretes;

import kodlama.io.core.logging.abstracts.LoggerDao;

public class DatabaseLogger implements LoggerDao{

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı = "+data);
		
	}

}
