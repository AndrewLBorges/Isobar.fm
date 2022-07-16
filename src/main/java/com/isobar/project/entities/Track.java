package com.isobar.project.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Track {

    private String name;
    private int duration;
    private String id;

    public Track() {}

    public Track(String name, int duration, String id) {
        this.name = name;
        this.duration = duration;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Track))
            return false;
        Track track = (Track) o;
        return Objects.equals(this.id, track.id) && Objects.equals(this.duration, track.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.duration);
    }
}