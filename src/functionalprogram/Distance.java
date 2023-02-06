package functionalprogram;

public class Distance {
    public static void main(String [] args) {
        // input point coordinates
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        // double distance = Math.sqrt((x * x) + (y * y));
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        // output distance
        System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);

    }
}




