package SongSorter;

public class Song implements Comparable<Song> {
    private String artist;
    private Integer year;
    private String title;

    public Song(String title, String artist, Integer year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    // sort by year

//    public int compareTo(Song o) {
////        return this.getYear().compareTo(o.getYear());
//        if (this.getYear() > o.getYear()) return 1;
//        if (this.getYear() < o.getYear()) return -1;
//        return 0;
//    }

    // sort by title
    public int compareTo(Song anotherSong) {
        return (this.getTitle().compareTo(anotherSong.getTitle()));

    }
}

