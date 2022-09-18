public class Main {
    public static void main(String[] args) {

        char grade = 'L' ;

        switch (grade){

            case 'A':
                System.out.println(" Güzel puan ");
                break ;
            case 'B' :
                System.out.println("İyi puan ");
                break ;
            case 'C':
                System.out.println("Vasatın üstü");
               break ;
            case 'D' :
                System.out.println(" Kotu ");
                break;
            case 'F' :
                System.out.println(" Yaşamayı hak etmiyorsun ");
                break;
            default:
                System.out.println(" tek bir sonuc var o da sınava girmemissin ");

        }
// Eger birden fazla seçmek istiyorsan Sout larıı silmen gerekecek


    }
}