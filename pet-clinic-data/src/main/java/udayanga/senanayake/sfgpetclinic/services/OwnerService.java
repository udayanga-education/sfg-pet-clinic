package udayanga.senanayake.sfgpetclinic.services;

import udayanga.senanayake.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
