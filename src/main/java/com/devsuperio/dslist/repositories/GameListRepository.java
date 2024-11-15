package com.devsuperio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.dslist.entities.GameList;

//responsável para fazer consultas no banco de dados
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
