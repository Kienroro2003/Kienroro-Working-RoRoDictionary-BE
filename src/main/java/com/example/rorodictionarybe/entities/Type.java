package com.example.rorodictionarybe.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
public class Type implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NonNull
    private Long id;
    @Column(name = "name_type")
    @NonNull
    private String nameType;

    @ManyToMany(mappedBy = "types")
    @JsonBackReference
    private Set<Word> words;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(id, type.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
