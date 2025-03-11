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

// **Verifikasi bahwa tombol "Login" terlihat di halaman Beranda**
WebUI.verifyElementVisible(findTestObject('Beranda Page/span_Login'))

// **Klik tombol "Login" untuk masuk ke halaman login**
WebUI.click(findTestObject('Beranda Page/span_Login'))

// **Klik tombol "Register" untuk masuk ke halaman pendaftaran**
WebUI.click(findTestObject('Login Page/span_Register'))

// **Verifikasi bahwa halaman registrasi berhasil dibuka**
WebUI.verifyElementVisible(findTestObject('Register Page/mat-Title User Registration'))

// **Isi field "First Name" dengan nama "Test"**
WebUI.setText(findTestObject('Register Page/input_First Name'), firstname)

// **Isi field "Last Name" dengan nama "Shella"**
WebUI.setText(findTestObject('Register Page/input_Last Name'), lastname)

// **Isi field "User Name" dengan username "test_shella"**
WebUI.setText(findTestObject('Register Page/input_User Name'), username)

// **Isi field "Password" dengan teks terenkripsi**
WebUI.setEncryptedText(findTestObject('Register Page/input_Password'), password)

// **Isi field "Confirm Password" dengan teks terenkripsi yang sama**
WebUI.setEncryptedText(findTestObject('Register Page/input_Confirm Password'), confirmpassword)

// **Klik opsi "Gender Female"**
WebUI.click(findTestObject('Register Page/input_Gender Female'))

// **Klik tombol "Register" untuk mengajukan pendaftaran akun**
WebUI.click(findTestObject('Register Page/span_Register Button'))

// **Verifikasi bahwa pesan error format password muncul jika ada kesalahan format**
WebUI.verifyElementVisible(findTestObject('Register Page/mat-Error Password Format'))

