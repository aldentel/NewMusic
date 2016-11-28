package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.newmusic.R.id.new_releases;
import static com.example.android.newmusic.R.id.search_choice;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Find the View that shows the search choice category
        TextView searchChoice = (TextView) findViewById(search_choice);

        // Set a click listener on search choice View
        searchChoice.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search choice View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchChoiceIntent = new Intent(SearchActivity.this, NowPlayingActivity.class);
                startActivity(searchChoiceIntent);
            }
        });
    }
}
