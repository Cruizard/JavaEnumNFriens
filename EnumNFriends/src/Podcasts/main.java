package Podcasts;

public class main
{
    public static void main(String[] args)
    {
        PodcastDetails GlassCanonPod = new PodcastDetails("Joshua B", "Glass Canon Podcast",3, 12, Genre.Role_play);
        PodcastDetails RSWR = new PodcastDetails("Rajesh K", "Rocket Science With Rajesh",10, 15, Genre.Education);
        PodcastDetails WTF1 = new PodcastDetails("Katy Fairman", "WTFormula 1 Podcast",5, 10, Genre.Sports);

        PodcastList<PodcastDetails> podcastlist =new PodcastList<>(GlassCanonPod);
        podcastlist.addpodcast(RSWR);
        podcastlist.addpodcast(WTF1);
        for (var podcast: podcastlist.getList())
        {
            podcast.play();
        }


    }
}
