public class Main {
    public static void main(String[] args) {

// Mükkemel sayı
        // 6 >> 1 , 2 , 3
        // 28>> 1 , 2 , 4 , 7 ,14

        //int number =5 ;
        int number =6 ;

        int total =0;
        for(int i = 1 ; i<number ; i++){


            if(number%i==0){

                total=total+i;



            }
        }

        if(number==total){


            System.out.println(" Sayi mükkemel sayıdır ");

        }else {


            System.out.println(" sayı mükkemel sayı değildir ");
        }
    }
}