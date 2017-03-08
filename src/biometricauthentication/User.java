/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricauthentication;

import java.io.Serializable;

/**
 *
 * @author TK
 */
public class User implements Serializable{

    private String name;
    private double thumb;
    private double index;
    private double middle;
    private double ring;
    private double pinky;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getThumb() {
        return thumb;
    }

    public void setThumb(double thumb) {
        this.thumb = thumb;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public double getMiddle() {
        return middle;
    }

    public void setMiddle(double middle) {
        this.middle = middle;
    }

    public double getRing() {
        return ring;
    }

    public void setRing(double ring) {
        this.ring = ring;
    }

    public double getPinky() {
        return pinky;
    }

    public void setPinky(double pinky) {
        this.pinky = pinky;
    }

    public User(String name, double thumb, double index, double middle, double ring, double pinky) {
        this.name = name;
        this.thumb = thumb;
        this.index = index;
        this.middle = middle;
        this.ring = ring;
        this.pinky = pinky;
    }

}
