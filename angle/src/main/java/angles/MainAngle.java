package angles;

/*
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;*/

public class MainAngle {
    public static void main(String[] args) {
        Angle angle = new Angle();
        double resultCosine = angle.cosine(245);
        System.out.println("cosinus: " + resultCosine);
        double result = angle.sine(245);
        System.out.println("sinus: " + result);
        result = angle.tangent(245);
        System.out.println("tangens: " + result);
        result = angle.cotangent(245);
        System.out.println("cotangens: " + result);
        result = angle.cosexans(245);
        System.out.println("cosecans: " + result);
        result = angle.secans(245);
        System.out.println("secans: " + result);
        result = angle.radian(245);
        System.out.println("Zamiana na radiany: " + result);
        result = angle.degree(245);
        System.out.println("Zamiana na stopnie: " + result);

        System.out.println(angle.toString(45,36,17));
        angle=new Angle(321,25,27);
        System.out.println("Nowy obiekt kąta z trzema parametrami konstruktora: "+angle);
        angle=new Angle(325);
        System.out.println("Obiekt z jednym konstruktorem: "+angle);
        angle = new Angle(251,32);
        System.out.println("Obiekt z dwoma konstruktorami: "+angle);
    }
}
