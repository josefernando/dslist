package br.com.bicam.dslist.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicam.dslist.dto.GameMinDTO;
import br.com.bicam.dslist.entities.Game;
import br.com.bicam.dslist.repositories.GameRepository;

@Service
// @Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){

        var result = gameRepository.findAll();
        // List<Game> = gameRepository.findAll();
        
        return result;
    }

}
