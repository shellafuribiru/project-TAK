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

// **Verifikasi ikon keranjang terlihat di halaman Beranda**
WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-Icon Cart'))

// **Klik ikon keranjang untuk membuka halaman keranjang**
WebUI.click(findTestObject('Beranda Page/mat-Icon Cart'))

// **Verifikasi halaman keranjang berhasil dibuka**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/mat-Title Shopping cart'))

// **Verifikasi produk terlihat dalam keranjang**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/a_Actual Name Product'))

// **Ambil teks nama produk dari halaman keranjang**
String actualProductName = WebUI.getText(findTestObject('Keranjang Page/a_Actual Name Product'))

// **Ambil nama produk yang diharapkan dari Global Variable**
String expectedProductName = GlobalVariable.productNameExpected

// **Bandingkan nama produk yang terlihat di UI dengan yang diharapkan**
WebUI.verifyMatch(actualProductName, expectedProductName, false, FailureHandling.STOP_ON_FAILURE)

// **Verifikasi elemen jumlah (quantity) produk terlihat di halaman keranjang**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/div_Qty'))

// **Ambil nilai jumlah (quantity) produk**
String qty = WebUI.getText(findTestObject('Keranjang Page/div_Qty'))

// **Simpan nilai quantity ke Global Variable agar bisa digunakan di test case lain**
GlobalVariable.qty = qty

// **Verifikasi elemen harga produk terlihat di halaman keranjang**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/td_Actual Price Product'))

// **Ambil teks harga produk dari UI**
String actualProductPrice = WebUI.getText(findTestObject('Keranjang Page/td_Actual Price Product'))

// **Hapus karakter selain angka (seperti simbol mata uang) dan ubah ke tipe `double`**
double productPrice = actualProductPrice.replaceAll('[^0-9.]', '').toDouble()

// **Ambil harga produk yang diharapkan dari Global Variable**
String expectedProductPrice = GlobalVariable.productPriceExpected

// **Bandingkan harga produk yang terlihat di UI dengan yang diharapkan**
WebUI.verifyMatch(actualProductPrice, expectedProductPrice, false, FailureHandling.STOP_ON_FAILURE)

// **Verifikasi elemen total harga terlihat di halaman keranjang**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/td_Total Price'))

// **Ambil teks total harga dari UI**
String priceTotaText = WebUI.getText(findTestObject('Keranjang Page/td_Total Price'))

// **Hapus karakter selain angka dan ubah ke tipe `double` untuk perhitungan**
double priceTotal = priceTotaText.replaceAll('[^0-9.]', '').toDouble()

// **Konversi nilai quantity dari String ke Integer untuk perhitungan**
int qtyInt = qty.replaceAll('[^0-9]', '').toInteger()

// **Hitung total harga berdasarkan rumus: jumlah (qty) x harga produk**
double expectedTotal = qtyInt * productPrice

// **Cetak hasil ke log untuk debugging**
WebUI.comment("✅ QTY INT: " + qtyInt)
WebUI.comment("✅ Price Total: " + priceTotal)
WebUI.comment("✅ Expected Total: " + expectedTotal)

// **Validasi apakah total harga sesuai dengan perhitungan**
WebUI.verifyEqual(priceTotal, expectedTotal, FailureHandling.STOP_ON_FAILURE)

// **Simpan total harga ke dalam Global Variable untuk digunakan di test case lain**
GlobalVariable.priceTotal = priceTotal

// **Verifikasi elemen total harga cart terlihat di halaman keranjang**
WebUI.verifyElementVisible(findTestObject('Keranjang Page/strong_Cart Total'))

// **Ambil teks total harga dari cart**
String cartTotalPrice = WebUI.getText(findTestObject('Keranjang Page/strong_Cart Total'))

// **Simpan nilai total harga cart ke dalam Global Variable**
GlobalVariable.cartPriceTotal = cartTotalPrice
