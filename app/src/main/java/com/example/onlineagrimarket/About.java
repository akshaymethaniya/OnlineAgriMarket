package com.example.onlineagrimarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }
    Intent intent;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.nav_home:
                intent = new Intent(About.this, LoginType.class);
                startActivity(intent);
                return true;

            case R.id.nav_about :
                intent = new Intent(About.this, About.class);
                startActivity(intent);
                return true;


            case R.id.nav_contact:
                intent = new Intent(About.this, Contact.class);
                startActivity(intent);
                return true;

            case R.id.nav_profile:
                Intent intent = new Intent(About.this, Profile.class);
                startActivity(intent);
                return true;

            case R.id.nav_logout:

        }return super.onOptionsItemSelected(item);
    }

}
