package br.com.bicam.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.bicam.dslist.dto.GameListDTO;
import br.com.bicam.dslist.dto.GameMinDTO;
import br.com.bicam.dslist.repositories.GameListRepository;
import br.com.bicam.dslist.repositories.GameRepository;

@Service
//  ou @Component
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        List<GameListDTO> dto 
        = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id){
        var result = gameRepository.searchByList(id);
        List<GameMinDTO> dto 
        = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}