package br.com.meadote.meadote.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meadote.meadote.models.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

    List<Pet> findAll();

    Pet findById(int id);

}
