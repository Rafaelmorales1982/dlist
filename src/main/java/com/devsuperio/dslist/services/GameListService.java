package com.devsuperio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperio.dslist.dto.GameListDTO;
import com.devsuperio.dslist.entities.GameList;
import com.devsuperio.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    // Lista do GameListDTO resumo que quero que apareça
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() { // retorna uma lista da classe GameListDTO
        // Pesquisando no banco uma lista de games
        List<GameList> result = gameListRepository.findAll();

        // Transformando lista GameList para GameListDTO
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}