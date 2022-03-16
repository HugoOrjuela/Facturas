package com.home.facturas.repository;

import com.home.facturas.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoModel, Long> {
}
