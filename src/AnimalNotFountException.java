public class AnimalNotFountException extends RuntimeException{
    public AnimalNotFountException(){
        super();
        System.out.println("No animal is in the shop");
    }
}
