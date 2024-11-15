package com.devsuperio.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Anotation utilizada para utilizar uma tabela do banco relacional
//mapeando objeto Game para virar um registro
@Entity

//Anotation nome da tabela do banco
@Table(name = "tb_game")

//Classe que representa um jogo
public class Game {
//deixando chave primaria na tabela do banco
	@Id
	//id auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	//mudando nome year porque essa palavra é reservada no banco de dados
	//customizando a palavra como game_year
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT")//tipo texto
	private String shortDescription;
	@Column(columnDefinition = "TEXT")//tipo texto
	private String longDescription;
	
	//método construtor sem argumentos
	public Game() {
		
	}

	//construtor com argumentos
	public Game(Long id, String title, Integer year, String genre, String platforms,Double score, String imgUrl,
			String shortDescription, String longDescription) {
		//this.id e do objeto e id sozinho é o argumento que esta no parâmetro
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	//Criando método get e set

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platforms;
	}

	public void setPlatform(String platform) {
		this.platforms = platform;
	}
	
	

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
	//Método para comparar se os Games são iguais dentro de umna lista

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	


	
}
