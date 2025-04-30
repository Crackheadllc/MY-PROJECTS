package conditionalstatements;

public class SwitchStatementLimitations {
    public static void main(String[] args) {


        int electionYear=2024;

        switch (electionYear) {

            case 2020:
                System.out.println("President is Biden");
                break;
            case 2016:
                System.out.println("President is Trump");
                break;
            case 2012:
                System.out.println("President is Obama");
                break;
            case 2008:
                System.out.println("President is obama");
                break;
            default:
                System.out.println("President is unknown");
        }
    }
}
