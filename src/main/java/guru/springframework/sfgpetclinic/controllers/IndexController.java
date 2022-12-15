package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.ValueNotFoundException;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler(){
        throw new ValueNotFoundException();
    }
}
