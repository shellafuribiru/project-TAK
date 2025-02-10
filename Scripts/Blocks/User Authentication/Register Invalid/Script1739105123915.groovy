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

WebUI.verifyElementVisible(findTestObject('Beranda Page/span_Login'))

WebUI.click(findTestObject('Beranda Page/span_Login'))

WebUI.click(findTestObject('Login Page/span_Register'))

WebUI.verifyElementVisible(findTestObject('Register Page/mat-Title User Registration'))

WebUI.setText(findTestObject('Register Page/input_First Name'), 'Test')

WebUI.setText(findTestObject('Register Page/input_Last Name'), 'Shella')

WebUI.setText(findTestObject('Register Page/input_User Name'), 'test_shella')

WebUI.setEncryptedText(findTestObject('Register Page/input_Password'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Register Page/input_Confirm Password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Register Page/input_Gender Female'))

WebUI.click(findTestObject('Register Page/span_Register Button'))

WebUI.verifyElementVisible(findTestObject('Register Page/mat-Error Password Format'))

