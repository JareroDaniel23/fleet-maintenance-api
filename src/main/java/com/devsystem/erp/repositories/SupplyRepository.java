package com.devsystem.erp.repositories;

import com.devsystem.erp.models.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends JpaRepository<Supply, String> {
}
