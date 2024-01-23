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
import groovy.time.TimeCategory as TimeCategory
import groovy.time.TimeDuration as TimeDuration

f = new File('C://Temp/tags_perf.csv')

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('TIPWeb-IT/Login (1)/input_Username'), username)

WebUI.setText(findTestObject('TIPWeb-IT/Login (1)/input_Password'), password)

WebUI.click(findTestObject('TIPWeb-IT/Login (1)/input_LogOnButton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/span_Tags'))

for (int i = 0; i < 51; i++) {
    WebUI.delay(3)

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/a_select'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/input_Check All_rcbCheckAllItemsCheckBox'))

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/a_select_1'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/input_Check All_rcbCheckAllItemsCheckBox'))

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/a_Page Size arrow'))

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/li_50'))

    start = new Date()

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/input_Vendor_ctl00ContentPlaceHolder1ImageButtonGo'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Tags Perf/a_Tag 09890'), 30)

    end = new Date()

    TimeDuration td = TimeCategory.minus(end, start)

    (f << '\n') << td

    WebUI.delay(4)

    WebUI.click(findTestObject('TIPWeb-IT/Tags Perf/input_Reset Filters'))

    WebUI.delay(4)
}

WebUI.delay(7)

WebUI.click(findTestObject('TIPWeb-IT/logout/span_Toggle'))

WebUI.click(findTestObject('TIPWeb-IT/logout/span_Log Off'))

WebUI.closeBrowser()

