import java.util.ArrayList;

/**
 * Policyholder's information and prices
 */

public class Policy {


    public static int policies = 0;
    private final int BMI_CONST = 703;
    private final double INSURANCE_FEE = 600;
    private final double SMOKER_FEE = 100;
    private final double ELDERLY_FEE = 50;
    private final int ELDERLY_OVER_AGE = 50;
    private final int BMI_OVER = 35;
    private final double BMI_OVER_MULTIPLY_PRICE = 20;
    private final int BMI_OVER_MINUS = 35;

    private ArrayList<PolicyHolder> policyHolder = new ArrayList<PolicyHolder>();
    /**
     * Initializes the Policy class
     */
    public Policy(){
    }

    /**
     * Calculates and returns the BMI of the policyholder
     * @return the BMI
     */
    public double calculateBmi(PolicyHolder ph){
        return ph.getWeight() * this.BMI_CONST / ph.getHeight();
    }

    /**
     * calculate the total policy cost for the specific person
     * @return policy cost
     */
    public double policyInsurancePrice(PolicyHolder ph){
        double userBmi = calculateBmi(ph);
        double policyCost = INSURANCE_FEE;
        if (ph.getAge() > ELDERLY_OVER_AGE) policyCost += ELDERLY_FEE;
        if (ph.isSmoker()) policyCost += this.SMOKER_FEE;
        if (userBmi > BMI_OVER) policyCost += (userBmi - BMI_OVER_MINUS) + BMI_OVER_MULTIPLY_PRICE;
        return policyCost;

    }


}
