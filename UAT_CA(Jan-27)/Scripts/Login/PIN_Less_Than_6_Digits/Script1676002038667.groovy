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

Mobile.tap(findTestObject('Object Repository/Login/PIN_Less_Than_6_Digits/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Max_PIN_11_Numbers/android.widget.TextView - NEXT'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Max_PIN_11_Numbers/android.widget.TextView - GET STARTED'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login/PIN_Less_Than_6_Digits/android.widget.EditText - Mobile Number'), 
    '791953587')

Mobile.sendKeys(findTestObject('Object Repository/Login/PIN_Less_Than_6_Digits/android.widget.EditText - Enter PIN (1)'), 
    '12345')

Mobile.tap(findTestObject('Object Repository/Login/PIN_Less_Than_6_Digits/android.widget.TextView - LOGIN'), 0)

def Msg = Mobile.getText(findTestObject('Object Repository/Login/Invalid_PIN/android.widget.TextView - Please enter valid PIN'), 0)

Mobile.verifyEqual(Msg, 'Please enter valid PIN')

Mobile.closeApplication()

