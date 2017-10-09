package tech.evgeniypalguev.youtubeplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button btnPlaylist = (Button) findViewById(R.id.btnPlayList);

//        btnPlayVideo.setOnClickListener(this);
//        btnPlaylist.setOnClickListener(this);

        View.OnClickListener ourListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        btnPlayVideo.setOnClickListener(ourListener);
        btnPlaylist.setOnClickListener(ourListener);

        btnPlayVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
