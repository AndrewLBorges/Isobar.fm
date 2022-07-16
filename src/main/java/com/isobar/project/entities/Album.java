package com.isobar.project.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Album {

    private String name;
    private String image;
    private String releasedDate;
    private String band;
    private List<Track> tracks;
    private String id;

    public Album() {}

    public Album(String name, String image, String releasedDate, String band, String id) {
        this.name = name;
        this.image = image;
        this.releasedDate = releasedDate;
        this.band = band;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getReleasedDate() {
        return releasedDate;
    }

    public String getBand() {
        return band;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Album))
            return false;
        Album album = (Album) o;
        return Objects.equals(this.id, album.id) && Objects.equals(this.name, album.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }
}