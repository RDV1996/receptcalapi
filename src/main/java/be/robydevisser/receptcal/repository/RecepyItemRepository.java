package be.robydevisser.receptcal.repository;

import be.robydevisser.receptcal.model.RecepyItem;
import be.robydevisser.receptcal.model.UserRecepy;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import java.util.List;

public interface RecepyItemRepository  extends CrudRepository<RecepyItem, String> {
        List<RecepyItem> getAllByRecepyId(String Id);
}
