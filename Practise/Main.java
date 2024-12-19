class Main{
    public void show(){
        System.out.println("Obj method");
    } 
    public static void main(String[] args) {
        Main main = new Main()
        {
            public void show(){
                System.out.println("Anonymous class");
            }
        };
        main.show();
    }
}