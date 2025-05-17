package utilis;

import pages.AddEmplopyeePage;
import pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;
    public static AddEmplopyeePage addEmplopyeePage;
    //public static DashBoardPage;



    public static void initializePageObjects(){
        loginPage=new LoginPage();
        addEmplopyeePage = new AddEmplopyeePage();

    }
}
