package com.farmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

<<<<<<< HEAD:Java/spring-tools/entregar-projeto-blog/src/main/java/com/blogpessoal/model/Postagem.java
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Entidade
@Table(name="tb_postagens") //transformar em tabela
public class Postagem {	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id; //long é o Bigint
		@NotBlank
		@Size(min = 3 ,max = 255)
		private String titulo;
		@NotBlank
		@Size(min = 5 ,max = 1000)
		private String texto;
		@UpdateTimestamp
		private LocalDateTime data;
		
		@ManyToOne
		@JsonIgnoreProperties("postagens")
		private Tema tema;
		
		public Tema getTema() {
			return tema;
		}
		public void setTema(Tema tema) {
			this.tema = tema;
		}
		public Long getId() {
			return id;
		}	
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public LocalDateTime getData() {
			return data;
		}
		public void setData(LocalDateTime data) {
			this.data = data;
		}

}
=======
@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min= 3, max= 100)
	private String nome;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Size(min = 5, max = 200)
	private String descricao;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
}
>>>>>>> estudo:Java/spring-tools/farmacia/src/main/java/com/farmacia/model/Produto.java
