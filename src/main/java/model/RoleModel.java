/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author miper
 */
public class RoleModel {

    private int id;
    private String name;

    public RoleModel(int id, String nombre) {
        this.id = id;
        this.name = nombre;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
