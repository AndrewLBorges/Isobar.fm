package com.isobar.project.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
class Band {

    private String name;
    private String image;
    private String genre;
    private String biography;
    private long numPlays;
    private List<String> albums;
    private String id;
    private List<Album> albumList;

    Band() {}

    public Band(String name, String image, String genre, String biography, long numPlays, String id) {
        this.name = name;
        this.image = image;
        this.genre = genre;
        this.biography = biography;
        this.numPlays = numPlays;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getGenre() {
        return genre;
    }

    public String getBiography() {
        return biography;
    }

    public long getNumPlays() {
        return numPlays;
    }

    public List<String> getAlbums() {
        return albums;
    }

    public String getId() {
        return id;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setNumPlays(long numPlays) {
        this.numPlays = numPlays;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Band))
            return false;
        Band band = (Band) o;
        return Objects.equals(this.id, band.id) && Objects.equals(this.name, band.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }
}