package udayanga.senanayake.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import udayanga.senanayake.sfgpetclinic.model.Vet;
import udayanga.senanayake.sfgpetclinic.services.CrudService;
import udayanga.senanayake.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
