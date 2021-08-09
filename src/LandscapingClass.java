
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n8wil
 */
public class LandscapingClass {
    private int idNum;
    private String clientName;
    private double yardWidth;
    private String landscapeType;
    private double yardLength;
    private double yardCost;

    public LandscapingClass() {
        this.idNum = 0;
        this.clientName = "Unknown";
        this.landscapeType = "Unknown";
        this.yardWidth = 0;
        this.yardLength = 0;
        this.yardCost = 0;
    }
    
    public LandscapingClass(int idNum, String clientName, String landscapeType, double yardWidth,
            double yardLength, double yardCost) {
        this.idNum = idNum;
        this.clientName = clientName;
        this.landscapeType = landscapeType;
        this.yardWidth = yardWidth;
        this.yardLength = yardLength;
        this.yardCost = yardCost;
    }

   

    
    public int getIdNum(){
    return idNum;
    }
    
   public void setidNum(int idNum) {
        this.idNum = idNum;
    }

    
    public String getLandscapeType() {
        return landscapeType;
    }

    public void setLandscapeType(String landscapeType) {
        this.landscapeType = landscapeType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setYardWidth(int yardWidth) {
        this.yardWidth = yardWidth;
    }

    public void setYardLength(int yardLength) {
        this.yardLength = yardLength;
    }

    public double getyardWidth() {
        return yardWidth;
    }

    public double getyardLength() {
        return yardLength;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    
    public int calcTotal(int yardLength, int yardWidth)
    {
    int total = yardLength * yardWidth;
    return total;
    }

    public double getYardCost() {
        return yardCost;
    }

    public void setYardCost(int yardCost) {
        this.yardCost = yardCost;
    }

    @Override
    public String toString() {
        return "LandscapingClass{" + "clientName=" + clientName + ", yardWidth=" + yardWidth + ", landscapeType=" + landscapeType + ", yardLength=" + yardLength + '}';
    }
    
}
