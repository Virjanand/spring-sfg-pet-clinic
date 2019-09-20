package com.virjanand.springsfgpetclinic.services;

import com.virjanand.springsfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
