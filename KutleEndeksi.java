import java.util.Scanner;
public class KutleEndeksi {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       double oran,boy,kilo;
        System.out.println("Boy uzunlugunuz:");
        boy = input.nextDouble();
        System.out.println("Kutleniz:");
        kilo = input.nextDouble();
        oran = kilo/(boy*boy);
        System.out.println("Kütle Endeksi:" +oran);
    }
}