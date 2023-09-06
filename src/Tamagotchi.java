public class Tamagotchi {
    protected int id;
    protected int age;
    protected int hunger;
    protected int happiness;
    protected int discipline;
    protected boolean hasShit;
    protected boolean needsVaccine;
    protected boolean isSleeping;
    protected boolean lights;

    public Tamagotchi(int id) {
        this.id = id;
        this.age = 0;
        this.hunger = 2;
        this.happiness = 0;
        this.discipline = 0;
        this.hasShit = false;
        this.needsVaccine = false;
        this.isSleeping = false;
        this.lights = false;
    }

    public void IncreaseHappiness(int value) {
        this.happiness = this.happiness + value;
    }
}
