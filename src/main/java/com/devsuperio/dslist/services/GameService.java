package com.devsuperio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperio.dslist.dto.GameDTO;
import com.devsuperio.dslist.dto.GameMinDTO;
import com.devsuperio.dslist.entities.Game;
import com.devsuperio.dslist.projections.GameMinProjection;
import com.devsuperio.dslist.repositories.GameRepository;

//registrando como componente do sistema
@Service
public class GameService {
 //injetando gameRepository dentro do GameService
	@Autowired
	private GameRepository gameRepository;
	
	
	
	
	//lista do MinDTA resumo que quero que apareça
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){//retorna uma lista da classe GameMinDTO
		//pesquisando no banco uma lista de games
		List<Game> result = gameRepository.findAll();
		
		//transformando lista Game para GameMinDTO
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
	//criando um metodo para pegar o id para fazer a busca pelo id
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){//retorna uma lista da classe GameMinDTO
		//pesquisando no banco uma lista de games
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		
		//transformando lista Game para GameMinDTO
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
	
}
