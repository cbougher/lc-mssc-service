package guru.springframework.lcmsscservice.web.controller;

import guru.springframework.lcmsscservice.web.model.BeerDto;
import guru.springframework.lcmsscservice.web.model.BeerStyleEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public BeerDto get(@PathVariable UUID beerId) {
        return BeerDto.builder().build();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody BeerDto beerDto) {

    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {

    }
}
