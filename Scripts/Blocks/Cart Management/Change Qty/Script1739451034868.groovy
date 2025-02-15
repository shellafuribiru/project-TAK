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

// **Klik elemen quantity untuk memperbarui jumlah produk**
WebUI.click(findTestObject('Keranjang Page/div_Qty'))

// **Ambil teks jumlah produk setelah perubahan**
String qtyText = WebUI.getText(findTestObject('Keranjang Page/div_Qty'))

// **Konversi teks quantity ke Integer untuk perhitungan**
int qtyAfterChanged = qtyText.replaceAll('[^0-9]', '').toInteger()

// **Ambil teks harga satuan produk dari halaman**
String priceText = WebUI.getText(findTestObject('Keranjang Page/td_Actual Price Product'))

// **Hapus karakter selain angka dan konversi ke tipe `double` untuk perhitungan harga**
double productPrice = priceText.replaceAll('[^0-9.]', '').toDouble()

// **Ambil teks total harga dari halaman keranjang**
String cartTotalText = WebUI.getText(findTestObject('Keranjang Page/td_Total Price'))

// **Hapus karakter selain angka dan konversi ke tipe `double`**
double cartTotal = cartTotalText.replaceAll('[^0-9.]', '').toDouble()

// **Hitung total harga yang diharapkan berdasarkan rumus: jumlah x harga satuan**
double expectedTotal = qtyAfterChanged * productPrice

// **Validasi apakah total harga sesuai dengan perhitungan**
if (cartTotal == expectedTotal) {
    WebUI.comment('✅ Validasi Berhasil! Total harga sesuai: ' + cartTotal)
} else {
    WebUI.comment((('❌ Validasi Gagal! Expected: ' + expectedTotal) + ', but got: ') + cartTotal)
}

