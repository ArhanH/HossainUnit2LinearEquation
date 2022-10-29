
    public class LinearEquation {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public LinearEquation(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public double roundedToHundredth(double toRound) {
            return (double) Math.round(toRound * 100) / 100;
        }

        public double yIntercept() {
            return roundedToHundredth(y1 - slope() * x1);
        }

        public double distance() {
            return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        }

        public double slope() {
            return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
        }

        public String equation() {
            int top = y2 - y1;
            int bottom = x2 - x1;
            String yIntercept = String.valueOf(yIntercept());
            String slope = top + "/" + bottom + "x ";

            if (((double) top / bottom) % 1 == 0) {
                slope = top / bottom + "x ";
                if (top / bottom == 1) {
                    slope = "x ";
                } else if (top / bottom == -1) {
                    slope = "-x ";
                } else if (top / bottom == 0) {
                    slope = "";
                }
            } else if (bottom < 0) {
                bottom = Math.abs(bottom);
                slope = "-" + top + "/" + bottom + "x ";
                if (top < 0) {
                    top = Math.abs(top);
                    slope = top + "/" + bottom + "x ";
                }
            }

            if (yIntercept() > 0 && (double) top / bottom != 0) {
                yIntercept = "+ " + yIntercept;
            } else if (yIntercept() < 0 && (double) top / bottom != 0) {
                yIntercept = yIntercept.substring(0, 1) + " " + yIntercept.substring(1);
            } else if (yIntercept() < 0 && top / bottom == 0) {
                yIntercept = String.valueOf(yIntercept());
            } else if (yIntercept() == 0) {
                yIntercept = "";
            }
            return "y = " + slope + yIntercept;
        }

        public String coordinateForX(double xValue) {
            double x = roundedToHundredth(xValue);
            double y = roundedToHundredth(slope() * xValue + yIntercept());
            return "(" + x + ", " + y + ")";
        }

        public String lineInfo() {
            String getLineInfo = "The two points are: " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")" + "\n";
            getLineInfo += "The equation of the line between these points is: " + equation() + "\n";
            getLineInfo += "The slope of this line is: " + slope() + "\n";
            getLineInfo += "The y-intercept of this line is: " + yIntercept() + "\n";
            getLineInfo += "The distance between the two points is: " + distance();
            return getLineInfo;
        }
    }