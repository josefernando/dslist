package br.com.bicam.dslist.dto;

import br.com.bicam.dslist.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameList list){
        this.id = list.getId();
        this.name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}