package mode;

/**
 * Created by dulili on 2018/1/11.
 */
public class FactoryMode1 {
    static void action(AnimalFactory animalFactory) {
        animalFactory.produce().bark();
    }

    public static void main(String[] args) {
//        action(new DogFactory());
//        action(new CatFactory());
        action(Dog.ANIMAL_FACTORY);
        action(Cat.ANIMAL_FACTORY);
    }
}

interface Animal {
    void bark();
}

interface AnimalFactory {
    Animal produce();
}

class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("ÍúÍú£¡");
    }

    public static AnimalFactory ANIMAL_FACTORY = new AnimalFactory() {
        @Override
        public Animal produce() {
            return new Dog();
        }
    };
}


class Cat implements Animal {
    @Override
    public void bark() {
        System.out.println("ß÷ß÷£¡");
    }

    public static AnimalFactory ANIMAL_FACTORY = new AnimalFactory() {
        @Override
        public Animal produce() {
            return new Cat();
        }
    };
}

//class DogFactory implements AnimalFactory {
//    @Override
//    public Animal produce() {
//        return new Dog();
//    }
//}
//
//class CatFactory implements AnimalFactory {
//    @Override
//    public Animal produce() {
//        return new Cat();
//    }
//}



