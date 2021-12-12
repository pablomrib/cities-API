package com.github.PabloMarcelino.countries.repositories;

import com.github.PabloMarcelino.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
