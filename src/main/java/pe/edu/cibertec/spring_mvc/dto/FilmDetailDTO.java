package pe.edu.cibertec.spring_mvc.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * DTO para representar los detalles de una película.
 */
@Getter
@Setter
public class FilmDetailDTO {
    // Getters y Setters
    private Long filmId;                 // ID único de la película
    private String title;                // Título de la película
    private String description;          // Descripción de la película
    private Integer releaseYear;         // Año de lanzamiento
    private Integer rentalDuration;      // Duración del alquiler en días
    private Double rentalRate;           // Tarifa de alquiler
    private Integer length;              // Duración de la película en minutos
    private Double replacementCost;      // Coste de reemplazo
    private String rating;               // Clasificación de la película
    private String specialFeatures;      // Características especiales de la película
    private Long languageId;             // ID del idioma
    private String languageName;         // Nombre del idioma
    private List<Long> categoryIds;      // Lista de IDs de categorías
    private String categories;           // Categorías asociadas a la película (como texto)

    // Constructor completo
    public FilmDetailDTO(Long filmId, String title, String description, Integer releaseYear,
                         Integer rentalDuration, Double rentalRate, Integer length,
                         Double replacementCost, String rating, String specialFeatures,
                         Long languageId, String languageName, List<Long> categoryIds, String categories) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.languageId = languageId;
        this.languageName = languageName;
        this.categoryIds = categoryIds;
        this.categories = categories;
    }

}
