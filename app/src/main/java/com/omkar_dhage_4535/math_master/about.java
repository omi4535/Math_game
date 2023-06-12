package com.omkar_dhage_4535.math_master;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class about extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .addItem(title())
                .setDescription("Math Master: Join the ultimate math adventure! Sharpen your addition, subtraction, and multiplication skills while exploring fascinating worlds and overcoming exciting obstacles. This kid-friendly game offers interactive tasks that make learning math a joyful experience. Get ready to embark on a thrilling journey through numbers and become a math master!")
                .addItem(new Element().setTitle("Version 1.0"))
                .addWebsite("https://doc-hosting.flycricket.io/math-master-privacy-policy/545b1935-2a0c-4c0d-849c-42b19c7edc9d/privacy", "Privacy Policies")
                .addGroup("CONNECT WITH US!")
                .addEmail("dhageomkar4535@gmail.com")
                .addWebsite("linkedin.com/in/omkar-dhage/", "Linkedln")
                .addWebsite("https://drive.google.com/file/d/1FgA4XuJgSgogEPO4wJJ_bDXQpmWKi8Ir/view?usp=sharing", "Resume")
                .addWebsite("https://github.com/omi4535", "Git Hub")
                .addPlayStore("com.example.yourprojectname")   //Replace all this with your package name
                .addInstagram("omkar__4535")    //Your instagram id
                .addItem(createCopyright())

                .create();
        setContentView(aboutPage);
    }

    private Element createCopyright() {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Omkar Dhage", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }

    private Element title() {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Math Master by Omkar Dhage");
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);

        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}