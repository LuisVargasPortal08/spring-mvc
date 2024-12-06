package pe.edu.cibertec.spring_mvc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilmListDTO {
    // Getters y Setters
    private Long filmId;
    private String title;
    private String languageName;
    private Integer rentalDuration;
    private Double rentalRate;
    // Getter para descripción
    // Setter para descripción
    private String description; // Nueva propiedad añadida

    // Constructor con todos los parámetros, incluida la nueva propiedad
    public FilmListDTO(Long filmId, String title, String languageName, Integer rentalDuration, Double rentalRate, String description) {
        this.filmId = filmId;
        this.title = title;
        this.languageName = languageName;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.description = description; // Inicializamos la descripción
    }

    // Constructor sin descripción (opcional, en caso no siempre quieras inicializarla)
    public FilmListDTO(Long filmId, String title, String languageName, Integer rentalDuration, Double rentalRate) {
        this.filmId = filmId;
        this.title = title;
        this.languageName = languageName;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
    }

}
