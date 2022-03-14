package mx.persona.entidad;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Integer idPersona;

	@Column(name = "correo")
	private String correo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido_paterno")
	private String apellido_paterno;

	@Column(name = "apellido_materno")
	private String apellido_materno;

	@Column(name = "fecha_nacimiento")
	private ZonedDateTime fecha_nacimiento;

	@Column(name = "contrasena")
	private String contrasena;

	@Column(name = "alias")
	private String alias;

	@Column(name = "registro_activo")
	private Boolean registroactivo;

	@Column(name = "fecha_alta")
	private ZonedDateTime fechaAlta;

	@Column(name = "fecha_modificacion")
	private ZonedDateTime fechaModificacion;

	@Column(name = "id_persona_alta")
	private Integer idPersonAlta;

	@Column(name = "id_persona_modificacion")
	private Integer idPersonaModificacion;

	public Persona() {
	}
	 

	public Persona(String correo, String nombre, String apellido_paterno, String apellido_materno,
			ZonedDateTime fecha_nacimiento, String contrasena, String alias, Boolean registroactivo,
			ZonedDateTime fechaAlta, ZonedDateTime fechaModificacion, Integer idPersonAlta,
			Integer idPersonaModificacion) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.contrasena = contrasena;
		this.alias = alias;
		this.registroactivo = registroactivo;
		this.fechaAlta = fechaAlta;
		this.fechaModificacion = fechaModificacion;
		this.idPersonAlta = idPersonAlta;
		this.idPersonaModificacion = idPersonaModificacion;
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

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public ZonedDateTime getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(ZonedDateTime fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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
