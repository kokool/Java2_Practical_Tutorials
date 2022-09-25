package Chapter1;

public class People {
    int height;
    String ear;
    void speak(String s){
        System.out.println(s);
    }
}

class A{
    public static void main(String[] args) {
        People One;
        One=new People();
        One.height=170;
        One.ear="两只大耳朵";
        System.out.println("身高："+One.height+" cm");
        System.out.println(One.ear);
        One.speak("提桶跑路，Java太难");
    }
}
