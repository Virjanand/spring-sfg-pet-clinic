package com.virjanand.springsfgpetclinic.services;

import com.virjanand.springsfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findeById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
