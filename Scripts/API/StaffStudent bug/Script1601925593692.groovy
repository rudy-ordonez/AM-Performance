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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import groovy.json.JsonSlurper as JsonSlurper
import groovy.json.JsonOutput as JsonOutput
import groovy.transform.Field as Field
import com.kms.katalon.core.testobject.ConditionType as ConditionType

for (int i = 0; i < 1; i++) {
    //println(new Date().getTime())
    //f = new File('C://Temp/times.txt')
    //f.append(new Date().getTime() + ' ')
    response = WS.sendRequestAndVerify(findTestObject('null', [('TIPWebAPI_Url') : GlobalVariable.TIPWebAPI_Url
                , ('TIPWebAPI_Key') : GlobalVariable.TIPWebAPI_Key, ('TIPWebAPI_Phrase') : GlobalVariable.TIPWebAPI_Phrase]))

    //f.append(new Date().getTime() + ' ')
    def outputText = response.getResponseText()

    println(JsonOutput.prettyPrint(outputText))

    def slurper = new JsonSlurper()

    def result = slurper.parseText(response.getResponseBodyContent())

    GlobalVariable.TIPWebAPI_Bearer = String.format('Bearer %s', result.token)

    //println(new Date().getTime())
    //f.append(new Date().getTime() + ' ')
    asset = WS.sendRequestAndVerify(findTestObject('null', [('TIPWebAPI_Url') : GlobalVariable.TIPWebAPI_Url
                , ('TIPWebAPI_Bearer') : GlobalVariable.TIPWebAPI_Bearer]))

    //f.append(new Date().getTime() + ' ')
    def assets = asset.getResponseText()

    println(JsonOutput.prettyPrint(assets))

    //f.append(JsonOutput.prettyPrint(assets))
    //println(new Date().getTime())
    //f.append(new Date().getTime() + ' ')
    staff = WS.sendRequestAndVerify(findTestObject('null', [('TIPWebAPI_Url') : GlobalVariable.TIPWebAPI_Url
                , ('TIPWebAPI_Bearer') : GlobalVariable.TIPWebAPI_Bearer]))

    //f.append(new Date().getTime() + ' ')
    def students = staff.getResponseText()

    println(JsonOutput.prettyPrint(students))
}

