class NotMeException extends Exception{
    public NotMeException(String string){
        super(string);
    }
}


public class CreatingException {
    public static void main(String[] args) {
        String name = "Karthii";
        try{
        if(!name.equals("Karthi")){
            throw new NotMeException("This is not me");
        }
    }
        catch(NotMeException e){
            System.out.println(e);
        }
    }
}
