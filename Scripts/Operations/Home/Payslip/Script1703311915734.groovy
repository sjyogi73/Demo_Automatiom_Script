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

//WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshotAsCheckpoint('Home')

WebUI.takeElementScreenshotAsCheckpoint('Home page Dialog validation', AppointmentDialogObject)

WebUI.delay(5)

WebUI.takeElementScreenshotAsCheckpoint('Payslip dialog validation', PayslipDialogObject)


WebUI.click(findTestObject('Object Repository/Menu/Home/Declare/Page_greytHR/span_Payslip_inline-block image-gt-icon-wid_46ee29'))

WebUI.click(findTestObject('Object Repository/Menu/Home/Declare/Page_greytHR/span_Nov 2023'))

WebUI.click(findTestObject('Object Repository/Menu/Home/Declare/Page_greytHR/a_Oct 2023'))

WebUI.click(findTestObject('Object Repository/Menu/Home/Declare/Page_greytHR/button_Oct 2023'))

// Check Full Appointment with TestOps Visual Testing
WebUI.takeFullPageScreenshotAsCheckpoint('Review Payslip')

WebUI.click(findTestObject('Object Repository/Menu/Home/Declare/Page_greytHR/a_Sep 2023'))

