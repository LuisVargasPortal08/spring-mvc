package pe.edu.cibertec.spring_mvc.service;

import pe.edu.cibertec.spring_mvc.model.Language;
import pe.edu.cibertec.spring_mvc.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    /**
     * Obtiene todos los idiomas disponibles en la base de datos.
     *
     * @return Lista de idiomas
     */
    public List<Language> getAllLanguages() {
        return languageRepository.findAll(); // Asegúrate de que este método existe en el repositorio
    }
}