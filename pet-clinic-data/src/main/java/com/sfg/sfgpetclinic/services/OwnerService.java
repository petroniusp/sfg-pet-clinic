package com.sfg.sfgpetclinic.services;

import com.sfg.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
