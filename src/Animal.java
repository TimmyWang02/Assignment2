public abstract class Animal {
     String name;
     int    age;
     String sex;
     double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Animal(){

}
    public Animal(String name,int age,String sex,double price){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.price=price;
    }
 public  abstract String toString();
}
