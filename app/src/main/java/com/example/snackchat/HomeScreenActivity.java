package com.example.snackchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeScreenActivity extends AppCompatActivity {

    private ImageView btnProfile;
    private Button btnPost;
    private Button btnBuy;
    private Button btnMessages;
    private Button btnSettings;
    private Button btnFavorites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btnProfile = findViewById(R.id.IV_profilePicture);
        btnPost = findViewById(R.id.B_sell);
        btnBuy = findViewById(R.id.B_buy);
        btnMessages = findViewById(R.id.B_messages);
        btnSettings = findViewById(R.id.B_settings);
        btnFavorites = findViewById(R.id.B_favorites);


        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, InventoryActivity.class));
            }
        });

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, CreatePostActivity.class));
            }
        });

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, BuyActivity.class));
            }
        });

        btnMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, MessagesActivity.class));
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, SettingsActivity.class));
            }
        });

        btnFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, FavoritesActivity.class));
            }
        });

    }
}
