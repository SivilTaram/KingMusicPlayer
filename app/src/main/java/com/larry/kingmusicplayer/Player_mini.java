package com.larry.kingmusicplayer;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by user on 15-8-25.
 */
public class Player_mini {

    private ProgressBar pb;
    private ImageButton photo_button;
    private ImageButton play_and_pause_button;
    private ImageButton next_song_button;
    private TextView name_of_song_and_artist, name_of_album;
    private MediaPlayer mp;

    Player_mini(MediaPlayer mp) {
        this.mp = mp;
    }

    public void setOnClickListeners() {
        name_of_song_and_artist.setText("The name of song and artist");
        name_of_album.setText("name of album");
        photo_button.setOnClickListener(null);
        play_and_pause_button.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    v.setBackgroundResource(R.drawable.play_icon);
                    mp.pause();
                } else {
                    v.setBackgroundResource(R.drawable.pause_icon);
                    mp.start();
                }
            }
        });
        next_song_button.setOnClickListener(null);
    }

    public ProgressBar getPb() {
        return pb;
    }

    public void setPb(ProgressBar pb) {
        this.pb = pb;
    }

    public ImageButton getPhoto_button() {
        return photo_button;
    }

    public void setPhoto_button(ImageButton photo_button) {
        this.photo_button = photo_button;
    }

    public ImageButton getPlay_and_pause_button() {
        return play_and_pause_button;
    }

    public void setPlay_and_pause_button(ImageButton play_and_pause_button) {
        this.play_and_pause_button = play_and_pause_button;
    }

    public ImageButton getNext_song_button() {
        return next_song_button;
    }

    public void setNext_song_button(ImageButton next_song_button) {
        this.next_song_button = next_song_button;
    }

    public TextView getName_of_song_and_artist() {
        return name_of_song_and_artist;
    }

    public void setName_of_song_and_artist(TextView name_of_song_and_artist) {
        this.name_of_song_and_artist = name_of_song_and_artist;
    }

    public TextView getName_of_album() {
        return name_of_album;
    }

    public void setName_of_album(TextView name_of_album) {
        this.name_of_album = name_of_album;
    }

    public MediaPlayer getMp() {
        return mp;
    }

    public void setMp(MediaPlayer mp) {
        this.mp = mp;
    }

}
