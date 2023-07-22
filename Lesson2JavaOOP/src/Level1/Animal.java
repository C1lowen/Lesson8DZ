package Level1;

public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice(){
        return "Подать голос:";
    }

    void eat(){
        System.out.println("Есть");
    }

    void sleep(){
        System.out.println("Спать");
    }
}
