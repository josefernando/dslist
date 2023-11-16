package br.com.bicam.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.bicam.dslist.dto.GameListDTO;
import br.com.bicam.dslist.repositories.GameListRepository;

@Service
//  ou @Component
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        List<GameListDTO> dto 
        = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}