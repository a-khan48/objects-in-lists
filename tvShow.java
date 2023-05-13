public class tvShow {
    private String series;
    private int episodes;
    private String genre;

    public tvShow(String series, int episodes, String genre){
        this.series = series;
        this.episodes = episodes;
        this.genre = genre;
    }
    public String getSeries(){
        return series;
    }
    public int getEpisodes(){
        return episodes;
    }
    public String getGenre(){
        return genre;
    }
    @Override
    public String toString() {
        return "The name of this series is " + getSeries() + " with " + getEpisodes() + " episodes. The genre is " + getGenre();
    }
}
