public class Dog extends  Animal{
    boolean isVaccineInjected;
public Dog(){
    super();
    this.price=100;
}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isVaccineInjected=" + isVaccineInjected +
                '}';
    }
}
