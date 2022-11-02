package kodlama.io2.Kodlama.io.Devs.dataAccess.abstarcts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io2.Kodlama.io.Devs.entities.concrete.ProgramingLanguage;

public interface ProgrammingLanguagesRepository {
	
	ProgramingLanguage add(ProgramingLanguage programingLanguages);
	
	void delete(int id);
	
	ProgramingLanguage update(ProgramingLanguage programingLanguages, int id);
	
	List<ProgramingLanguage> getAll();
	
	ProgramingLanguage getById(int id);
	
	
	

}
