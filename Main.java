import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //Input input = new Input();

        String filePath = "";

        int smokerQtt = 0;
        int nonSmokerQtt = 0;

        final String SMOKER = "smoker";
        final String NON_SMOKER = "non-smoker";
        final double AGE_LOWER_BOUND = 0;
        final double AGE_HIGH_BOUND = 140;
        final double HEIGHT_LOWER_BOUND = 0;
        final double HEIGHT_HIGH_BOUND = 200;
        final double WEIGHT_LOWER_BOUND = 0;
        final double WEIGHT_HIGHER_BOUND = 2000;

//        Policy policy = new Policy(
//            (int)input.scanNumber("Please enter the Policy Number: "),
//            input.scanString("Please enter the Provider Name: "),
//            input.scanString("Please enter the Policyholder’s First Name: "),
//            input.scanString("Please enter the Policyholder’s Last Name: "),
//            (int)input.scanNumberBetween("Please enter the Policyholder’s Age: ", AGE_LOWER_BOUND, AGE_HIGH_BOUND),
//            input.scanBoolean(String.format("Please enter the Policyholder’s Smoking Status ("+ SMOKER +"/"+ NON_SMOKER +"): "),SMOKER, NON_SMOKER),
//            input.scanNumberBetween("Please enter the Policyholder’s Height (in inches): ", HEIGHT_LOWER_BOUND, HEIGHT_HIGH_BOUND),
//            input.scanNumberBetween("Please enter the Policyholder’s Weight (in pounds): ", WEIGHT_LOWER_BOUND, WEIGHT_HIGHER_BOUND)
//        );
//        System.out.println(policy);

//        try{
//            FileManager fileManager = new FileManager();
//            filePath = fileManager.getFileLocation();
//            System.out.println(filePath);
//            File file = new File(filePath);
//            Scanner scanFile = new Scanner(file);
//            while(scanFile.hasNextLine()){
//                Policy policy = new Policy(
//                        Integer.parseInt(scanFile.nextLine()),
//                        scanFile.nextLine(),
//                        scanFile.nextLine(),
//                        scanFile.nextLine(),
//                        Integer.parseInt(scanFile.nextLine()),
//                        (Objects.equals(scanFile.nextLine(), SMOKER)),
//                        Double.parseDouble(scanFile.nextLine()),
//                        Double.parseDouble(scanFile.nextLine())
//                );
//                if (scanFile.hasNextLine()) scanFile.nextLine();
//                System.out.println(policy);
//                if(policy.isSmoker()) smokerQtt++;
//                else nonSmokerQtt++;
//                System.out.println();
//            }

//            System.out.println("Smokers: " + smokerQtt);
//            System.out.println("Non-Smokers: " + nonSmokerQtt);
//        }
//        catch (FileNotFoundException e){
//            System.out.println("File not found");
//        }

    }
}