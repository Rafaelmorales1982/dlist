package com.devsuperio.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperio.dslist.dto.GameDTO;
import com.devsuperio.dslist.dto.GameMinDTO;
import com.devsuperio.dslist.services.GameService;

//porta da entrada é a interface pela eaa api que chama para mundo externo

@RestController
@RequestMapping(value = "/games")//caminho para responder na api utililzar no postman http://localhost:8080/games

public class GameController {

	@Autowired
private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
}
