package mx.post.entidad;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_post")
	private Integer idPost;

	@Column(name = "post")
	private String post;

	@Column(name = "id_persona")
	private Integer idPersona;

	@Column(name = "id_libro")
	private Integer idLibro;

	@Column(name = "me_gusta")
	private Integer meGusta;

	@Column(name = "registro_activo")
	private Boolean registroActivo;

	@Column(name = "fecha_alta")
	private ZonedDateTime fechaAlta;

	@Column(name = "fecha_modificacion")
	private ZonedDateTime fechaModificacion;

	public Post() {
	}

	public Post(String post, Integer idPersona, Integer idLibro, Integer meGusta, Boolean registroActivo,
			ZonedDateTime fechaAlta, ZonedDateTime fechaModificacion) {
		super();
		this.post = post;
		this.idPersona = idPersona;
		this.idLibro = idLibro;
		this.meGusta = meGusta;
		this.registroActivo = registroActivo;
		this.fechaAlta = fechaAlta;
		this.fechaModificacion = fechaModificacion;
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
