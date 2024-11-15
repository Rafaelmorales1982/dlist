package com.devsuperio.dslist.dto;

import com.devsuperio.dslist.entities.Game;
import com.devsuperio.dslist.projections.GameMinProjection;

public class GameMinDTO {

//Classe criado para mostrar apenas que eu quero	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	//construtor sem argumentos
	public GameMinDTO() {
		
	}
	//construtor com argumento
	//(Game entity) copia os dados que ja existem na entidade do banco de dados
	public GameMinDTO(Game entity) {
		
		id = entity.getId();//pegando a entidade
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription =entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		
		id = projection.getId();//pegando a entidade
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription =projection.getShortDescription();
	}

	
	
	//Fazendo apenas os geters para pegar as informações
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	

	
	
}
