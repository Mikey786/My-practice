class Box {
    double len, bre, hei;

    Box(double l, double b, double h) {
        len = l;
        bre = b;
        hei = h;
    }

    void display() {
        System.out.println("Length : " + len);
        System.out.println("Breadth : " + bre);
        System.out.println("Height : " + hei);
    }

    double cal_vol() {
        return (len * bre * hei);
    }
}

public class Eswar {
    public static void main(String[] args) {
        Box ob = new Box(2.4, 5.6, 7.4);
        ob.display();  // Display the dimensions of the box
        double v = ob.cal_vol();  // Calculate the volume
        System.out.println("Volume: " + v);  // Print the volume
    }
}
