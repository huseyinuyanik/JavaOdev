package kodlama.io2.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io2.Kodlama.io.Devs.entities.concrete.ProgramingLanguage;

public interface ProgrammingLanguageService {
	
	
	
	ProgramingLanguage add(ProgramingLanguage programingLanguages);
	
	void delete(int id);
	
	ProgramingLanguage update(ProgramingLanguage programingLanguages, int id);
	
	List<ProgramingLanguage> getAll();
	
	ProgramingLanguage getById(int id);
	
	
	

}
