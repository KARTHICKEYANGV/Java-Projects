class ThreadsIntro extends Thread{
    public static void main(String[] args) {
        Runnable obj = () ->
        {
            for(int i=0;i<10;i++){
                System.out.println("Spidey");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                }
        };
        Runnable obj1 = () ->
        {
            for(int i=0;i<10;i++){
                System.out.println("Batman");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}
