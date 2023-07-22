package Level1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Корм", "Серый", 5, "Тёма" );
        Animal dog = new Dog("Кости", "Чёрный", 12, "Шарик" );

        Veterinarian doctor = new Veterinarian("Валерий");
        doctor.treatment(cat);
        System.out.println();
        doctor.treatment(dog);



    }
}
