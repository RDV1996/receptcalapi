package be.robydevisser.receptcal.service;

import be.robydevisser.receptcal.model.Recepy;
import be.robydevisser.receptcal.repository.RecepyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepyService {

    @Autowired
    RecepyRepository recepyRepository;

    public Recepy findByName(String  name){
        return recepyRepository.findOneByName(name);
    }

}
