public class Main {
    public static void main(String[] args) {

        String mesaj = " Bugun hava çok güzel .";
       String yeniMesaj =  mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi =topla(5,7);
        System.out.println(sayi);
        int toplam=topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }

    public static  void ekle(){
        System.out.println(" eklendi");

    }
    public static void sil(){
        System.out.println(" eklendi");


    }
    public static void guncelle(){

        System.out.println(" eklendi");


    }

    public static int topla (int sayi1 , int sayi2){

      return 0 ;

    }
    public static int topla2(int... sayilar ){

        int toplam =0 ;
        for(int sayi : sayilar){

            toplam=toplam+sayi;

        }
        return toplam;
    }
    public static String sehirVer(){


        return " Ankara";

    }


}