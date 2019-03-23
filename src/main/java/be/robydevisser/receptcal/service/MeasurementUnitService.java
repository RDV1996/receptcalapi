package be.robydevisser.receptcal.service;

import be.robydevisser.receptcal.model.MeasurementUnit;
import be.robydevisser.receptcal.repository.MeasurementUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeasurementUnitService {

    @Autowired
    MeasurementUnitRepository measurementUnitRepository;

    public List<MeasurementUnit> getAll() {
        List<MeasurementUnit> units = new ArrayList<>();
        measurementUnitRepository.findAll().forEach(units::add);
        return units;
    }
}
