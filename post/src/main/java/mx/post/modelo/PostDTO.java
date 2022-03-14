package mx.post.modelo;

import java.time.ZonedDateTime;
 

public class PostDTO {

	private Integer idPost;
	private String post;
	private Integer idPersona;
	private Integer idLibro;
	private Integer meGusta;
	private Boolean registroActivo;
	private ZonedDateTime fechaAlta;
	private ZonedDateTime fechaModificacion;

	public PostDTO() {
	}

	public Integer getIdPost() {
		return idPost;
	}

	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public Integer getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(Integer meGusta) {
		this.meGusta = meGusta;
	}

	public Boolean getRegistroActivo() {
		return registroActivo;
	}

	public void setRegistroActivo(Boolean registroActivo) {
		this.registroActivo = registroActivo;
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

}
