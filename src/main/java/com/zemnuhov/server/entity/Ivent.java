package com.zemnuhov.server.entity;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ivent")
public class Ivent {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "Title", nullable = false,length = 100)
    private String Title;

    @Column(name = "Location", nullable = false,length = 1000)
    private String Location;

    @Column(name = "Time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date Time;

    @Column(name = "Lat", nullable = false)
    private double Lat;

    @Column(name = "Lng", nullable = false)
    private double Lng;

    @Column(name = "Description", nullable = true,length = 1000)
    private String Description;

    @Column(name = "Contact", nullable = true,length = 50)
    private String Contact;

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLng() {
        return Lng;
    }

    public void setLng(double lng) {
        Lng = lng;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public String getTitle() {
        return Title;
    }

    public String getLocation() {
        return Location;
    }

    public Date getTime() {
        return Time;
    }

    public long getId() {
        return id;
    }
}
