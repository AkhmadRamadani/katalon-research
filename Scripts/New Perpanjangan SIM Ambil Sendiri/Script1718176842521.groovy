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

Mobile.startExistingApplication('id.qoin.korlantas.user')

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (2)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (5)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.Button'), 
    10)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (6)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.EditText'), 
    10)

Mobile.setText(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.EditText (1)'), 
    '1122334455667', 10)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (1)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (3)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (7)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (4)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (3)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (7)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (5)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (3)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (7)'), 
    10)

Mobile.scrollToText('Pas Foto')

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (6)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (3)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.widget.ImageView (7)'), 
    10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'), 
    10)


Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextWaktuSimDiterbitkan'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/OkButton'), 10)

Mobile.scrollToText('Pilih Masa Berlaku SIM')

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/ViewPilihMasaBerlakuSIM'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/OkButton'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Masukkan Tempat Diterbitkan',FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextTempatDiterbitkanSIM'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextTempatDiterbitkanSIM'), 'MALANG', 
    5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()


Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Masukkan Nama Ibu Kandung',FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextMotherName'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextMotherName'), 'MAMA', 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Masukkan Nama Ayah Kandung')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextFatherName'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextFatherName'), 'PAPA', 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Masukkan Kecamatan/Kelurahan')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKecamatan'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKecamatan'), 'BLIMBING', 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKodePOS'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKodePOS'), '65126', 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/ViewPilihPendidikanTerakhir'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/FirstOption'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Masukkan Kota Darurat')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextNamaKontakDarurat'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextNamaKontakDarurat'), 'KONTAK DARURAT', 
    5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextHubunganKontakDarurat'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextHubunganKontakDarurat'), 'KAKAK KANDUNG', 
    5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextNoKontakDarurat'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextNoKontakDarurat'), '0829819212412', 
    5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextAlamatKontakDarurat'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextAlamatKontakDarurat'), 'Jl. Cakalang', 
    5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKotaKontakDarurat'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKotaKontakDarurat'), 'MALANG', 5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKodePosKontakDarurat'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/App/Activity/Perpanjang SIM/Step 2/EditTextKodePosKontakDarurat'), '65126', 5)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 2/BottomButtonCheckCompleteness'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 2/HasilRIKKESJasmaniChecked'),
	10)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 2/HasilTesPsikologiChecked'),
	10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/TextFieldChoosePolda'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/EditTextPilihWilayahPolda'),
	10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/EditTextPilihWilayahPolda'),
	'JATIM', 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/JATIMOPTION'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 4/TextFieldChooseSatpas'), 10)
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/POLRESTASIDOARJOOPTION'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/SatpasCodeValue'),
	10)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 3/SatpasNameValue'),
	10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 4/TextFieldBankDestination'),
	10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 5/BCAOPTION'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 5/EditTextNomorRekening'), 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 5/EditTextNomorRekening'),
	'3310855340', 10)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 4/ButtonCheckRekening'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 4/View - AKHMAD RAMADANI'),
	10)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step 4/CheckboxAggrementBank'), 0)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step5-6-Webview/ShippingAmbilSendiri'),
	0)


Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/New Step 1/android.view.View (7)'),
	10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Perpanjang SIM/Step5-6-Webview/ButtonCloseWebview'),
	0)
