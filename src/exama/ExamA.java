/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exama;
import controller.Facade;

/**
 *
 * @author Lukasz Krawczyk
 */
public class ExamA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        
        facade.CreateUser();
    }
    
}
