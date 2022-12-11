
public class Main {
    public static class A{

        public String meth(){
            return "Invoking method from class A";
        }

    }
    public static class B extends A{
        public String meth() {
            return "Method is Overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        String res = obj.meth();
        System.out.println(res);

    }
}



