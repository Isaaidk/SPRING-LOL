package com.example.accessingdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "personajes", path = "personajes")
public interface PersonajeRepository extends PagingAndSortingRepository<Personaje, Long> {}