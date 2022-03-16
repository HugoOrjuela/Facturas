package com.home.facturas.controller;

import com.home.facturas.model.ProductoModel;
import com.home.facturas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path = "/producto")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping()
    public @ResponseBody
    List<ProductoModel> getAll() {
        return productoRepository.findAll();
    }
}
