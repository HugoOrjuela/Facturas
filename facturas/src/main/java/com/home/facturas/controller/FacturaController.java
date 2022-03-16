package com.home.facturas.controller;

import com.home.facturas.model.FacturaModel;
import com.home.facturas.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path ="/factura")

public class FacturaController {
    @Autowired
    private FacturaRepository facturaRepository;

    @PostMapping()
    public FacturaModel create(@RequestBody FacturaModel facturaModel) {
        return facturaRepository.save(facturaModel);
    }

    @GetMapping()
    public @ResponseBody
    List<FacturaModel> getAll() {
        return facturaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FacturaModel> getById(@PathVariable(value = "id") Long id) {
        return facturaRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Optional<FacturaModel> update(@PathVariable(value = "id") Long id, @RequestBody FacturaModel facturaModel) {
        return facturaRepository.findById(id).map(factura -> {
            factura.setNumero(facturaModel.getNumero() != null ? facturaModel.getNumero() : factura.getNumero());
            factura.setFecha(facturaModel.getFecha() != null ? facturaModel.getFecha() : factura.getFecha());
            factura.setPago(facturaModel.getPago() != null ? facturaModel.getPago() : factura.getPago());
            factura.setDocumento(facturaModel.getDocumento() != null ? facturaModel.getDocumento() : factura.getDocumento());
            factura.setNombre(facturaModel.getNombre() != null ? facturaModel.getNombre() : factura.getNombre());
            factura.setSubtotal(facturaModel.getSubtotal() != null ? facturaModel.getSubtotal() : factura.getSubtotal());
            factura.setDescuento(facturaModel.getDescuento() != null ? facturaModel.getDescuento() : factura.getDescuento());
            factura.setIva(facturaModel.getIva() != null ? facturaModel.getIva() : factura.getIva());
            factura.setTotalDescuento(facturaModel.getTotalDescuento() != null ? facturaModel.getTotalDescuento() : factura.getTotalDescuento());
            factura.setTotalImpuesto(facturaModel.getTotalImpuesto() != null ? facturaModel.getTotalImpuesto() : factura.getTotalImpuesto());
            factura.setTotal(facturaModel.getTotal() != null ? facturaModel.getTotal() : factura.getTotal());
            return facturaRepository.save(factura);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        facturaRepository.deleteById(id);
    }

}

