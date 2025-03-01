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

// **Klik tombol "Login" di halaman Beranda untuk membuka halaman login**
WebUI.click(findTestObject('Beranda Page/span_Login'))

// **Verifikasi bahwa elemen "Title" pada halaman login terlihat (menandakan halaman login berhasil dibuka)**
WebUI.verifyElementVisible(findTestObject('Login Page/mat-Title'))

// **Masukkan username ke dalam input field username**
WebUI.setText(findTestObject('Login Page/input_Username'), username)

// **Masukkan password ke dalam input field password (dalam bentuk terenkripsi)**
WebUI.setEncryptedText(findTestObject('Login Page/input_Password'), password)

// **Klik tombol "Login" untuk masuk ke dalam aplikasi**
WebUI.click(findTestObject('Login Page/span_Login'))

// **Verifikasi bahwa ikon akun di halaman Beranda muncul setelah login berhasil**
WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-icon_account'))
