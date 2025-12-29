public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter();

        Pet dog = new Dog("Bobik", 3, "Labrador");
        Pet cat = new Cat("Pushistik", 2, true);

        shelter.addPet(dog);
        shelter.addPet(cat);

        shelter.showPets();

        Adopter adopter = new Adopter("Aruzhan", 19);

        shelter.adoptPet(adopter, dog);

        System.out.println("\nAdopter info:");
        System.out.println(adopter);

        System.out.println("\nShelter now:");
        shelter.showPets();
    }
}
