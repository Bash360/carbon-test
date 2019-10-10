import ng.com.carbon.CarbonAutomation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarbonTest {
    CarbonAutomation carbonAutomation;
    @BeforeTest public void initAndroidDriver(){
         carbonAutomation=new CarbonAutomation("Android","bash","9","/Users/bash/desktop/paylater-full-debug-v5.5.3-1909091739.apk");

    }
    @Test(priority = 1) public void signIn(){

    }
    @Test(priority = 2,dependsOnMethods = {"signIn"}) public void fundWallet(){

    }
    @Test(priority = 3,dependsOnMethods = {"fundWallet"}) public void checkTransaction(){

    }
}
