package com.example.rorodictionarybe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
public class Type {
    @Id
    private Long id;
    @Column(name = "name_type")
    private String nameType;

    @ManyToMany(mappedBy = "types")
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
