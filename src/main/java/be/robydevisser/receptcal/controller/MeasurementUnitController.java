package be.robydevisser.receptcal.controller;

import be.robydevisser.receptcal.model.MeasurementUnit;
import be.robydevisser.receptcal.service.MeasurementUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/measurementunit")
public class MeasurementUnitController {

    @Autowired
    MeasurementUnitService measurementUnitService;

    @GetMapping
    public List<MeasurementUnit> getAll() {
    return measurementUnitService.getAll();
    }
}
