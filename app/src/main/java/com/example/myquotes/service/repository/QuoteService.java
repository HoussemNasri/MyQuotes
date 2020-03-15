package com.example.myquotes.service.repository;

import com.example.myquotes.service.model.Quote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteService {

    @GET("/random")
    Call<Quote> getRandomQuote();
}
