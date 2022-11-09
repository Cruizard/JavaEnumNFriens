package Podcasts;

import java.util.ArrayList;

public class PodcastList <L>
{
    private ArrayList <L> list = new ArrayList<>();

    public PodcastList(L podcast)
    {
        list.add(podcast);
    }

    public void addpodcast(L pod)
    {
        list.add(pod);

    }

    public ArrayList<L> getList()
    {
        return list;
    }
}
