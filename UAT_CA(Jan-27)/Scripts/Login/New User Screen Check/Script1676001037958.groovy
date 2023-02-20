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

Mobile.startApplication('C:\\Users\\User\\Downloads\\UAT_Jan27\\Consumer-UAT (Jan-27).apk', false)

def Msg1 = Mobile.getText(findTestObject('Object Repository/NewUser_Screen_Check/android.widget.TextView - Switch User?'), 0)

if (Msg1 == 'Switch User?') {
	
	Mobile.tap(findTestObject('Object Repository/Login/Success_Login/android.widget.TextView - Switch User'), 0)
	
	Mobile.sendKeys(findTestObject('Object Repository/Login/Success_Login/android.widget.EditText - Mobile Number'), '791953587')
	
	Mobile.sendKeys(findTestObject('Object Repository/Login/Success_Login/android.widget.EditText - Enter PIN'), '121212')
	
	Mobile.tap(findTestObject('Object Repository/Login/Success_Login/android.widget.TextView - LOGIN'), 0)
	
	Thread.sleep(10000)
	
	Mobile.closeApplication()
}

else {
	
	Mobile.sendKeys(findTestObject('Object Repository/Login/Success_Login/android.widget.EditText - Mobile Number'), '791953587')
	
	Mobile.sendKeys(findTestObject('Object Repository/Login/Success_Login/android.widget.EditText - Enter PIN'), '121212')
	
	Mobile.tap(findTestObject('Object Repository/Login/Success_Login/android.widget.TextView - LOGIN'), 0)
	
	Thread.sleep(10000)
	
	Mobile.closeApplication()
}