package com.example.myquotes.service.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myquotes.service.model.Quote;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuoteRepository implements Callback<Quote> {
    private static final String TAG = "QuoteRepository";
    private QuoteService quoteService;
    private MutableLiveData<Quote> quote;


    public QuoteRepository() {
        quoteService = _Retrofit.getInstance().create(QuoteService.class);
    }

    public LiveData<Quote> getRandomQuote() {
        quote = new MutableLiveData<>();
        quoteService.getRandomQuote().enqueue(this);

        return quote;
    }

    @Override
    public void onResponse(Call<Quote> call, Response<Quote> response) {
        this.quote.setValue(response.body());

    }

    @Override
    public void onFailure(Call<Quote> call, Throwable t) {
        Log.d(TAG, "onFailure: " + t.getMessage());
    }
}
