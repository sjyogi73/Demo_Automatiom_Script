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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shloklabs-adroitpayroll.greythr.com/')

WebUI.setEncryptedText(findTestObject('Object Repository/Home/Login/Logiut/Page_greytHR IDP/input_Password_password'), 'v2hNRcSmpQIGSBa9yU4OGA==')

WebUI.setText(findTestObject('Object Repository/Home/Login/Logiut/Page_greytHR IDP/input_Login ID_username'), '433')

WebUI.click(findTestObject('Object Repository/Home/Login/Logiut/Page_greytHR/div_Policy has been released for you Work F_b7dc19'))

WebUI.click(findTestObject('Object Repository/Home/Login/Logiut/Page_greytHR IDP/button_Go back to log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Home/Login/Logiut/Page_greytHR IDP/input_Password_password'), 'v2hNRcSmpQIGSBa9yU4OGA==')

WebUI.setText(findTestObject('Object Repository/Home/Login/Logiut/Page_greytHR IDP/input_Login ID_username'), '433')

