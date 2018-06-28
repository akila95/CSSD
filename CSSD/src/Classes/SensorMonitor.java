/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wolf
 */
public class SensorMonitor implements Serializable {
    String SensorMonitorID;
    private ArrayList<Double> coords;
    Boolean isActive;
    Double interval;
   // private Member borrower = null;
    
}
