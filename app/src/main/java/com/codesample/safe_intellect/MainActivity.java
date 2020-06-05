package com.codesample.safe_intellect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.safe_intellect.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Test.setText(getTime());
    }

    private String getTime(){
        SimpleDateFormat format = new SimpleDateFormat("MM.dd kk:mm");
        Date date = new Date();

        return format.format(date);
    }
}
