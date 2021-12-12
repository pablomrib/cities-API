package com.github.PabloMarcelino.staties.repositories;

import com.github.PabloMarcelino.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
