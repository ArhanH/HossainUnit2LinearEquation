public class LinearEquation {

    // Instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    // Object
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Distance
    public double distance() {
        double getDistance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        double roundDistance = roundedToHundreth(getDistance);
        return roundDistance;
    }

    // Slope
    public double slope(){
       double getSlope = ((y2 - y1) / (x2 - x1));
       double roundSlope = roundedToHundreth(getSlope);
       return roundSlope;
    }

    // Y-Intercept
    public double yIntercept(){
        double getYIntercept = y1 - slope() * x1;
        return getYIntercept;
    }

    // Linear Equation
    public String linearEquation(){
        int top = y2 - y1;
        int bottom = x2 - x1;
        String getLinearEquation = "y = " + top + "/" + bottom + "x + " + yIntercept();
        return getLinearEquation;
    }

    // Coordinate for x
    public String coordinateForX(double xValue){
        double yValue = slope() * xValue + yIntercept();
        double roundYValue = roundedToHundreth(yValue);
        double roundXValue = roundedToHundreth(xValue);
        String getCoordinateForX = "(" + roundXValue + ", " + roundYValue + ")";
        return getCoordinateForX;
    }

    // Round method
    public double roundedToHundreth(double number){
        return (double) Math.round(number * 100) / 100;
    }

    // Prints out all info
    public String lineInfo(){
        String getLineInfo = "The two points are: " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")" + "\n";
        getLineInfo += "The equation of the line between these points is: " + linearEquation() + "\n";
        getLineInfo += "The slope of this line is: " + slope() + "\n";
        getLineInfo += "The y-intercept of this line is: " + yIntercept() + "\n";
        getLineInfo += "The distance between the two points is: " + distance();
        return getLineInfo;
    }







}
