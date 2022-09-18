public class Main {
    public static void main(String[] args) {
        //  En büyük sayıyı bulma
   int sayi1=20;
   int sayi2=25;
   int sayi3=2;
   // önce ben :)
/*
      if(sayi1>sayi2&&sayi1<sayi3){
          System.out.println(" En buyuk sayi sayibirdir ve degeri"+sayi1);


      }
else if (sayi2>sayi1&&sayi2>sayi3){

    System.out.println(" En buyuk sayı sayı2 dir ve degeri"+sayi2);

      }
      else {


          System.out.println(" en buyuk sayı sayı3 tur ve degeri"+sayi3);
      }

 */

        // Hocanın Çözümü


        int buyukSayi=sayi1;

        if(sayi1<sayi2){

            buyukSayi=sayi2;


        }

        if(sayi1<sayi3){

            buyukSayi=sayi3;


        }
        System.out.println("en buyuk sayi "+buyukSayi);
    }

}