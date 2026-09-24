
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog barks");
    }
}
class cat extends Animal{
     public void sound(){
        System.out.println("cat meows");
     }
}
class cow extends Animal{
    public void sound(){
        System.out.println("cow moo..s");
    }
}

public class Myproject1 {
    public static void main(String[] args) {
        cat c1 = new cat();
        Dog d1 = new Dog();
        cow c2 = new cow();
        d1.sound();
        c1.sound();
        c2.sound();
    }
}

