public interface AnimalShop {
    public abstract void Off();
    public abstract void buyAnimal(Animal animal) throws InsufficientBalanceException;
    public abstract void welcome(Customer customer,Animal animal);

}
