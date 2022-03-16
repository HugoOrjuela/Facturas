package com.home.facturas.repository;

import com.home.facturas.model.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaModel, Long> {
}
