package kodlama.io2.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io2.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io2.Kodlama.io.Devs.dataAccess.abstarcts.ProgrammingLanguagesRepository;
import kodlama.io2.Kodlama.io.Devs.entities.concrete.ProgramingLanguage;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService  {
	
	private ProgrammingLanguagesRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguagesRepository programmingLanguageRepository) {
		
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public ProgramingLanguage add(ProgramingLanguage programingLanguages) {
		
		if(programingLanguages.getName().isBlank()) {
			System.out.println("isim bos olamaz.");
		}
		
		for (ProgramingLanguage p : programmingLanguageRepository.getAll()) {
			
			if(p.getName().equalsIgnoreCase(programingLanguages.getName())) {
				
				System.out.println("isim tekrarlanamaz.");
			}
			
		}
		
		return programmingLanguageRepository.add(programingLanguages);
	}

	@Override
	public void delete(int id) {
		
		programmingLanguageRepository.delete(id);
		
	}

	@Override
	public ProgramingLanguage update(ProgramingLanguage programingLanguages, int id) {
		
		return programmingLanguageRepository.update(programingLanguages, id);
	}

	@Override
	public List<ProgramingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgramingLanguage getById(int id) {
		
		return programmingLanguageRepository.getById(id);
	}
	
	

}
