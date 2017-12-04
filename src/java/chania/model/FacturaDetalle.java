package chania.model;
// Generated 27/11/2017 11:31:24 PM by Hibernate Tools 4.3.1



/**
 * FacturaDetalle generated by hbm2java
 */
public class FacturaDetalle  implements java.io.Serializable {


     private FacturaDetalleId id;
     private Articulo articulo;
     private Factura factura;
     private int idfacturaDetalle;
     private Integer piezas;
     private Integer precio;
     private Integer descuento;

    public FacturaDetalle() {
    }

	
    public FacturaDetalle(FacturaDetalleId id, Articulo articulo, Factura factura, int idfacturaDetalle) {
        this.id = id;
        this.articulo = articulo;
        this.factura = factura;
        this.idfacturaDetalle = idfacturaDetalle;
    }
    public FacturaDetalle(FacturaDetalleId id, Articulo articulo, Factura factura, int idfacturaDetalle, Integer piezas, Integer precio, Integer descuento) {
       this.id = id;
       this.articulo = articulo;
       this.factura = factura;
       this.idfacturaDetalle = idfacturaDetalle;
       this.piezas = piezas;
       this.precio = precio;
       this.descuento = descuento;
    }
   
    public FacturaDetalleId getId() {
        return this.id;
    }
    
    public void setId(FacturaDetalleId id) {
        this.id = id;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public int getIdfacturaDetalle() {
        return this.idfacturaDetalle;
    }
    
    public void setIdfacturaDetalle(int idfacturaDetalle) {
        this.idfacturaDetalle = idfacturaDetalle;
    }
    public Integer getPiezas() {
        return this.piezas;
    }
    
    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }
    public Integer getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public Integer getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }




}

