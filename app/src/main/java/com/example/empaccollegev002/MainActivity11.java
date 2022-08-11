package com.example.empaccollegev002;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity11 extends AppCompatActivity {
ImageView map, phone, whatsapp, mail, fb, web;
TextView etmap, etphone, etwhatsapp, etmail, etfb, etweb;
String mapurl, mailAddr, contact, waUrl, fbUrl, webUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        map = findViewById(R.id.map_ic);//assign images to set onclick
        mail = findViewById(R.id.ic_mail);
        whatsapp = findViewById(R.id.ic_whatsapp);
        web = findViewById(R.id.ic_web);
        phone = findViewById(R.id.ic_phone);
        fb = findViewById(R.id.ic_fb);


        etmap = findViewById(R.id.map_txt);//assign txt to set onclick
        etmail = findViewById(R.id.mail_txt);
        etwhatsapp = findViewById(R.id.whatsapp_txt);
        etweb = findViewById(R.id.web_txt);
        etphone = findViewById(R.id.phone_txt);
        etfb = findViewById(R.id.fb_txt);


        mapurl = "https://maps.app.goo.gl/ooQyR44DjzPyLt4S8";//assign urls to open
        mailAddr = "mailto:empac@empacbd.com";
        webUrl = "https://empacbd.com";
        contact = "+8801611710088";
        fbUrl = "htts://facebook.com/EMPAC70043/";
        String fbID = "1039263289448157";
        waUrl = "https://api.whatsapp.com/send?phone=" + contact;

        openApps(map,etmap,mapurl);//opens map
        openApps(mail,etmail,mailAddr);//opens gmail
        openApps(whatsapp,etwhatsapp,waUrl);//opens whats app
        openApps(web,etweb,webUrl);//opens website

        phone.setOnClickListener(v ->{
            Intent i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:"+ contact));
            startActivity(i);
        });
        etphone.setOnClickListener(v ->{
            Intent i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:"+ contact));
            startActivity(i);
        });
        fb.setOnClickListener(v ->{
            Intent i = getFBintent(MainActivity11.this, fbID);
            startActivity(i);
        });
        etfb.setOnClickListener(v ->{
            Intent i = getFBintent(MainActivity11.this, fbID);
            startActivity(i);
        });



    }
    public Intent getFBintent(Context context, String fbId){
        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            String fbScheme = "fb://page/" + fbId;
            return new Intent(Intent.ACTION_VIEW, Uri.parse(fbScheme));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse(fbUrl));
        }
    }
    private void openApps(ImageView map, TextView etmap, String url) {
        map.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        });
        etmap.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        });
    }


}