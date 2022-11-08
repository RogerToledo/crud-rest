package me.restcrud.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class GrettingsController {

    @RequestMapping(value = "/mostranome/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String grettingText(@PathVariable String name){

        return "Hello " + name + "!";
    }

    @RequestMapping(value = "/olamundo/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String olaMundo(@PathVariable String name) {

        return "Olá Mundo " + name;
    }
}
