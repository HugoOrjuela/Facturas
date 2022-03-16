package com.home.facturas.repository;

import com.home.facturas.model.DetalleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleRepository extends JpaRepository<DetalleModel, Long> {
    @Query(nativeQuery = true, value = " SELECT * FROM detalle WHERE fact_id = :id")
    List<DetalleModel> findByFactId(@Param("id") Long id);
}
