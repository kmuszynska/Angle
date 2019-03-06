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



    public Angle(int degrees, int minutes, int seconds) {
        if (degrees>=360 || degrees <0){
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        this.degrees = degrees;
        if (minutes>60 || minutes<0){
            throw new IllegalArgumentException("You should give the number between 0 and 60");
        }
        this.minutes = minutes;
        if (seconds>60 || seconds <0){
            throw new IllegalArgumentException("You shoud give the number between 0 and 60");
        }
        this.seconds = seconds;
    }

    public Angle(String miaraAngle) {
        this.miaraAngle = miaraAngle;
    }

    public Angle(int degrees) {
        if (degrees>=360 || degrees <0){
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        this.degrees = degrees;
    }

    public Angle(int degrees, int minutes) {
        if (degrees>=360 || degrees <0){
            throw new IllegalArgumentException("You should give the number between 0 and 360");
        }
        this.degrees = degrees;
        if (minutes>60 || minutes<0){
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

    public void setOfCosine(double x){
        x=Math.cos(x);
        double result = Math.acos(x);
    }

    public void setOfSine(double x){
        x=Math.sin(x);
        double result = Math.asin(x);
    }

    public void setOfTangent(double x) {
        x=Math.tan(x);
        double result = Math.atan(x);
    }
    public void setOfCotangent(double x){
        x=1/(Math.tan(x));
        double result = 1/(Math.atan(x));
    }
    public void setOfSecans(double x){
        x=1 / (Math.cos(x));
        double result = 1/(secans(x));
    }
    public void setOfCosecans(double x){
        x=  1 / (Math.sin(x));
        double result = 1/(cosexans(x));
    }

    public double radian(double x) {
        double y = Math.toRadians(x);
        return y;
    }

    public double degree(double x) {
        double y = Math.toDegrees(x);
        return y;
    }


    public String toString(int degrees, int minutes, int seconds) {
        return "Miara kąta: " + degrees + "°" + minutes + "'" + seconds + "\"";
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

    public double setOfPoint(double x0, double y0){ //dwie przyprosokątne znamy, wiec miara kata to bedzie tangens z tych dwoch wartosci
        return (x0);

    }
    public Angle (double x0, double y0){
        Angle angle = new Angle();
        angle.setOfPoint(x0,y0);
    }
    
}
