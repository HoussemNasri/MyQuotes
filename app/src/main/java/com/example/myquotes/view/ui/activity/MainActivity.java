package com.example.myquotes.view.ui.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.myquotes.R;
import com.example.myquotes.service.model.Quote;
import com.example.myquotes.viewmodel.QuoteViewModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private QuoteViewModel qViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qViewModel = ViewModelProviders.of(this).get(QuoteViewModel.class);
        qViewModel.getQuote().observe(this, response ->{
            Log.d(TAG, "onCreate: " + response.toString());
        });

    }
}
