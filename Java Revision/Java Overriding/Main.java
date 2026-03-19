class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }

}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a=new Dog();
//        Dog D=new Dog();
//        D.sound();
      a.sound();
//        D.sound();
    }
}