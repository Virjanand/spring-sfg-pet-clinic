package com.virjanand.springsfgpetclinic.services;

import com.virjanand.springsfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findeById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
