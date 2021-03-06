package chania.model;
// Generated 27/11/2017 11:31:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Solicitud generated by hbm2java
 */
public class Solicitud  implements java.io.Serializable {


     private Integer idsolicitud;
     private String nombre;
     private String apePat;
     private String apeMat;
     private String email;
     private String facebook;
     private String twitter;
     private String instagram;
     private String telCellular;
     private String telCasa;
     private String telTrabajo;
     private String meEntere;
     private String motivo;
     private Integer numInvitados;
     private String descripcion;
     private Date fecha;
     private String estatus;

    public Solicitud() {
    }

    public Solicitud(String nombre, String apePat, String apeMat, String email, String facebook, String twitter, String instagram, String telCellular, String telCasa, String telTrabajo, String meEntere, String motivo, Integer numInvitados, String descripcion, Date fecha, String estatus) {
       this.nombre = nombre;
       this.apePat = apePat;
       this.apeMat = apeMat;
       this.email = email;
       this.facebook = facebook;
       this.twitter = twitter;
       this.instagram = instagram;
       this.telCellular = telCellular;
       this.telCasa = telCasa;
       this.telTrabajo = telTrabajo;
       this.meEntere = meEntere;
       this.motivo = motivo;
       this.numInvitados = numInvitados;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.estatus = estatus;
    }
   
    public Integer getIdsolicitud() {
        return this.idsolicitud;
    }
    
    public void setIdsolicitud(Integer idsolicitud) {
        this.idsolicitud = idsolicitud;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApePat() {
        return this.apePat;
    }
    
    public void setApePat(String apePat) {
        this.apePat = apePat;
    }
    public String getApeMat() {
        return this.apeMat;
    }
    
    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFacebook() {
        return this.facebook;
    }
    
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    public String getTwitter() {
        return this.twitter;
    }
    
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    public String getInstagram() {
        return this.instagram;
    }
    
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    public String getTelCellular() {
        return this.telCellular;
    }
    
    public void setTelCellular(String telCellular) {
        this.telCellular = telCellular;
    }
    public String getTelCasa() {
        return this.telCasa;
    }
    
    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }
    public String getTelTrabajo() {
        return this.telTrabajo;
    }
    
    public void setTelTrabajo(String telTrabajo) {
        this.telTrabajo = telTrabajo;
    }
    public String getMeEntere() {
        return this.meEntere;
    }
    
    public void setMeEntere(String meEntere) {
        this.meEntere = meEntere;
    }
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public Integer getNumInvitados() {
        return this.numInvitados;
    }
    
    public void setNumInvitados(Integer numInvitados) {
        this.numInvitados = numInvitados;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }




}


