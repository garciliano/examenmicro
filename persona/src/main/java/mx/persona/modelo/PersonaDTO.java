package mx.persona.modelo;

import java.time.ZonedDateTime;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class PersonaDTO {

	private Integer idPersona;
  
	private String correo;
	
	private String nombre;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private ZonedDateTime fechaNacimiento;
	
	private String contrasena;
	
	private String alias;
	
	private Boolean registroactivo;
	
	private ZonedDateTime fechaAlta;
	
	private ZonedDateTime fechaModificacion;
	
	private Integer idPersonAlta;
	
	private Integer idPersonaModificacion;

	public PersonaDTO() {
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public ZonedDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(ZonedDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Boolean getRegistroactivo() {
		return registroactivo;
	}

	public void setRegistroactivo(Boolean registroactivo) {
		this.registroactivo = registroactivo;
	}

	public ZonedDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(ZonedDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public ZonedDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(ZonedDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Integer getIdPersonAlta() {
		return idPersonAlta;
	}

	public void setIdPersonAlta(Integer idPersonAlta) {
		this.idPersonAlta = idPersonAlta;
	}

	public Integer getIdPersonaModificacion() {
		return idPersonaModificacion;
	}

	public void setIdPersonaModificacion(Integer idPersonaModificacion) {
		this.idPersonaModificacion = idPersonaModificacion;
	}

}
