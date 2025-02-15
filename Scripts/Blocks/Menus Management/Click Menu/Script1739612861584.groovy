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

// Menentukan menu yang dipilih dari variabel `menu`
select_menu = menu

// Menggunakan `switch-case` untuk menangani berbagai kategori menu yang dapat diklik
switch (select_menu) {
    
    case 'Biography':
        // Verifikasi bahwa kategori Biography terlihat di halaman
        WebUI.verifyElementVisible(findTestObject('Beranda Page/span_Biography Categories'))
        
        // Klik kategori Biography
        WebUI.click(findTestObject('Beranda Page/span_Biography Categories'))
        break

    case 'Fantasy':
        // Verifikasi bahwa kategori Fantasy terlihat di halaman
        WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-Fantasy Categories'))
        
        // Klik kategori Fantasy
        WebUI.click(findTestObject('Beranda Page/mat-Fantasy Categories'))
        break

    case 'Fiction':
        // Verifikasi bahwa kategori Fiction terlihat di halaman
        WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-Fiction Categories'))
        
        // Klik kategori Fiction
        WebUI.click(findTestObject('Beranda Page/mat-Fiction Categories'))

        // Ambil nilai atribut `class` dari elemen yang diklik untuk memastikan kategori aktif
        String classValue = WebUI.getAttribute(findTestObject('Beranda Page/mat-Fiction Categories'), 'class')

        // Verifikasi apakah class elemen mengandung "active-category" untuk memastikan bahwa kategori sudah aktif setelah diklik
        boolean isActive = WebUI.verifyMatch(classValue, '.*active-category.*', true, FailureHandling.CONTINUE_ON_FAILURE)

        break

    case 'Mystery':
        // Verifikasi bahwa kategori Mystery terlihat di halaman
        WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-Mystery Categories'))
        
        // Klik kategori Mystery
        WebUI.click(findTestObject('Beranda Page/mat-Mystery Categories'))
        break

    case 'Romance':
        // Verifikasi bahwa kategori Romance terlihat di halaman
        WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-Romance Categories'))
        
        // Klik kategori Romance
        WebUI.click(findTestObject('Beranda Page/mat-Romance Categories'))
        break

    default:
        // Jika kategori yang dipilih tidak ada di daftar, pilih kategori "All Categories"
        WebUI.verifyElementVisible(findTestObject('Beranda Page/mat-All Categories'))
        
        // Klik kategori All Categories
        WebUI.click(findTestObject('Beranda Page/mat-All Categories'))
        break
}

