/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.letstest.junit5.lifecycle;

/**
 *
 * @author emaph
 */
public class ResourceForAllTests {

    private final String resourceName;

    public ResourceForAllTests(String resourceName) {
        this.resourceName = resourceName;
        System.out.println(this.resourceName + " from class " + getClass().getSimpleName() + " is initializing.");
    }

    public void close() {
        System.out.println(this.resourceName + " from class " + getClass().getSimpleName() + " is closing.");
    }
}
