package tomato.example.com.githubsearchuser.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import tomato.example.com.githubsearchuser.R;

/**
 * Created by SAI SUMANTH VANKA on 28-04-2018.
 */

public class DetailActivity extends AppCompatActivity{
    TextView Link, UserName;
    Toolbar mActionBarToolbar;
    ImageView imageView;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) findViewById(R.id.user_image_header);
        UserName = (TextView) findViewById(R.id.username);
        Link = (TextView) findViewById(R.id.link);
        String username = getIntent().getExtras().getString("login");
        String avatarUrl = getIntent().getExtras().getString("avatar_Url");
        String link = getIntent().getExtras().getString("html_Url");

        Link.setText(link);
        Linkify.addLinks(Link, Linkify.WEB_URLS);

        UserName.setText(username);
        Glide.with(this).load(avatarUrl)
                .placeholder(R.drawable.Load)
                .into(imageView);

        getSupportActionBar().setTitle("Details Activity");

    }

    //for sharing the details of the developer
    private Intent createShareForcastIntent(){
        String username = getIntent().getExtras().getString("login");
        String link = getIntent().getExtras().getString("link");
        Intent shareIntent = ShareCompat.IntentBuilder.from(this)
                .setType("Text/Plain")
                .setText("Check this developer@" +username+ "," +link)
                .getIntent();
        return shareIntent;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.detail, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        menuItem.setIntent(createShareForcastIntent());
        return true;
    }
}
