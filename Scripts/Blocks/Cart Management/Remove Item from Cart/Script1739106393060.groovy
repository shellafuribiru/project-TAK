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

// **Verifikasi bahwa elemen 'mat-Empty Text' tidak ada di halaman**
// **(artinya, keranjang tidak kosong sebelum menghapus item)**
WebUI.verifyElementNotPresent(findTestObject('Keranjang Page/mat-Empty Text'), 0)

// **Verifikasi bahwa ikon "Delete" terlihat di halaman keranjang**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/mat-Icon Delete'))

// **Klik ikon "Delete" untuk menghapus item dari keranjang**
WebUI.click(findTestObject('Keranjang Page/mat-Icon Delete'))

// **Verifikasi bahwa notifikasi "Book Removed" muncul setelah penghapusan berhasil**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/div_Book Removed'))
