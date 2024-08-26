package com.unir.books.model.pojo;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "unir_vis_cat_libros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BookVista {
	 @Id
	//  @GeneratedValue(strategy = GenerationType.AUTO)
	 private int cve_id;
	 @Column(name = "nom_titulo", unique = true)
	 private String titulo;
	 @Column(name = "nom_autor")
	 private String autor;
	 @Column(name = "num_anio_publicacion")
	 private String anioPublicacion;
	 @Column(name = "des_sinopsis")
	 private String sinopsis;
	 @Column(name = "cve_isbn10", unique = true)
	 private String isbn10;
	 @Column(name = "cve_isbn13", unique = true)
	 private String isbn13;
	 @Column(name = "des_criticas")
	 private String criticas;
	 @Column(name = "dat_imagen_portada")
	 private String imagenPortada;
	 @Column(name = "bnd_visible")
	 private Boolean visible;
     @Column(name = "generos")
	 private String generos;
	@Override
	public String toString() {
		return "Book [titulo=" + titulo + "]";
	}	
	 
	 
}