package view.com.selflibraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.rssfeedlibrary.RssFeedProvider;
import com.example.android.rssfeedlibrary.RssItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RssItem> rssItemsList= RssFeedProvider.parse("http://www.vogella.com/article.rss");

        for (int i=0;i<rssItemsList.size();i++)
        {
           System.out.println("RssFeed title="+ rssItemsList.get(i).getTitle());
            System.out.println("RssFeed link="+ rssItemsList.get(i).getLink());
        }
    }
}
