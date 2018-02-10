//: typeinfo/pets/Dog.java
package typeinfo.pets;

import typeinfo.factory.Factory;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    public static Factory<? extends Pet> FACTORY = new Factory<Pet>() {
        @Override
        public Pet create() {
            return new Dog();
        }
    };
} ///:~
