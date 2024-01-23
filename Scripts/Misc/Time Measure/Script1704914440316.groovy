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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

File file = new File("C:/Temp/demo2-load.csv")

WebUI.openBrowser('')
WebUI.maximizeWindow()

long a1 = System.currentTimeMillis()

WebUI.navigateToUrl('https://www.tipwebitdemo2.com/TIPIDCore/Logon.aspx')

WebUI.setText(findTestObject('Object Repository/Page_TIPWeb-IT ID Version 10100/input_Username_ctl00ContentPlaceHolder1LogO_adb2f3'),
	'supportit')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_TIPWeb-IT ID Version 10100/input_Password_ctl00ContentPlaceHolder1LogO_be365e'),
	'uPiVx+E08ufSK+QF4Z95eA==')
long a2 = System.currentTimeMillis()

long b1 = System.currentTimeMillis()

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT ID Version 10100/input_Password required_ctl00ContentPlaceHo_80c347'))

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/img_LOCCancel_ctl00_TIPWebITLogoSmall'))
long b2 = System.currentTimeMillis()

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/span_Toggle'))

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/span_Toggle'))

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/a_select'))

long c1 = System.currentTimeMillis()

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/li_Learning Campus'))

WebUI.setText(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/input_Home_ctl00SwitchMode'), 'Learning Campus')

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/span_Toggle'))
long c2 = System.currentTimeMillis()

file << new Date(a1).format("yyyy-MM-dd HH:mm:ss.SSS") <<  "," << (a2-a1)/1000L <<  "," << (b2-b1)/1000L << "," << (c2-c1)/1000L << "\r\n"

WebUI.click(findTestObject('Object Repository/Page_TIPWeb-IT Version 10200/span_Log Off'))

WebUI.closeBrowser()