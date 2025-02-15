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

// **Verifikasi bahwa judul halaman "Books" terlihat di halaman detail produk**
WebUI.verifyElementVisible(findTestObject('Product Detail Page/mat-Title Books'))

// **Verifikasi bahwa elemen produk (title) terlihat di halaman detail produk**
WebUI.verifyElementVisible(findTestObject('Product Detail Page/td_Title Products'))

// **Ambil teks nama produk dari halaman detail produk dan hilangkan spasi di awal/akhir**
String actualTitleProducts = WebUI.getText(findTestObject('Product Detail Page/td_Title Products')).trim()

// **Ambil nama produk yang diharapkan dari Global Variable dan hilangkan spasi di awal/akhir**
String expectedTitleProducts = GlobalVariable.productNameExpected.trim()

// **Validasi apakah nama produk sesuai dengan yang diharapkan**
WebUI.verifyMatch(actualTitleProducts, expectedTitleProducts, false, FailureHandling.STOP_ON_FAILURE)

// **Cetak hasil validasi ke dalam log**
WebUI.comment("✅ Nama produk sesuai: " + actualTitleProducts)

// **Verifikasi bahwa elemen informasi produk lainnya terlihat di halaman**
WebUI.verifyElementVisible(findTestObject('Product Detail Page/td_Author'))
WebUI.verifyElementVisible(findTestObject('Product Detail Page/td_Category'))
WebUI.verifyElementVisible(findTestObject('Product Detail Page/td_Price'))

// **Ambil teks harga produk dari halaman detail produk dan hilangkan spasi di awal/akhir**
String actualProductPrice = WebUI.getText(findTestObject('Product Detail Page/td_Price')).trim()

// **Ambil harga produk yang diharapkan dari Global Variable dan hilangkan spasi di awal/akhir**
String expectedProductPrice = GlobalVariable.productPriceExpected.trim()

// **Validasi apakah harga produk sesuai dengan yang diharapkan**
WebUI.verifyMatch(actualProductPrice, expectedProductPrice, false, FailureHandling.STOP_ON_FAILURE)

// **Verifikasi bahwa tombol "Add to Cart" terlihat di halaman detail produk**
WebUI.verifyElementVisible(findTestObject('Product Detail Page/span_Add to Cart'))

