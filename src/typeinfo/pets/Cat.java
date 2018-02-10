//: typeinfo/pets/Cat.java
package typeinfo.pets;

import typeinfo.factory.Factory;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public static Factory<? extends Pet> FACTORY = new Factory<Pet>() {
        @Override
        public Pet create() {
            return new Cat();
        }
    };
} ///:~
