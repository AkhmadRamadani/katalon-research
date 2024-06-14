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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.DesiredCapabilities as Keys

WebUI.comment('Story: Perpanjangan SIM Ambil Sendiri')

WebUI.comment('Given that user has started Korlantas Apps and already logged in')

Mobile.startExistingApplication('id.qoin.korlantas.user', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Home/android.widget.ImageViewSIMMenu'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Home/android.widget.ImageViewPerpanjanganSIM'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Home/android.widget.ButtonLanjutkan'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/OptionTypeSIMA'), 10)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/EditTextNomorSIM'), '2039104219221', 10)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/KTPImageUploadButton'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/android.view.ViewGaleri'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Gallery/GalleryFirstItem'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/SIMImageUploadButton'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/android.view.ViewGaleri'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Gallery/GalleryFirstItem'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/SignatureImageUploadButton'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/android.view.ViewGaleri'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Gallery/GalleryFirstItem'), 10)

Mobile.scrollToText('Pas Foto')

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/PasPhotoImageUploadButton'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 1/android.view.ViewGaleri'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Gallery/GalleryFirstItem'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/ButtonLanjut'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextWaktuSimDiterbitkan'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/OkButton'), 10)

Mobile.scrollToText('Pilih Masa Berlaku SIM')

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/ViewPilihMasaBerlakuSIM'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/OkButton'), 10)

Mobile.scrollToText('Masukkan Tempat Diterbitkan', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextTempatDiterbitkanSIM'), 'MALANG', 
    5)

Mobile.scrollToText('Masukkan Nama Ibu Kandung')

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextMotherName'), 'MAMA', 10)

Mobile.scrollToText('Masukkan Nama Ayah Kandung')

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextFatherName'), 'PAPA', 10)

Mobile.scrollToText('Masukkan Kecamatan/Kelurahan')

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKecamatan'), 'BLIMBING', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKodePOS'), '65126', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/ViewPilihPendidikanTerakhir'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/FirstOption'), 10)

Mobile.scrollToText('Masukkan Kota Darurat')

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextNamaKontakDarurat'), 'KONTAK DARURAT', 
    5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextHubunganKontakDarurat'), 'KAKAK KANDUNG', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextNoKontakDarurat'), '0829819212412', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextAlamatKontakDarurat'), 'Jl. Cakalang', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKotaKontakDarurat'), 'MALANG', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKodePosKontakDarurat'), '65126', 0)

