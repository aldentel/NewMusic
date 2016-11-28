package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.newmusic.R.id.new_releases_choice;
import static com.example.android.newmusic.R.id.search;

public class NewReleasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_releases);


        // Find the View that shows the new releases choice textview
        TextView newReleasesChoice = (TextView) findViewById(new_releases_choice);

        // Set a click listener on new releases choice View
        newReleasesChoice.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the new releases choice View is clicked on.
            @Override
            public void onClick(View view) {
                Intent newReleasesChoiceIntent = new Intent(NewReleasesActivity.this, NowPlayingActivity.class);
                startActivity(newReleasesChoiceIntent);
            }
        });
    }
}
