import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop{
    double balance;
    ArrayList animalList;
    ArrayList cosList;
    LocalDate isOpen;
    double cost=0;
    double earn=0;

    @Override
    public void buyAnimal(Animal animal) throws InsufficientBalanceException {

        if (balance-animal.price<0){//如果钱不够，抛出异常
            try {
                throw new InsufficientBalanceException();
            }catch (InsufficientBalanceException e){

            }
        }else
        {
            animalList.add(animal);//购买动物成功
            balance=balance-animal.price;
            cost=cost+animal.price;
            System.out.println("Buy "+animal.name+" successfully");

        }
    }

    @Override
    public void welcome(Customer customer,Animal animal)throws AnimalNotFountException {
        cosList.add(customer);
        if (animalList.isEmpty()){
           try {
               throw  new AnimalNotFountException();
           }catch (AnimalNotFountException e){

           }
        }else {

            toString(animal);
            balance=balance+animal.price;
            animalList.remove(animal);
            balance=balance+animal.price;
            earn=earn+animal.price;
            System.out.println(customer.name+" has bought "+animal.name+" successfully");

        }
    }
    public void Off(){
        System.out.println(cosList.toString());
        double profit=earn-cost;//计算理论
        System.out.println("The profit is"+profit);
    }
    public static  String toString(Animal animal){
        return "Animal{" +
                "name='" + animal.name + '\'' +
                ", age=" + animal.age +
                ", sex='" + animal.sex + '\'' +
                ", price=" + animal.price +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList animalList) {
        this.animalList = animalList;
    }

    public ArrayList getCosList() {
        return cosList;
    }

    public void setCosList(ArrayList cosList) {
        this.cosList = cosList;
    }

    public LocalDate getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(LocalDate isOpen) {
        this.isOpen = isOpen;
    }



}
