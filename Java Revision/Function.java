public class Function {
    public void hello(){
        System.out.println("hello");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }

    public void prod(int a,int b){
        System.out.println(a*b);
    }


    public static void main(String[] args) {
        Function obj=new Function();
        obj.hello();
        obj.add(10,30);
        obj.sub(30,10);
    }

}