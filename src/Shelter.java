import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " added to shelter.");
    }

    public void showPets() {
        System.out.println("\n--- Pets in shelter ---");
        if (pets.isEmpty()) {
            System.out.println("No pets available.");
            return;
        }

        for (Pet pet : pets) {
            System.out.println(pet + ", sound: " + pet.makeSound());
        }
    }

    public void adoptPet(Adopter adopter, Pet pet) {
        if (!pets.contains(pet)) {
            System.out.println("This pet is not in the shelter.");
            return;
        }

        adopter.adoptPet(pet);
        pets.remove(pet);
        System.out.println("Pet adopted successfully!");
    }
}

