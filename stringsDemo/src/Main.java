public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel ";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı :"+mesaj.length());
        System.out.println(" 5 . elemanı nedir "+mesaj.charAt(4));
        System.out.println(mesaj.concat(". Yaşasın !"));
        System.out.println("dogru mu "+mesaj.startsWith(" B "));
        System.out.println("dogru mu "+mesaj.endsWith("."));
        char karekterler [] = new char[5];
        mesaj.getChars(0,5,karekterler, 0); // void li bir şey ama döndürmüyor
        System.out.println(karekterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));
        */


      //   System.out.println(mesaj.replace(" " , "-"));
String yeniMesaj  = mesaj.replace(" " , "-");
        System.out.println(yeniMesaj);
      //  System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

      for(String kelime : mesaj.split(" ")){


          System.out.println(kelime);

      }
        System.out.println(mesaj.toLowerCase());

        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());
    }
}