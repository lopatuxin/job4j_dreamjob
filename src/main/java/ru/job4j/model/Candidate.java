package ru.job4j.model;

import java.time.LocalDateTime;

public class Candidate {
    private int id;
    private String name;
    private String description;
    private final LocalDateTime creationDate;

    public Candidate(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        if (id != candidate.id) return false;
        if (name != null ? !name.equals(candidate.name) : candidate.name != null) return false;
        if (description != null ? !description.equals(candidate.description) : candidate.description != null)
            return false;
        return creationDate != null ? creationDate.equals(candidate.creationDate) : candidate.creationDate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
