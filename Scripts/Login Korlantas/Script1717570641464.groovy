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

WebUI.comment('Story: Login using right access')

WebUI.comment('Given that user has started Korlantas Apps')

Mobile.startExistingApplication('id.qoin.korlantas.user', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Input Phone Number/android.widget.EditTextPhoneNumber'), 20)

Mobile.setText(findTestObject('Application/App/Activity/Input Phone Number/android.widget.EditTextPhoneNumber'), '082174620190', 
    10)

Mobile.tap(findTestObject('Application/App/Activity/Input Phone Number/android.widget.ButtonLanjutkan'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Input Pin/android.view.View1'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Input Pin/android.view.View4'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Input Pin/android.view.View7'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Input Pin/android.view.View2'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Input Pin/android.view.View5'), 10)

Mobile.tap(findTestObject('Application/App/Activity/Input Pin/android.view.View8'), 10)

