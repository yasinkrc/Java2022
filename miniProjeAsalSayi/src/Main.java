public class Main {
    public static void main(String[] args) {
//int number =2 ;
        //int number = 25  ;
        int number =1 ;

        if(number==1){

            System.out.println(" sayı asal değildir ");
        return;
        }
        if(number<2){

            System.out.println("sayı geçersiz");
        }
int remainder = number%2;
        System.out.println(remainder);
        boolean isPrime = true ;
        for(int i = 2 ; i<24 ; i++){


if(number%i==0){

    isPrime=false;



}


        }

        if(isPrime){

            System.out.println(" sayı asal dir ");
        }
        else {

            System.out.println(" Sayı asal değildir ");
        }
    }
}