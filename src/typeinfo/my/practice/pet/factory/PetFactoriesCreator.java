package typeinfo.my.practice.pet.factory;


import typeinfo.factory.Factory;
import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dulili on 2018/2/11.
 */
public class PetFactoriesCreator extends PetCreator{
    private static List<Factory<? extends Pet>> petFactoryList = new ArrayList<>();
    static {
        petFactoryList.add(Dog.FACTORY);
        petFactoryList.add(Cat.FACTORY);
    }

    @Override
    public List<Class<? extends Pet>> types(){
        List<Class<? extends Pet>> typeList = new ArrayList<>();
        for (Factory<? extends Pet> factory : petFactoryList) {
            typeList.add(factory.create().getClass());
        }
        return typeList;
    }

    public static void main(String[] args) {
        System.out.println(new PetFactoriesCreator().types());
    }

}
