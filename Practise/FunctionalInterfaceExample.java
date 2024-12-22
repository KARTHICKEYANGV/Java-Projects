public class FunctionalInterfaceExample {
    public static void main(String[] args) {
       A obj = (int i,int j) -> i+j;
       int result = obj.sum(8,8);
       System.out.println(result);
    }
}

@FunctionalInterface
interface A {
    int sum(int i,int j);
}
