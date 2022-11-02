package kodlama.io2.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io2.Kodlama.io.Devs.dataAccess.abstarcts.ProgrammingLanguagesRepository;
import kodlama.io2.Kodlama.io.Devs.entities.concrete.ProgramingLanguage;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguagesRepository {
	
	
	List<ProgramingLanguage> programingLanguages;
	
	

	public InMemoryProgrammingLanguageRepository() {
		
		programingLanguages = new ArrayList<ProgramingLanguage>();
		programingLanguages.add(new ProgramingLanguage(1,"Python"));
		programingLanguages.add(new ProgramingLanguage(2,"Java"));
		programingLanguages.add(new ProgramingLanguage(3, "C#"));
		
		
	}

	@Override
	public ProgramingLanguage add(ProgramingLanguage programingLanguage) {
		
		programingLanguages.add(programingLanguage);
		
		return programingLanguage;
	}

	@Override
	public void delete(int id) {
		
		programingLanguages.remove(id);
		
		
	}

	@Override
	public ProgramingLanguage update(ProgramingLanguage programingLanguages, int id) {
		
		ProgramingLanguage pLanguage= getById(id);
		
		pLanguage.setName(programingLanguages.getName());
		
		
		return null;
	}

	@Override
	public List<ProgramingLanguage> getAll() {
		
		
		
		return programingLanguages;
	}

	@Override
	public ProgramingLanguage getById(int id) {
		
		
		
		return programingLanguages.get(id);
	}

}
