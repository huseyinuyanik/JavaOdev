package kodlama.io2.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io2.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io2.Kodlama.io.Devs.entities.concrete.ProgramingLanguage;

@RestController
@RequestMapping("/api/plangs")
public class ProgrammingLanguagesController {
	
	@Autowired
	private ProgrammingLanguageService programmingLanguageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("/add")
	public ProgramingLanguage add(ProgramingLanguage programingLanguages) {
		return programmingLanguageService.add(programingLanguages);
		
	}
		
	
	@GetMapping("/getAll")
	
	public List<ProgramingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	
	

}
