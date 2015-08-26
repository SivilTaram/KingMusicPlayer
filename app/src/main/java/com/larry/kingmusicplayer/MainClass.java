package com.larry.kingmusicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by user on 15-8-19.
 */
public class MainClass extends AppCompatActivity {

    private static MediaPlayer mp;
    private ListView lv;
    private Player_mini player_mini;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        lv = (ListView) findViewById(R.id.song_list);
        player_mini.setPhoto_button((ImageButton) findViewById(R.id.photo_of_album));
        player_mini.setPlay_and_pause_button((ImageButton) findViewById(R.id.play_or_pause));
        player_mini.setNext_song_button((ImageButton) findViewById(R.id.next_song));
        player_mini.setName_of_song_and_artist((TextView) findViewById(R.id.name_of_song_and_artist));
        player_mini.setName_of_album((TextView) findViewById(R.id.name_of_album));
        mp = MediaPlayer.create(this, R.raw.test_music);
        player_mini = new Player_mini(mp);

        player_mini.setOnClickListeners();
    }
}
