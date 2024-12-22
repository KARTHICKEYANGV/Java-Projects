public class ThrowException {
    public static void main(String[] args) {
        int i = 0;
        int divide = 0;
        try{
        divide = 10/i;
        if(i == 0) throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            divide = 10/1;
            System.out.println("Default division");
        }
        System.out.println(divide);

        
    }
}
