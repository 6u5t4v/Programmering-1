package Opgave_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SongApp {
    public static void main(String[] args) {
        Song lff = new Song("Lille Frække Frederik", "Bamse", 148);
        Song hpb = new Song("Hjulene på Bussen", "Ukendt", 150);

        lff.printSong();
        hpb.printSong();

        hpb.setBpm(160);
        hpb.printSong();

        System.out.println("Test tilpas(140)-metode");
        System.out.println("Forventet: hurtig");
        System.out.println("Realitet: " + lff.tilpas(140));

        System.out.println();
        System.out.println();

        Song song = null;
        while (song == null) {
            System.out.println("Opret en Sang");
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Indtast titel på sangen:");
                String title = scanner.nextLine();

                System.out.println("Indtast sangens kunstner:");
                String artist = scanner.nextLine();

                System.out.println("Indtast sangens bpm:");
                int bpm = scanner.nextInt();

                song = new Song(title, artist, bpm);
            } catch (InputMismatchException e) {
                System.out.println("Du skal inputte at helt tal!");
            }
        }
        song.printSong();
    }
}
