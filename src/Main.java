
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String res = obj.meth();
        System.out.println(res);

    }
}

class A{

    String meth(){
        return "Invoking method from class A";
    }

}

class B extends A{
    String meth() {
        return "Method is Overridden in Extended class B";
    }
}