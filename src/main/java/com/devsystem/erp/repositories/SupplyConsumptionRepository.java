package com.devsystem.erp.repositories;

import com.devsystem.erp.models.SupplyConsumption;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface SupplyConsumptionRepository extends JpaRepository<SupplyConsumption, Long>{
}
