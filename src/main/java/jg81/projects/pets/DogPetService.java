package jg81.projects.pets;

public class DogPetService implements PetService {
	@Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
