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

// **Verifikasi bahwa ikon akun terlihat di halaman Beranda (berarti pengguna telah login)**
WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-icon_account'))

// **Klik ikon akun untuk membuka menu dropdown yang berisi opsi Logout**
WebUI.click(findTestObject('Beranda Page/mat-icon_account'))

// **Verifikasi bahwa opsi "Logout" muncul di menu dropdown**
WebUI.verifyElementVisible(findTestObject('Beranda Page/span_Logout'))

// **Klik opsi "Logout" untuk keluar dari akun**
WebUI.click(findTestObject('Beranda Page/span_Logout'))

// **Verifikasi bahwa ikon akun tidak lagi terlihat di halaman Beranda (berarti pengguna telah logout)**
WebUI.verifyElementNotPresent(findTestObject('Beranda Page/mat-icon_account'), 0)

