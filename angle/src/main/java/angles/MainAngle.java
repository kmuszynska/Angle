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

        System.out.println(angle.toString());
        angle = new Angle(321, 25, 27);
        System.out.println("Nowy obiekt kąta z trzema parametrami konstruktora: " + angle.toString());
        angle = new Angle(325);
        System.out.println("Obiekt z jednym konstruktorem: " + angle.toString());
        angle = new Angle(251, 32);
        System.out.println("Obiekt z dwoma konstruktorami: " + angle.toString());

        angle = new Angle();
        angle.setOfCosine(50);

        angle.setOfSine(50);

        angle.setOfCotangent(50);

        angle.setOfTangent(50);

        angle.setOfCosecans(50);

        angle.setOfSecans(50);

        angle = new Angle();
        System.out.println(angle.setOfPoint(2, 4));
        angle = new Angle();

        System.out.println(angle.add(new Angle(angle.getX())));
        angle = new Angle();
        System.out.println(angle.sub(new Angle(angle.getX())));
        angle = new Angle(25);
        System.out.println(angle.compl(new Angle()));

    }
}
