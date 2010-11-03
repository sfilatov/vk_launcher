package com.vklauncher;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Launcher extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://i.vkontakte.ru")));
        finish();
    }
}