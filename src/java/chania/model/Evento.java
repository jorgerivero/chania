package chania.model;
// Generated 27/11/2017 11:31:24 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Evento generated by hbm2java
 */
public class Evento  implements java.io.Serializable {


     private EventoId id;
     private Cliente cliente;
     private Salon salon;
     private Usuario usuario;
     private int idevento;
     private String eventoDuracion;
     private String nombre;
     private String descripcion;
     private Date fechaAlta;
     private String facturaClaveRef;
     private Integer idclienteRef;
     private String usuarioUsernameRef;

    public Evento() {
    }

	
    public Evento(EventoId id, Cliente cliente, Salon salon, Usuario usuario, int idevento) {
        this.id = id;
        this.cliente = cliente;
        this.salon = salon;
        this.usuario = usuario;
        this.idevento = idevento;
    }
    public Evento(EventoId id, Cliente cliente, Salon salon, Usuario usuario, int idevento, String eventoDuracion, String nombre, String descripcion, Date fechaAlta, String facturaClaveRef, Integer idclienteRef, String usuarioUsernameRef) {
       this.id = id;
       this.cliente = cliente;
       this.salon = salon;
       this.usuario = usuario;
       this.idevento = idevento;
       this.eventoDuracion = eventoDuracion;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.fechaAlta = fechaAlta;
       this.facturaClaveRef = facturaClaveRef;
       this.idclienteRef = idclienteRef;
       this.usuarioUsernameRef = usuarioUsernameRef;
    }
   
    public EventoId getId() {
        return this.id;
    }
    
    public void setId(EventoId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Salon getSalon() {
        return this.salon;
    }
    
    public void setSalon(Salon salon) {
        this.salon = salon;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getIdevento() {
        return this.idevento;
    }
    
    public void setIdevento(int idevento) {
        this.idevento = idevento;
    }
    public String getEventoDuracion() {
        return this.eventoDuracion;
    }
    
    public void setEventoDuracion(String eventoDuracion) {
        this.eventoDuracion = eventoDuracion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getFacturaClaveRef() {
        return this.facturaClaveRef;
    }
    
    public void setFacturaClaveRef(String facturaClaveRef) {
        this.facturaClaveRef = facturaClaveRef;
    }
    public Integer getIdclienteRef() {
        return this.idclienteRef;
    }
    
    public void setIdclienteRef(Integer idclienteRef) {
        this.idclienteRef = idclienteRef;
    }
    public String getUsuarioUsernameRef() {
        return this.usuarioUsernameRef;
    }
    
    public void setUsuarioUsernameRef(String usuarioUsernameRef) {
        this.usuarioUsernameRef = usuarioUsernameRef;
    }




}


