package Level1;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void treatment(Animal animal){
        animal.eat();
        String voice = animal.getVoice();
        animal.sleep();

        if(voice == "ГАВ") {
            System.out.println("Ветеренар "+ this.name +" лечит: Собаку");
        }else {
            System.out.println("Ветеренар "+ this.name +" лечит: Кота");
        }
    }
}
