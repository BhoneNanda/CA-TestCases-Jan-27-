import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('bs://f0622669e7296d4ff7e29299fd0153b3f76fb1b2', true)

Mobile.tap(findTestObject('Object Repository/Login/Login_Without_Blank_OTP/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Splash_Screen/android.widget.TextView - NEXT'), 0)

Mobile.tap(findTestObject('Object Repository/Splash_Screen/android.widget.TextView - GET STARTED'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.EditText - Mobile Number'), '791953587')

Mobile.sendKeys(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.EditText - Enter PIN'), '121212')

Mobile.tap(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.TextView - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.Button - While using the app'), 0)

Thread.sleep(180000)

Mobile.sendKeys(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.EditText'), '123456')

Mobile.tap(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.TextView - Two factor OTP validation failed'), 
    0)

def Msg = Mobile.getText(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.widget.TextView - Two factor OTP validation failed'), 
    0)

Mobile.verifyEqual(Msg, 'Two factor OTP validation failed.')

Mobile.tap(findTestObject('Object Repository/Login/Invalid_OTP_Login/android.view.View (1)'), 0)

Mobile.closeApplication()

