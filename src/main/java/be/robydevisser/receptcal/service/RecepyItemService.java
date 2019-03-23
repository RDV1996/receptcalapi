package be.robydevisser.receptcal.service;

import be.robydevisser.receptcal.model.RecepyItem;
import be.robydevisser.receptcal.repository.RecepyItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepyItemService {

    @Autowired
    RecepyItemRepository recepyItemRepository;

    public List<RecepyItem> getByRecepy(String id) {
        return recepyItemRepository.getAllByRecepyId(id);
    }

}
