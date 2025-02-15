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

// **Verifikasi bahwa elemen produk "Harry Potter" terlihat di halaman Beranda**
WebUI.verifyElementVisible(findTestObject('Beranda Page/Product Details/div_Harry Potter'))

// **Ambil teks nama produk dari halaman Beranda**
String productNameExpected = WebUI.getText(findTestObject('Beranda Page/Product Details/div_Harry Potter'))

// **Verifikasi bahwa harga produk terlihat di halaman Beranda**
WebUI.verifyElementVisible(findTestObject('Beranda Page/Product Details/p_Product Price'))

// **Ambil teks harga produk dari halaman Beranda**
String productPriceExpected = WebUI.getText(findTestObject('Beranda Page/Product Details/p_Product Price'))

// **Simpan harga produk ke dalam Global Variable untuk digunakan dalam test case lain**
GlobalVariable.productPriceExpected = productPriceExpected

// **Klik produk "Harry Potter" untuk masuk ke halaman detail produk**
WebUI.click(findTestObject('Beranda Page/Product Details/div_Harry Potter'))
