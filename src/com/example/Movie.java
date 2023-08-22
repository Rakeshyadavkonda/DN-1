package com.example;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private String movieID;
    private String movieName;
    private String movieActor;
    
    public Movie() {
    }
    
    public Movie(String movieID, String movieName, String movieActor) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieActor = movieActor;
    }
    
    public String getMovieID() {
        return movieID;
    }
    
    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public String getMovieActor() {
        return movieActor;
    }
    
    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }
    
    @Override
    public String toString() {
        return "Movie{" +
                "movieID='" + movieID + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieActor='" + movieActor + '\'' +
                '}';
    }
    
	/*
	 * @PostConstruct public void init() {
	 * System.out.println("Movie bean initialized at: " +
	 * java.time.LocalDateTime.now()); }
	 * 
	 * @PreDestroy public void destroy() {
	 * System.out.println("Movie bean destroyed at: " +
	 * java.time.LocalDateTime.now()); }
	 */
}
