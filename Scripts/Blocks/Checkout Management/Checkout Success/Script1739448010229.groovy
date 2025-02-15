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

WebUI.click(findTestObject('Keranjang Page/span_Checkout Button'))

WebUI.setText(findTestObject('Checkout Page/input_Name'), Name)

WebUI.setText(findTestObject('Checkout Page/input_Address Line 1'), Address_1)

WebUI.setText(findTestObject('Checkout Page/input_Address Line 2'), Address_2)

WebUI.setText(findTestObject('Checkout Page/input_Pincode'), Pincode)

WebUI.setText(findTestObject('Checkout Page/input_State'), State)

WebUI.verifyElementVisible(findTestObject('List Order Page/mat-card-title_My Orders'))

WebUI.verifyElementVisible(findTestObject('Checkout Page/td_Product Name'))

//Ambil teks dari elemen nama produk
String actualProductName = WebUI.getText(findTestObject('Checkout Page/td_Product Name'))

// Bandingkan dengan variabel global yang berisi nama produk yang diharapkan
String expectedProductName = GlobalVariable.productNameExpected

// Validasi dengan verifyMatch agar tes gagal jika tidak cocok
WebUI.verifyMatch(actualProductName, expectedProductName, false, FailureHandling.STOP_ON_FAILURE)

// Ambil element price harga 1 item
String actualPriceProduct = WebUI.getText(findTestObject('Checkout Page/td_Price Product'))

// Bandingkan dengan variabel global yang berisi price produk yang diharapkan
String expectedPriceProduct = GlobalVariable.productPriceExpected

// Cetak hasil ke log
WebUI.comment('✅ Actual Price Product: ' + actualPriceProduct)

WebUI.comment('✅ Expected Price Prouct: ' + expectedPriceProduct)

// Validasi dengan verifyMatch agar tes gagal jika tidak cocok
WebUI.verifyMatch(actualPriceProduct, expectedPriceProduct, false, FailureHandling.STOP_ON_FAILURE)

//Ambil teks dari elemen qty produk
String actualQtyProduct = WebUI.getText(findTestObject('Checkout Page/td_Qty Product'))

// Cetak hasil ke log
WebUI.comment('✅ Actual Price Product: ' + actualQtyProduct)

// Bandingkan dengan variabel global yang berisi nama produk yang diharapkan
String expectedQtyProduct = GlobalVariable.qty

// Validasi dengan verifyMatch agar tes gagal jika tidak cocok
WebUI.verifyMatch(actualQtyProduct, expectedQtyProduct, false, FailureHandling.STOP_ON_FAILURE)

// Verify element total price
WebUI.verifyElementVisible(findTestObject('Checkout Page/td_Total Price'))

//Ambil teks dari element total price
String totalPriceText = WebUI.getText(findTestObject('Checkout Page/td_Total Price'))
double actualTotalPrice = totalPriceText.replaceAll('[^0-9.]', '').toDouble() // Bersihkan simbol lalu konversi ke double

String expectedtotalPrice = GlobalVariable.priceTotal

// Validasi dengan verifyEqual (boolean) agar tes gagal jika tidak cocok
WebUI.verifyEqual(actualTotalPrice, expectedtotalPrice, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout Page/span_Place Order'))

