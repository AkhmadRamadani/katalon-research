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

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Text Field Phone Number Login'), 5)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Application/Korlantas/Login/Text Field Phone Number Login (1)'), '082174620190', 
    5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Button Lanjutkan Login'), 5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Pad Button 1'), 5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Pad Button 4'), 5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Pad Button 7'), 5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Pad Button 2'), 5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Pad Button 5'), 5)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Korlantas/Login/Pad Button 8'), 5)

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/Korlantas/Login/SIM MENU'), 10)

Mobile.closeApplication()

