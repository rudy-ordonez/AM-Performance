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
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import groovy.time.TimeCategory as TimeCategory
import groovy.time.TimeDuration as TimeDuration

f = new File('C://Temp/login_perf.csv')

for (int i = 0; i < 51; i++) {
WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('TIPWeb-IT/Login (1)/input_Username'), username)

WebUI.setText(findTestObject('TIPWeb-IT/Login (1)/input_Password'), password)

start = new Date()

WebUI.click(findTestObject('TIPWeb-IT/Login (1)/input_LogOnButton'))

WebUI.waitForElementPresent(findTestObject('TIPWeb-IT/Login (1)/a_View Details'), 60, FailureHandling.STOP_ON_FAILURE)

end = new Date()

TimeDuration td = TimeCategory.minus(end, start)

(f << '\n') << td

WebUI.click(findTestObject('TIPWeb-IT/logout/span_Toggle'))

WebUI.click(findTestObject('TIPWeb-IT/logout/span_Log Off'))

WebUI.closeBrowser()
}