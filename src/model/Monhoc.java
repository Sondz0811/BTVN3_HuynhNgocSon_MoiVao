/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Monhoc {
    private int idMonhoc;
    private String nameMonhoc;

    public Monhoc(int idMonhoc, String nameMonhoc) {
        this.idMonhoc = idMonhoc;
        this.nameMonhoc = nameMonhoc;
    }

    public int getIdMonhoc() {
        return idMonhoc;
    }

    public void setIdMonhoc(int idMonhoc) {
        this.idMonhoc = idMonhoc;
    }

    public String getNameMonhoc() {
        return nameMonhoc;
    }

    public void setNameMonhoc(String nameMonhoc) {
        this.nameMonhoc = nameMonhoc;
    }

    @Override
    public String toString() {
        return "Monhoc{" + "idMonhoc=" + idMonhoc + ", nameMonhoc=" + nameMonhoc + '}';
    }
    
}
