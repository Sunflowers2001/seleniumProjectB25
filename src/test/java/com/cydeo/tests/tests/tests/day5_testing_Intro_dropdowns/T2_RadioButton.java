package com.cydeo.tests.tests.tests.day5_testing_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        //Locate&ClickOn LabelInputTag-->Hockey UseTheInputId hockey-->("//input[@id='hockey']"));
        //Then YouCan JustClick-->hockeyRadioBtn.click();
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        Thread.sleep(2000); //optional,ToAvoid breakdownTheSystem UCanUseIfUHaveSoMany pagesLoading atTheSameTime
        hockeyRadioBtn.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        //System.out.println("hockeyRadioBtn.isSelected() = " + hockeyRadioBtn.isSelected());<--ApplyFinalPractice
        //Now WeAreGoingToUse IfCondition statement below
        if (hockeyRadioBtn.isSelected()){  //<--My If Condition

            System.out.println("Button is selected. Verification PASSED!"); //<--TheUCanPrintOut IfButtonSelectedPassed

        }else{
            System.out.println("Button is not selected. Verification FAILED!!!"); //<--ElseNotSelectedVerificationFailed
        }
    }
}
