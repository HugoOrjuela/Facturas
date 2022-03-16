package com.home.facturas.controller;

import com.home.facturas.model.DetalleModel;
import com.home.facturas.model.FacturaModel;
import com.home.facturas.model.ProductoModel;
import com.home.facturas.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path = "/detalle")
public class DetalleController {
    @Autowired
    private DetalleRepository detalleReposiroty;

    @PostMapping()
    public DetalleModel create(@RequestBody DetalleModel detalleModel) {
        FacturaModel facturaModel = null;
        ProductoModel productoModel = null;

        if (detalleModel.getFacturaModel() != null)
            facturaModel = new FacturaModel(detalleModel.getFacturaModel().getId());

        if (detalleModel.getProductoModel() != null)
            productoModel = new ProductoModel(detalleModel.getProductoModel().getId());

        detalleModel.setFacturaModel(facturaModel);
        detalleModel.setProductoModel(productoModel);

        return detalleReposiroty.save(detalleModel);
    }

    @GetMapping()
    public @ResponseBody
    List<DetalleModel> getAll() {
        return detalleReposiroty.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetalleModel> getById(@PathVariable(value = "id") Long id) {
        return detalleReposiroty.findById(id);
    }

    @PutMapping("/{id}")
    public Optional<DetalleModel> update(@PathVariable(value = "id") Long id, @RequestBody DetalleModel detalleModel) {
        return detalleReposiroty.findById(id).map(detalle -> {
            detalle.setCantidad(detalleModel.getCantidad() != null ? detalleModel.getCantidad() : detalle.getCantidad());
            detalle.setPrecioUnitario(detalleModel.getPrecioUnitario() != null ? detalleModel.getPrecioUnitario() : detalle.getPrecioUnitario());
            if (detalleModel.getFacturaModel() != null) {
                Long idFact = detalleModel.getFacturaModel().getId();
                detalle.setFacturaModel(idFact != null ? detalleModel.getFacturaModel() : detalle.getFacturaModel());
            }
            if (detalleModel.getProductoModel() != null) {
                Long idProd = detalleModel.getProductoModel().getId();
                detalle.setProductoModel(idProd != null ? detalleModel.getProductoModel() : detalle.getProductoModel());
            }
            return detalleReposiroty.save(detalle);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        detalleReposiroty.deleteById(id);
    }
}