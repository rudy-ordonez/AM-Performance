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

File file = new File('C:/Temp/P2P.csv')

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('TIPWeb-IT/Login (1)/input_Username'), username)

WebUI.setText(findTestObject('TIPWeb-IT/Login (1)/input_Password'), password)

WebUI.click(findTestObject('TIPWeb-IT/Login (1)/input_LogOnButton'))

for (int i = 0; i < 51; i++) {
    WebUI.verifyElementClickable(findTestObject('TIPWeb-IT/Dashboard/span_Home'))

    WebUI.mouseOver(findTestObject('TIPWeb-IT/Dashboard/span_Catalog'))

    WebUI.delay(2)

    long a1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/span_Parts'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/Parts/a_Add Record'), 10)

    'Time for Parts Catalog'
    long a2 = System.currentTimeMillis()

    WebUI.mouseOver(findTestObject('TIPWeb-IT/Dashboard/span_Catalog'))

    long b1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/span_Products'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/Products/a_Add Record'), 10)

    'Time for Products Catalog'
    long b2 = System.currentTimeMillis()

    long c1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/span_Purchasing'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/Purchasing/a_Add Record'), 10)

    'Time for Purchasing page'
    long c2 = System.currentTimeMillis()

    long d1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/span_Sites'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/Sites/a_Add Record'), 10)

    'Time for Sites page'
    long d2 = System.currentTimeMillis()

    long e1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/a_Tags'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/Tags/input_Go'), 10)

    'Time for Tags page'
    long e2 = System.currentTimeMillis()

    WebUI.mouseOver(findTestObject('TIPWeb-IT/Dashboard/span_Audits'))

    WebUI.delay(2)

    long f1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/span_View Site Audits'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/View Audit/a_Add Record'), 15)

    'Time for View Site Audits page'
    long f2 = System.currentTimeMillis()

    WebUI.mouseOver(findTestObject('TIPWeb-IT/Dashboard/span_Audits'))

    WebUI.delay(2)

    long g1 = System.currentTimeMillis()

    WebUI.click(findTestObject('TIPWeb-IT/Dashboard/span_Reconcile Audits'))

    WebUI.waitForElementClickable(findTestObject('TIPWeb-IT/Dashboard/Reconcile Audits/input_Go'), 10)

    'Tiem for Reconcile Audits page'
    long g2 = System.currentTimeMillis()

    WebUI.delay(4)

    (((((((((((((((file << new Date(a1).format('MM-dd-yyyy hh:mm:ss:SS')) << ',') << ((a2 - a1) / 1000)) << ',') << ((b2 - 
    b1) / 1000)) << ',') << ((c2 - c1) / 1000)) << ',') << ((d2 - d1) / 1000)) << ',') << ((e2 - e1) / 1000)) << ',') << 
    ((f2 - f1) / 1000)) << ',') << ((g2 - g1) / 1000)) << '\r\n'
}

WebUI.click(findTestObject('TIPWeb-IT/logout/span_Toggle'))

WebUI.click(findTestObject('TIPWeb-IT/logout/a_Log Off'))

WebUI.closeBrowser()

