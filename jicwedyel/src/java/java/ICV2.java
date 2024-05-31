/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

import java.beans.PropertyVetoException;

/**
 *
 * @author admin
 */
class ICV2 {

    private static int length;

    /**
     * @return the length
     */
    public static int getLength() {
        return length;
    }

    /**
     * @param aLength the length to set
     */
    public static void setLength(int aLength) throws PropertyVetoException {
        length = aLength;
    }
    public static final String PROP_LENGTH = "length";
    
}
