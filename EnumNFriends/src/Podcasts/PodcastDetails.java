package Podcasts;

public class PodcastDetails
{
    public Genre genre;
    public String name;
    public String Creator;

    public Integer Seasons;

    public Integer Episodes;

    public void play()
    {
        System.out.println("Available Podcasts: "+ name);

    }

    public PodcastDetails(String creator,String name, Integer seasons, Integer episodes, Genre genre)
    {
        this.genre = genre;
        this.name = name;
        this.Creator = creator;
        this.Seasons = seasons;
        this.Episodes = episodes;
    }
}


