package com.example.demo.Service;

import com.example.demo.Entity.Energy;
import com.example.demo.repo.EnergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergyService {

    @Autowired
    private EnergyRepository energyRepository;

    public Energy createEnergy(Double protein) {
        Energy energy = new Energy();
        energy.setProtein(protein);
        energy.setCalories(protein * 4);
        return energyRepository.save(energy);

    }


}
