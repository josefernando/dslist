package br.com.bicam.dslist.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicam.dslist.dto.GameMinDTO;
// import br.com.bicam.dslist.entities.Game;
import br.com.bicam.dslist.repositories.GameRepository;

@Service
//  ou @Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){

        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        
        return dto;
    }

}
