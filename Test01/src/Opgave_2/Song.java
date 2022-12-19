package Opgave_2;

public class Song {
    private String title;
    private String artist;
    private int bpm;

    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public void printSong() {
        String titleStr = "Titel     : " + title;
        System.out.println("*".repeat(titleStr.length()));
        System.out.println(titleStr);
        System.out.println("Kunstner  : " + artist);
        System.out.printf("Hastighed : %s (Bpm)\n", bpm);
        System.out.println("*".repeat(titleStr.length()));
    }

    public String tilpas(int tilpasBpm) {
        if (bpm < tilpasBpm) {
            return "langsom";
        } else if (bpm > tilpasBpm) {
            return "hurtig";
        } else {
            return "perfekt";
        }
    }
}
