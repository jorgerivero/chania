package chania.model;
// Generated 27/11/2017 11:31:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Salon generated by hbm2java
 */
public class Salon  implements java.io.Serializable {


     private String salonClave;
     private int idsalon;
     private String salonNombre;
     private Integer capacidad;
     private String estatus;
     private String calle;
     private String colonia;
     private String delegacion;
     private String pais;
     private String cp;
     private Set eventos = new HashSet(0);

    public Salon() {
    }

	
    public Salon(int idsalon) {
        this.idsalon = idsalon;
    }
    public Salon(int idsalon, String salonNombre, Integer capacidad, String estatus, String calle, String colonia, String delegacion, String pais, String cp, Set eventos) {
       this.idsalon = idsalon;
       this.salonNombre = salonNombre;
       this.capacidad = capacidad;
       this.estatus = estatus;
       this.calle = calle;
       this.colonia = colonia;
       this.delegacion = delegacion;
       this.pais = pais;
       this.cp = cp;
       this.eventos = eventos;
    }
   
    public String getSalonClave() {
        return this.salonClave;
    }
    
    public void setSalonClave(String salonClave) {
        this.salonClave = salonClave;
    }
    public int getIdsalon() {
        return this.idsalon;
    }
    
    public void setIdsalon(int idsalon) {
        this.idsalon = idsalon;
    }
    public String getSalonNombre() {
        return this.salonNombre;
    }
    
    public void setSalonNombre(String salonNombre) {
        this.salonNombre = salonNombre;
    }
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getDelegacion() {
        return this.delegacion;
    }
    
    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public Set getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set eventos) {
        this.eventos = eventos;
    }




}


