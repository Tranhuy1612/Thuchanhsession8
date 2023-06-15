package thuchanh1.rikkeiacademy;

import thuchanh1.rikkeiacademy.Animal;
import thuchanh1.rikkeiacademy.Cat;
import thuchanh1.rikkeiacademy.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lợn");
        Dog dog1 = new Dog("bull", "Black");
        Dog dog2 = new Dog("bull", "White");
        Cat cat = new Cat("hải");
        System.out.println("Tên  : " + animal.getName());
        animal.setName("aaaaa");
        System.out.println("Tên  : " + animal.getName());
        animal.setName("bbbbb");
        System.out.println("tên : " + dog1.getName());
        System.out.println("Sound : " + dog1.makeSound());
        System.out.println("Màu : " + dog1.getColor());
        System.out.println("Sound : " + dog2.makeSound());
        System.out.println("tên : " + cat.getName());
        System.out.println("tên : " + cat.makeSound());


    }
}