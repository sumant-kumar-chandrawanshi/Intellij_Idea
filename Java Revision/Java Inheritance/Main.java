class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.barks();
        d.eat();
    }
}
//class Main{
//
//}