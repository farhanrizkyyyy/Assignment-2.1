import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tahun: "); // input tahun
        int year = scanner.nextInt();
        boolean leap = isLeapYear(year); // assign hasil return method isLeapYear ke variabel leap

        // statement dari nilai variabel leap
        if (leap) System.out.println("Tahun " + year + " adalah tahun kabisat.");
        else System.out.println("Tahun " + year + " bukan tahun kabisat.");
    }

    public static boolean isLeapYear(int year) {
        // inisialisasi nilai false ke variabel leap
        boolean leap = false;
        // jika statement terpenuhi, nilai leap berubah menjadi true
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) leap = true;
        return leap;
    }
}