package Phone;

public class Runner {
    Phone phone = new Phone(3566556, "Honor", 125.26);
    Phone phone2 = new Phone(8265417, "Iphone", 86.789);
    Phone phone3 = new Phone(6936151, "Nokia3310", 45.8562);


    public void printPhone() {
        System.out.println("Модель телефона: " + phone2.getModel() + " Номер телефона: " + phone2.getNumber() + " Вес: " + phone2.getWeight());
        System.out.println("Модель телефона: " + phone.getModel() + " Номер телефона: " + phone.getNumber() + " Вес: " + phone.getWeight());
        System.out.println("Модель телефона: " + phone3.getModel() + " Номер телефона: " + phone3.getNumber() + " Вес: " + phone3.getWeight());
    }
}