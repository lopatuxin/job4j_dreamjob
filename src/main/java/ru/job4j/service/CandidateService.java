package ru.job4j.service;

import ru.job4j.model.Candidate;

import java.util.Collection;
import java.util.Optional;

public interface CandidateService {
    Candidate save(Candidate candidate);

    boolean deleteById(int id);

    boolean update(Candidate candidate);

    Optional<Candidate> findById(int id);

    Collection<Candidate> findAll();
}
