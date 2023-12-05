package com.groupdnd.board.model.web.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.groupdnd.board.model.*;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class BoardController {
    private final RestTemplate restTemplate;
    private final Board board;

    public BoardController() {
        this.board = new Board();
        this.restTemplate = new RestTemplate();

    }

    @GetMapping("/board")
    public Board getBoard() {
        return board;
    }

    @PostMapping("/hero/{id}")
    public Board addHero(@PathVariable int id) {
        String url = "http://172.22.114.100:9091/players/" + id;
        url = "https://mocki.io/v1/79a85077-896d-4bcc-a402-c17f8a7268b2"; // URL DE TEST EN ATTENDANT...
        HeroCase hero = restTemplate.getForObject(url, HeroCase.class);
        board.addElementToBoard(hero);
        return board;
    }

    @PostMapping("/enemy")
    public Board addEnemies(@RequestBody EnemyCase enemy, @PathVariable int numTiles) {
        for (int i = 0; i < numTiles; i++) {
//        String url = "http://172.22.114.100:9091/players";
//        return restTemplate.getForObject(url, List.class);
            board.addElementToBoard(enemy);
        }
        return board;
    }

    @PostMapping("/empty/{numTiles}")
    public Board addEmptyCase(@PathVariable int numTiles) {
        for (int i = 0; i < numTiles; i++) {
            board.addElementToBoard(new EmptyCase(i));
        }
        return board;
    }

//    @PostMapping("/save")
//    public void saveBoard() {
//        boardDAO.save(board);
//    }

    public void createBoard() {
        addEmptyCase(32);
        addEnemies("Gobbo");
    }


    @Operation(summary = "Gets a board by its id")
    @GetMapping("/board/{id}")
    public JSONPObject showBoard(@Valid @PathVariable int id) {
        String url = "https://mocki.io/v1/11445ed3-5a21-4d27-8144-bb71f7863e20 ";
        return restTemplate.getForObject(url, JSONPObject.class);
    }


//    @PostMapping("/board")
//    public Board createElementOnBoard(){
//        String url = "http://localhost:9091/player";
//        HttpEntity<Board> request = new HttpEntity<>(new Board());
//        return restTemplate.postForObject(url, request, Board.class);
//    }

}
