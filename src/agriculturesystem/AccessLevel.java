/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

/**
 *
 * @author Himasha Harinda
 */
public enum AccessLevel {
    FARMER, FOOD_PROCESSOR;

    public static AccessLevel getFARMER() {
        return FARMER;
    }

    public static AccessLevel getFOOD_PROCESSOR() {
        return FOOD_PROCESSOR;
    }
    
    @Override
    public String toString() {
        return "AccessLevel{" + '}';
    }
}
