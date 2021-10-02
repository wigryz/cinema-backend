package com.it.cinemabackend.model.dto;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ShowtimeDTO {

    private Long id;
    private Long movieId;
    private String title;
    private List<String> genres;
    private String ageRestriction;
    private String duration;
    private LocalDateTime dateTime;
    private String technology;
    private String language;
}
