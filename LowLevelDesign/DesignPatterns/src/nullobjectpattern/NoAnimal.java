package nullobjectpattern;

public class NoAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("Animal bhag gya ghar se, animal likes bahar ka khana");
    }

    @Override
    public String getAnimalId() {
        return ""; // return empty string instead of failing with null
    }
}
