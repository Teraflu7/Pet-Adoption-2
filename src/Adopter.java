public class Adopter extends Person {
    private Pet pet;
    public Adopter(String name, int age) {
        super(name,age);
    }
    public void adoptPet(Pet pet) {
        this.pet = pet;
    }
    public Pet getPet() {
        return pet;
    }
    @Override
    public String toString() {
        if (pet == null) {
            return super.toString() + "has not adopted a pet yet.";
        }
        return super.toString() + "adopted" + pet;
    }
}
