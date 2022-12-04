import java.time.LocalDate;

public class Customer {
  String name;
  int    time;
  LocalDate inShop;

  public Customer(String name,int time,LocalDate inShop){
    this.name=name;
    this.time=time;
    this.inShop=inShop;
  }
  @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", inShop=" + inShop +
                '}';
    }
}
