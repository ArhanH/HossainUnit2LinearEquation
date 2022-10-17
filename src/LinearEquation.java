public class LinearEquation {

    // Instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Object
    public LinearEquation(int x1, int y1, int x2, int y2) {
    }

    // Distance
    public double distance() {
        double getDistance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return getDistance;
    }

    // Slope
    public double slope(){
       double getSlope = ((y2 - y1) / (x2 - x1));
       return getSlope;
    }


    // Y-Intercept
    public double yIntercept(){
        double getYIntercept = y1 - slope() * x1;
        return getYIntercept;
    }

    // Linear Equation
    public String LinearEquation(){
        String getLinearEquation = "y = " + slope() + "x + " + yIntercept();
        return getLinearEquation;
    }









}
