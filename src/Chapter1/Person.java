package Chapter1;

public class Person {
    void speakHello(){
        System.out.println("nice to meet you");
    }
}

class Xiti{
    public static void main(String[] args) {
        Person zhang=new Person();
        zhang.speakHello();
    }
}
