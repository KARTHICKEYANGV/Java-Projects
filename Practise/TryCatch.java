public class TryCatch {
    public static void main(String[] args) {
        int i = 0;
        int size = 5;
        int arr[] = new int[5];
        try{
            int div = 10/i;
            int mult = arr[size];
        }
        catch(ArithmeticException a){
            System.out.println("Dont divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException a1){
            System.out.println("Array size is "+size);
        }
        catch(Exception e){
            System.out.println("Exception"+e);
        }
    }
}
