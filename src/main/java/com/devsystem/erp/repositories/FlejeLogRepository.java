package com.devsystem.erp.repositories;

import com.devsystem.erp.models.FlejeLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlejeLogRepository extends JpaRepository<FlejeLog, Long> {
}
