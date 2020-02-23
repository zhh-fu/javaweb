public class SecondThread implements Runnable {
    private int i;


    @Override
    public void run() {
        for (i=0;i<300;i++){
            System.out.println(Thread.currentThread().getName() +":"+i);
        }
    }
    public static void main(String[] args){
        try {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + "正在执行: " + i);
                if (i == 10) {

                    /*FirstThread T1=new FirstThread();
                    T1.setName("qwer");
                    T1.start();
                    new FirstThread().start();*/

                    SecondThread target = new SecondThread();
                    //new Thread(target, "测试线程1").start();
                    Thread.sleep(1);
                    Thread T1 = new Thread(target, "测试线程1");
                    T1.setDaemon(true);
                    T1.start();
                    System.out.println(T1.isAlive());



                    //new Thread(target, "测试线程2").start();
                }

            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
