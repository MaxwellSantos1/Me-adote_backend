package br.com.meadote.meadote.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meadote.meadote.models.Pet;
import br.com.meadote.meadote.repositories.PetRepository;

@Service
public class PetService {

    @Autowired
    PetRepository petRepository;

    public Pet salvar(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet findById(int id) {
        return petRepository.findById(id);
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Pet atualizarPet(Pet pet, int id) {
        Pet petset = petRepository.findById(id);
        petset.setNome(pet.getNome());
        petset.setraca(pet.getraca());
        petset.setPeso(pet.getPeso());
        petset.setIdade(pet.getIdade());
        petset.setGenero(pet.getGenero());
        petset.setDescricao(pet.getDescricao());
        petset.setUrlImagem(pet.getUrlImagem());
        petset.setId_dono(pet.getId_dono());

        return petset;
    }

    public void deletarPet(int id) {
        petRepository.deleteById(id);
    }

    public List<Object[]> findPetByCategoria(String categoria) {
        return petRepository.findPetByCategoria(categoria);

    }

}
