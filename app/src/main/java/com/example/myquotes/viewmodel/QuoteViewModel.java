package com.example.myquotes.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.myquotes.service.model.Quote;
import com.example.myquotes.service.repository.QuoteRepository;

public class QuoteViewModel extends AndroidViewModel {
    private QuoteRepository qRepository;
    private LiveData<Quote> qResponse;

    public QuoteViewModel(@NonNull Application application) {
        super(application);
        qRepository = new QuoteRepository();
        qResponse = qRepository.getRandomQuote();
    }

    public LiveData<Quote>getQuote () {
        return this.qResponse;
    }
}
