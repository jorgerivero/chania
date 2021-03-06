package chania.model;
// Generated 27/11/2017 11:31:24 PM by Hibernate Tools 4.3.1



/**
 * FacturaDetalleId generated by hbm2java
 */
public class FacturaDetalleId  implements java.io.Serializable {


     private String articuloClaveRef;
     private String facturaClaveRef;

    public FacturaDetalleId() {
    }

    public FacturaDetalleId(String articuloClaveRef, String facturaClaveRef) {
       this.articuloClaveRef = articuloClaveRef;
       this.facturaClaveRef = facturaClaveRef;
    }
   
    public String getArticuloClaveRef() {
        return this.articuloClaveRef;
    }
    
    public void setArticuloClaveRef(String articuloClaveRef) {
        this.articuloClaveRef = articuloClaveRef;
    }
    public String getFacturaClaveRef() {
        return this.facturaClaveRef;
    }
    
    public void setFacturaClaveRef(String facturaClaveRef) {
        this.facturaClaveRef = facturaClaveRef;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FacturaDetalleId) ) return false;
		 FacturaDetalleId castOther = ( FacturaDetalleId ) other; 
         
		 return ( (this.getArticuloClaveRef()==castOther.getArticuloClaveRef()) || ( this.getArticuloClaveRef()!=null && castOther.getArticuloClaveRef()!=null && this.getArticuloClaveRef().equals(castOther.getArticuloClaveRef()) ) )
 && ( (this.getFacturaClaveRef()==castOther.getFacturaClaveRef()) || ( this.getFacturaClaveRef()!=null && castOther.getFacturaClaveRef()!=null && this.getFacturaClaveRef().equals(castOther.getFacturaClaveRef()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getArticuloClaveRef() == null ? 0 : this.getArticuloClaveRef().hashCode() );
         result = 37 * result + ( getFacturaClaveRef() == null ? 0 : this.getFacturaClaveRef().hashCode() );
         return result;
   }   


}


