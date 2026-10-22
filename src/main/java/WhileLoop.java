public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("while-Loop");
        int i = 0;
        while(i < 5) {
            System.out.println("I love Java");
            i ++;
        }


        System.out.println("Do-While  loop: ");
        i =0;
        do{
            System.out.println("I love Java");
            i ++;
        }while(i < 5);



        System.out.println("For-Loop");
        for( i = 10;i >= 1  ;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");


    }


}
