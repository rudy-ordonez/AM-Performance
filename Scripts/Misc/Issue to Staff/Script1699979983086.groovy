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

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/a_Issue to Staff'))

WebUI.delay(5)

WebUI.setText(findTestObject('TIPWeb-IT/Issue to Staff/Staff ID'), '000002015')

WebUI.delay(5)

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Next'))

WebUI.delay(5)

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Drop Down'))

WebUI.delay(5)

'Today\'s Transaction Receipt'
WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/li_Todays Transaction Receipt'))

WebUI.delay(10)

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Download -Todays Transaction Receipt'))

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Drop Down'))

'Full Transaction Receipt'
WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/li_Full Transaction Receipt'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Download -Full Transaction Receipt'))

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Drop Down'))

'Full Distribution Receipt'
WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/li_Full Distribution Receipt'))

WebUI.delay(5)

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Close Rcpt'))

WebUI.click(findTestObject('TIPWeb-IT/Issue to Staff/Done'))

