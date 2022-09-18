import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        char harf ='E';

        //  Ünlü harfler a ,e ü ,u , i ,ı ,ö , o


        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':

                System.out.println(" KALIN SESLİ HARF");
                break;

            case 'Ö':
            case 'E':
            case 'İ':
            case 'Ü':
                System.out.println(" İnce sesli HARF ");

        }


    }
}