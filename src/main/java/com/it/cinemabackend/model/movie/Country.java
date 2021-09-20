package com.it.cinemabackend.model.movie;

import com.it.cinemabackend.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends BaseEntity {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
