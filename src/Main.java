import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tasha", -8);
        cat1.setName("usha");
        //cat1.setAge(-6);


        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

    }

}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("error");
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("error! we cant");
        }
    }
}


