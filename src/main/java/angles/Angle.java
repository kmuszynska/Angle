package angles;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//czytalam o @Max i @Min ale nie działało mi po dodaniu w dependency, wiez zostawilam wyjatki :/


public class Angle {
    private double x;
    private int degrees;
    private int minutes;
    private int seconds;
    private String miaraAngle;

    private static final int RIGHT_ANGEL = 90;
    private static final int STRAIGHT_ANGLE = 180;
    private static final int FULL_ANGLE = 360;
    private static final double RADIAN = 1;
    private static final double DEGREE=1;
    private static final double ARCMINUTE =1;
    private static final double ARCSECOND=1;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Angle(int degrees, int minutes, int seconds) {
        if (degrees >= 360 || degrees < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        this.degrees = degrees;
        if (minutes > 60 || minutes < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 60");
        }
        this.minutes = minutes;
        if (seconds > 60 || seconds < 0) {
            throw new IllegalArgumentException("You shoud give the number between 0 and 60");
        }
        this.seconds = seconds;
    }

    public Angle(String miaraAngle) {
        this.miaraAngle = miaraAngle;
    }

    public Angle(int degrees) {
        if (degrees >= 360 || degrees < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        this.degrees = degrees;
    }

    public Angle(int degrees, int minutes) {
        if (degrees >= 360 || degrees < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        this.degrees = degrees;
        if (minutes > 60 || minutes < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 60");
        }
        this.minutes = minutes;
    }

    public Angle() {
    }

    public Angle(double x) {
        this.x = x;
    }

    public double cosine(double x) {
        return Math.cos(x);
    }

    public double sine(double x) {
        return Math.sin(x);
    }

    public double tangent(double x) {
        return Math.tan(x);
    }

    public double cotangent(double x) {
        return 1 / (Math.tan(x));
    }

    public double secans(double x) {
        return 1 / (Math.cos(x));
    }

    public double cosexans(double x) {
        return 1 / (Math.sin(x));
    }


    public void setOfCosine(double cosine) {
        this.setX(Math.acos(cosine));
    }

    public void setOfSine(double x) {
        this.setX(Math.asin(x));
    }

    public void setOfTangent(double tangent) {
        this.setX(Math.atan(tangent));

    }

    public void setOfCotangent(double cotangent) {
        this.setX(1 / (Math.atan(x)));
    }

    public void setOfSecans(double secans) {
        this.setX(1 / (secans));

    }

    public void setOfCosecans(double cosecans) {
        this.setX(1 / cosecans);
    }

    public double radian(double x) {
        double y = Math.toRadians(x);
        return y;
    }

    public double degree(double x) {
        double y = Math.toDegrees(x);
        return y;
    }


    @Override
    public String toString() {
        return "Angle{" +
                "degrees=" + degrees +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public double setOfPoint(double x0, double y0) { //dwie przyprosokątne znamy, wiec miara kata to bedzie tangens z tych dwoch wartosci
        return (x0 / y0);

    }

    public Angle(double x0, double y0) {
        Angle angle = new Angle();
        angle.setOfPoint(x0, y0);

    }

    public static Angle valueOf(double x) {
        Angle angle = new Angle();
        angle.setX(x);
        return angle;
    }

    public static Angle valueOf(int degrees, int minutes, int seconds) {
        Angle angle = new Angle();
        if (degrees >= 360 || degrees < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        angle.degrees = degrees;
        if (minutes > 60 || minutes < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 60");
        }
        angle.minutes = minutes;
        if (seconds > 60 || seconds < 0) {
            throw new IllegalArgumentException("You shoud give the number between 0 and 60");
        }
        angle.seconds = seconds;

        return angle;
    }

    public static Angle valueOf(int degrees, int minutes) {
        Angle angle = new Angle();
        if (degrees >= 360 || degrees < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        angle.degrees = degrees;
        if (minutes > 60 || minutes < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 60");
        }
        angle.minutes = minutes;

        return angle;
    }

    public static Angle valueOf(int degrees) {
        Angle angle = new Angle();
        if (degrees >= 360 || degrees < 0) {
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        angle.degrees = degrees;

        return angle;
    }

    public static Angle valueOf(double x0, double y0) {
        Angle angle = new Angle();
        angle.setOfPoint(x0, y0);
        return angle;
    }

    public Angle add(Angle angle1) {
        double result = this.getX() + angle1.getX();
        Angle angle2 = new Angle();
        angle2.setX(result);
        return angle2;
    }

    public Angle sub(Angle angle1) {
        double result = this.getX() - angle1.getX();
        Angle angle2 = new Angle();
        angle2.setX(result);
        return angle2;
    }

    public static Angle sum(Angle angle1, Angle angle2) {
        double result = angle1.getX() + angle2.getX();
        Angle angleNew = new Angle();
        angle2.setX(result);
        return angleNew;

    }

    public static Angle diff(Angle angle1, Angle angle2) {
        double result = angle1.getX() - angle2.getX();
        Angle angleNew = new Angle();
        angleNew.setX(result);
        return angleNew;
    }

    public Angle mult(int value) {
        double result = this.getX() * value;
        Angle angleNew = new Angle();
        angleNew.setX(result);
        return angleNew;
    }

    public Angle div(int value) {
        double result = this.getX() / value;
        Angle angleNew = new Angle();
        angleNew.setX(result);
        return angleNew;
    }

    public Angle prod(Angle angle1, int value) {
        double result = angle1.getX() * value;
        Angle angleNew = new Angle();
        angleNew.setX(result);
        return angleNew;
    }

    public Angle quot(Angle angle1, int value) {
        double result = angle1.getX() / value;
        Angle angleNew = new Angle();
        angleNew.setX(result);
        return angleNew;
    }


}
