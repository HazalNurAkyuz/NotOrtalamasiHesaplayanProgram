import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner notOrtalamasıHesaplama = new Scanner(System.in);
        int vizeSinavi,quiz,finalSinavi;
        double ortalama;

        System.out.print("Vize Sinavi Notunu Giriniz:");
        vizeSinavi = notOrtalamasıHesaplama.nextInt();

        System.out.print("Quiz Notunu Giriniz:");
        quiz = notOrtalamasıHesaplama.nextInt();

        System.out.print("Final Sinavi Notunu Giriniz");
        finalSinavi = notOrtalamasıHesaplama.nextInt();

        ortalama = (vizeSinavi * 0.4) + (quiz * 0.2) + (finalSinavi * 0.4);
        System.out.println("Not Ortalamasi:" + ortalama);
        String sonuc = (ortalama >=50) ? "Gectiniz" : "Kaldiniz";
        System.out.println(sonuc);

    }
}