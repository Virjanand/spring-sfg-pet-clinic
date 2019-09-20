package com.virjanand.springsfgpetclinic.services;

import com.virjanand.springsfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findeById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
