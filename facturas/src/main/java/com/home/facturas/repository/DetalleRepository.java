package com.home.facturas.repository;
import com.home.facturas.model.DetalleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends JpaRepository<DetalleModel, Long> {
}
