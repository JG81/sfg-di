package jg81.projects.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jg81.projects.pets.PetService;

@Controller
public class PetController {

    private final PetService petService;
    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
