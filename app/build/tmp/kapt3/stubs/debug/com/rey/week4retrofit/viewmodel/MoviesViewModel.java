package com.rey.week4retrofit.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001dR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR1\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\'\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/rey/week4retrofit/viewmodel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/rey/week4retrofit/repository/MoviesRepository;", "(Lcom/rey/week4retrofit/repository/MoviesRepository;)V", "_movieDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/rey/week4retrofit/model/MovieDetails;", "get_movieDetails", "()Landroidx/lifecycle/MutableLiveData;", "_movieDetails$delegate", "Lkotlin/Lazy;", "_nowPlaying", "Ljava/util/ArrayList;", "Lcom/rey/week4retrofit/model/Result;", "Lkotlin/collections/ArrayList;", "get_nowPlaying", "_nowPlaying$delegate", "movieDetails", "Landroidx/lifecycle/LiveData;", "getMovieDetails", "()Landroidx/lifecycle/LiveData;", "nowPlaying", "getNowPlaying", "getMovieDetail", "Lkotlinx/coroutines/Job;", "apiKey", "", "movieId", "", "language", "page", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.rey.week4retrofit.repository.MoviesRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _nowPlaying$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _movieDetails$delegate = null;
    
    @javax.inject.Inject()
    public MoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.rey.week4retrofit.repository.MoviesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.rey.week4retrofit.model.Result>> get_nowPlaying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.rey.week4retrofit.model.Result>> getNowPlaying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNowPlaying(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String language, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.rey.week4retrofit.model.MovieDetails> get_movieDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rey.week4retrofit.model.MovieDetails> getMovieDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMovieDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int movieId) {
        return null;
    }
}