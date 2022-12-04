import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyAnimalShop shop=new MyAnimalShop();
        Cat  cat1=new Cat();
        Cat  cat2=new Cat();
        Dog  dog1=new Dog();
        Dog  dog2=new Dog();
        Dragon dragon1=new Dragon();
        cat1.setName("cat1");
        cat2.setName("cat2");
        dog1.setName("dog1");
        dog2.setName("dog2");
        dragon1.setName("dragon1");
       Customer Timmy=new Customer("Timmy",1, LocalDate.of(2022,12,01));
       Customer Amy=new Customer("Amy",2,LocalDate.of(2022,12,02));



        shop.setBalance(100);
       shop.cosList=new ArrayList<>(10);
       shop.animalList=new ArrayList<>(10);
        shop.buyAnimal(cat2);
        shop.welcome(Timmy,dragon1);
        shop.animalList.add(dog1);
        shop.animalList.add(dog2);
        shop.welcome(Timmy,dog1);
        shop.welcome(Amy,dragon1);



    shop.Off();


    }
}
