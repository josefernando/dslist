package br.com.bicam.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bicam.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
