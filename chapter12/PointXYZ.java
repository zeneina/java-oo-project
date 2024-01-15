package HomeWork.chapter12;

import java.util.ArrayList;

public class PointXYZ {
    private double x;
    private double y;
    private double z;

    // Constructors
    public PointXYZ() {
        this.x = 10.0;
        this.y = 30.0;
        this.z = 50.0;
    }

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Setter methods
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Method to convert PointXYZ to String
    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    public static void main(String[] args) {
        // Δημιουργία μιας συλλογής για αποθήκευση των σημείων
        ArrayList<PointXYZ> pointsList = new ArrayList<>();

        // Δημιουργία αντικειμένων PointXYZ
        PointXYZ point1 = new PointXYZ();
        PointXYZ point2 = new PointXYZ(15.0, 25.0, 35.0);

        // Προσθήκη των σημείων στη συλλογή
        pointsList.add(point1);
        pointsList.add(point2);

        for (PointXYZ point : pointsList) {
            System.out.println("Point: " + point.convertToString());
        }
    }
}
