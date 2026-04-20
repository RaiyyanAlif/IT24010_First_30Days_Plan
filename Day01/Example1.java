class Smartphone {
    String brand;
    int storageGb;

    void checkSpecs() {
        System.out.println(brand + " with " + storageGb + "GB storage.");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.brand = "Apple";
        myPhone.storageGb = 256;

        Smartphone yourPhone = new Smartphone();
        yourPhone.brand = "Samsung";
        yourPhone.storageGb = 512;

        myPhone.checkSpecs();
        yourPhone.checkSpecs();
    }
}