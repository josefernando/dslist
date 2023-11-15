package br.com.bicam.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.bicam.dslist.dto.GameDTO;
import br.com.bicam.dslist.dto.GameMinDTO;
import br.com.bicam.dslist.entities.Game;
// import br.com.bicam.dslist.entities.Game;
import br.com.bicam.dslist.repositories.GameRepository;

@Service
//  ou @Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO gameDTO = new GameDTO(result);
        return gameDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDTO> dto 
        = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
