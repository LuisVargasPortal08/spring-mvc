package pe.edu.cibertec.spring_mvc.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilmCreateUpdateDTO {
    // Getters y Setters
    private Long filmId; // Agregado para manejar el ID en edición
    private String title;
    private String description;
    private Integer releaseYear;
    private Long languageId;
    private List<Long> categoryIds; // Para manejar las categorías seleccionadas

    private Integer rentalDuration;
    private Double rentalRate;
    private Integer length;
    private Double replacementCost;
    private String rating;
    private String specialFeatures;

}
