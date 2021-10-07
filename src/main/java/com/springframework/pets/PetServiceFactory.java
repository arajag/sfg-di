package com.springframework.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType){
            case "dog":
            default:
                return new DogPetService();
            case "cat":
                return new CatPetService();
        }
    }
}
