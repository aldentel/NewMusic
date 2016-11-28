package com.example.android.newmusic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.onClick;
import static com.example.android.newmusic.R.id.new_releases;
import static com.example.android.newmusic.R.id.now_playing;
import static com.example.android.newmusic.R.id.recently_played;
import static com.example.android.newmusic.R.id.search;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the new releases category
        TextView newReleases = (TextView) findViewById(new_releases);

        // Set a click listener on new releases View
        newReleases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the new releases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent newReleasesIntent = new Intent(MainActivity.this, NewReleasesActivity.class);
                startActivity(newReleasesIntent);
            }
        });

        // Find the View that shows the search category
        TextView Search = (TextView) findViewById(search);

        // Set a click listener on search View
        Search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the recently played category
        TextView recentlyPlayed = (TextView) findViewById(recently_played);

        // Set a click listener on recently played View
        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recently played View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentlyPlayedIntent = new Intent(MainActivity.this, RecentlyPlayedActivity.class);
                startActivity(recentlyPlayedIntent);
            }
        });

        // Find the View that shows the now playing category
        TextView nowPlaying = (TextView) findViewById(now_playing);

        // Set a click listener on now playing View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recently played View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }

}