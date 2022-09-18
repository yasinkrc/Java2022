public class Main {
    public static void main(String[] args) {


        double myLiat [] = { 1,2,3,4,5,6} ;
        double total =0 ;
        double max =myLiat[0];
        for (Double numbers : myLiat){
            if(max<numbers){
         max=numbers;
            }
            total=numbers+total;
            System.out.println(numbers);
        }
        System.out.println("Toplam :"+total);
        System.out.println("en buyuk sayi :"+max);

    }
}