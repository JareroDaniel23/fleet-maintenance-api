package com.devsystem.erp;

import com.devsystem.erp.models.Supply;
import com.devsystem.erp.models.VehicleType;
import com.devsystem.erp.repositories.SupplyRepository;
import com.devsystem.erp.repositories.VehicleTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder extends CommandLineRunner{
    private final SupplyRepository supplyRepo;
    private final VehicleTypeRepository vehicleTypeRepo;

    public DataSeeder (SupplyRepository supplyRepo, VehicleTypeRepository vehicleTypeRepo){
        this.supplyRepo = supplyRepo;
        this.vehicleTypeRepo = vehicleTypeRepo;
    }

    @Override
    public void run(String... args)throws Exception{
        if(supplyRepo.count() == 0 ){
            System.out.println();
        }
    }

}
