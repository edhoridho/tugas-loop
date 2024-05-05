import java.util.Scanner;

public class TebakAngka {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int randomNumber = (int) (Math.random() * 10 + 1); // Generate random number dari (between) 1 sampai 10
    int guessCount = 0; // menghitung attempt
    int guess; // INPUTAN TEBAKAN USER

    System.out.println("Saya sedang memikirkan sebuah angka antara 1 dan 10.");
    System.out.println("Coba tebak angkanya! Kamu punya 5 kesempatan.");

    do {
      guessCount++;
      System.out.print("Tebakan ke-" + guessCount + ": ");
      guess = scanner.nextInt();

      if (guess < randomNumber) {
        System.out.println("Terlalu rendah. Coba lagi!");
      } else if (guess > randomNumber) {
        System.out.println("Terlalu tinggi. Coba lagi!");
      }
    } while (guess != randomNumber && guessCount < 5);  //untuk mengulang kesempatan tebakan 

    scanner.close();

    if (guess == randomNumber) {
      System.out.println("Selamat! Kamu berhasil menebak angkanya dalam " + guessCount + " kali tebakan.");
    } else {
      System.out.println("Yahh kesempatanmu sudah habis! Angka yang saya pikirkan adalah " + randomNumber + ".");
    }
  }
}
