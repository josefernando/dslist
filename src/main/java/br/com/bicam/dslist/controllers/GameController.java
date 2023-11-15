package br.com.bicam.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bicam.dslist.dto.GameMinDTO;
import br.com.bicam.dslist.entities.Game;
import br.com.bicam.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){

        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
