package calculatorfraction;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import java.util.Scanner;
//</editor-fold>

/**
 *
 * @author dang to vu anh
 */
public class CalculatorFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != 1 && choose !=2) {
            System.out.println("Do you want to calculator (fraction with fraction)[1] or (fraction with number)[2]");
            choose = scanner.nextInt();
        }
        CalculatorFraction calculatorFraction = new CalculatorFraction();
        calculatorFraction.calculate2Fractions(choose);
    }
    
    //<editor-fold defaultstate="collapsed" desc="TOTAL 2 FRACTIONS">
    public void calculate2Fractions(int choose) {
        Scanner scanner = new Scanner(System.in);
        String firstNumerator = "" ;
        String firstDenominator = "";
        String secondNumerator = "";
        String secondDenominator = "";
        while ("".equals(firstNumerator)) {
            if (choose == 1) {
                System.out.println("Please input first nummerator: ");
            } else {
                System.out.println("Please input nummerator: ");
            }
            firstNumerator = scanner.nextLine();
            if (!isNumeric(firstNumerator)) {
                firstNumerator = "";
            }
        }
        while ("".equals(firstDenominator)) {
            if (choose == 1) {
                System.out.println("Please input first denomiator (#0): ");
            } else {
                System.out.println("Please input denomiator (#0): ");
            }
            firstDenominator = scanner.nextLine();
            if (!isNumeric(firstDenominator) || Integer.parseInt(firstDenominator) == 0) {
                firstDenominator = "";
            }
        }
        while ("".equals(secondNumerator)) {
            if (choose == 1) {
                System.out.println("Please input second nummerator: ");
            } else {
               System.out.println("Please input number: "); 
            }
            secondNumerator = scanner.nextLine();
            if (!isNumeric(secondNumerator)) {
                secondNumerator = "";
            }
        }
        if (choose == 1) {
            while ("".equals(secondDenominator)) {
                System.out.println("Please input second denomiator (#0): ");
                secondDenominator = scanner.nextLine();
                if (!isNumeric(secondDenominator) || Integer.parseInt(secondDenominator) == 0) {
                    secondDenominator = "";
                }
            }
        } else {
            secondDenominator = "1";
        }
        
        // Show result
        showScreenCalculatorFractions(Integer.parseInt(firstNumerator), Integer.parseInt(firstDenominator), Integer.parseInt(secondNumerator), Integer.parseInt(secondDenominator));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SHOW SCREEN CALCULATOR FRACTIONS">
    public void showScreenCalculatorFractions(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        System.out.println("--------------------------");
        System.out.println("Total is: " + (firstNumerator*secondDenominator + secondNumerator*firstDenominator) + "/" + (firstDenominator*secondDenominator));
        System.out.println("Subtract is: " + (firstNumerator*secondDenominator - secondNumerator*firstDenominator) + "/" + (firstDenominator*secondDenominator));
        System.out.println("Integral is: " + (firstNumerator*secondNumerator) + "/" + (firstDenominator*secondDenominator));
        System.out.println("Quotient is: " + (firstNumerator*secondDenominator) + "/" + (firstDenominator*secondNumerator));
    }
    //</editor-fold>
    
    //</editor-fold>//<editor-fold defaultstate="collapsed" desc="CHECK IS NUMERIC">
    public Boolean isNumeric(String maybeNumeric) {
        return maybeNumeric != null && maybeNumeric.matches("[0-9]+");
    }
    //</editor-fold>
    
}
