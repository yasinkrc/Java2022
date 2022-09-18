public class Main {
    public static void main(String[] args) {

        // For döngüsü

        for(int i = 1 ; i<10 ; i++){

            System.out.println(i);

        }

        System.out.println(" Döngü bitti ");
        for(int i = 2 ; i<10 ; i+=2){

            System.out.println(i);

        }

// While döngüsü
        int i = 1 ;

        while (i<10 ){


            System.out.println(i);
            i++;

        }
        System.out.println("While döngüsü  bitti ");


        int j =0 ;

        do {

            System.out.println(j);
            j+=2;
// Şart olmazsa bile do while de bir kere çalışır
        }while(j<10);


    }
}