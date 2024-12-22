class Demo{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
       
    }
}


public class throwsException {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try {
            obj.show();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        
    }
}
