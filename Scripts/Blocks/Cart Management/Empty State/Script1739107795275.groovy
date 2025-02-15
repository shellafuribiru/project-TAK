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


// **Cek apakah keranjang kosong dengan memeriksa elemen 'mat-Empty Text'**
if (WebUI.verifyElementVisible(findTestObject('Keranjang Page/mat-Empty Text'), FailureHandling.OPTIONAL)) {
    // **Jika elemen terlihat, berarti keranjang sudah kosong**
    WebUI.comment('✅ Keranjang kosong, tidak perlu menghapus item.')
} else {
    // **Jika elemen tidak terlihat, berarti masih ada item di keranjang**
    WebUI.comment('⚠ Keranjang tidak kosong, menghapus item...')

    // **Klik tombol "Clear Cart" untuk mengosongkan keranjang**
    WebUI.click(findTestObject('Keranjang Page/span_Clear Cart'))

    // **Verifikasi bahwa elemen 'mat-Empty Text' muncul setelah keranjang dikosongkan**
    WebUI.verifyElementVisible(findTestObject('Keranjang Page/mat-Empty Text'))
}
