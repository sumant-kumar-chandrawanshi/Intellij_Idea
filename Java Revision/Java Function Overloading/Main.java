class Test {

    void show(int a) {
        System.out.println("Int: " + a);
    }

    void show(String b) {
        System.out.println("String: " + b);
    }
}
class Main{
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10);
        t.show("Sachin");
    }
}

