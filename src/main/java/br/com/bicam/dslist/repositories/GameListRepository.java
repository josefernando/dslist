package br.com.bicam.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bicam.dslist.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{}