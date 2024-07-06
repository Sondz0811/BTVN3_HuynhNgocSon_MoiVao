/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Student {
    private int idS,phoneNumberS;
    private String NameS,addressS,gioitinhS;

    public Student(int idS, int phoneNumberS, String NameS, String addressS, String gioitinhS) {
        this.idS = idS;
        this.phoneNumberS = phoneNumberS;
        this.NameS = NameS;
        this.addressS = addressS;
        this.gioitinhS = gioitinhS;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public int getPhoneNumberS() {
        return phoneNumberS;
    }

    public void setPhoneNumberS(int phoneNumberS) {
        this.phoneNumberS = phoneNumberS;
    }

    public String getNameS() {
        return NameS;
    }

    public void setNameS(String NameS) {
        this.NameS = NameS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioitinhS() {
        return gioitinhS;
    }

    public void setGioitinhS(String gioitinhS) {
        this.gioitinhS = gioitinhS;
    }

    @Override
    public String toString() {
        return "Student{" + "idS=" + idS + ", phoneNumberS=" + phoneNumberS + ", NameS=" + NameS + ", addressS=" + addressS + ", gioitinhS=" + gioitinhS + '}';
    }
    

}