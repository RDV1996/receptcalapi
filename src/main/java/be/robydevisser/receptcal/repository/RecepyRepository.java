package be.robydevisser.receptcal.repository;

import be.robydevisser.receptcal.model.Recepy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecepyRepository extends CrudRepository<Recepy, String> {
    Recepy findOneByName(String name);
}
