public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (i=0;i<15;i++){
            System.out.println(this.getName() +":"+i);
        }
    }
    public static void main(String[] args){
        for (int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName() + "正在执行: " + i);
            if (i==10){
                FirstThread T1=new FirstThread();
                T1.setName("qwer");
                T1.start();
                new FirstThread().start();
            }
        }
    }
}

