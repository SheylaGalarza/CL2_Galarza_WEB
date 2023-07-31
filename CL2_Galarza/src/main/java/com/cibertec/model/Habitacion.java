package com.cibertec.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name = "habitacion")
	public class Habitacion {
		@Id
		  private int codigoHabitacion;
		    private String codigoHotel;
		    private String tipo;
		    private double precio;

		    public Habitacion() {
		        // Constructor vacio
		    }
		    // Constructor con parametros
		    public Habitacion(int codigoHabitacion, String codigoHotel, String tipo, double precio) {
		        this.codigoHabitacion = codigoHabitacion;
		        this.codigoHotel = codigoHotel;
		        this.tipo = tipo;
		        this.precio = precio;
		    }

		    // Getters y Setters
		    public int getCodigoHabitacion() {
		        return codigoHabitacion;
		    }

		    public void setCodigoHabitacion(int codigoHabitacion) {
		        this.codigoHabitacion = codigoHabitacion;
		    }

		    public String getCodigoHotel() {
		        return codigoHotel;
		    }

		    public void setCodigoHotel(String codigoHotel) {
		        this.codigoHotel = codigoHotel;
		    }

		    public String getTipo() {
		        return tipo;
		    }

		    public void setTipo(String tipo) {
		        this.tipo = tipo;
		    }

		    public double getPrecio() {
		        return precio;
		    }

		    public void setPrecio(double precio) {
		        this.precio = precio;
		    }
			@Override
			public String toString() {
				return "Habitacion [codigoHabitacion=" + codigoHabitacion + ", codigoHotel=" + codigoHotel + ", tipo="
						+ tipo + ", precio=" + precio + "]";
			}
		    
		    
	

}//fin de la clase habitacion
