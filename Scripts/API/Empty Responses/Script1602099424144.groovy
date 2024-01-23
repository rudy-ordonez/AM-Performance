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

response = WS.sendRequest(findTestObject('API/Postman/GetHelp/Login/POST Login', [('HHD_API_Url') : GlobalVariable.HHD_API_Url
            , ('HHD_API_User') : GlobalVariable.HHD_API_User, ('HHD_API_Password') : GlobalVariable.HHD_API_Password]))

def outputText = response.getResponseText()

println(JsonOutput.prettyPrint(outputText))

def slurper = new JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

GlobalVariable.HHD_API_Bearer = String.format('Bearer %s', result.hayesToken)

user = WS.sendRequest(findTestObject('API/Postman/GetHelp/Users/Get User by ID', [('HHD_API_Url') : GlobalVariable.HHD_API_Url
            , ('HHD_API_Bearer') : GlobalVariable.HHD_API_Bearer]))

stat1 = WS.getResponseStatusCode(user)

println("User ID "+stat1)

def user2 = user.getResponseText()

println(JsonOutput.prettyPrint(user2))

//User ID goes in the header of this call
active = WS.sendRequest(findTestObject('API/Postman/GetHelp/Tickets/GET GetActiveTickets', [('HHD_API_Url') : GlobalVariable.HHD_API_Url
            , ('HHD_API_Bearer') : GlobalVariable.HHD_API_Bearer]))

stat2 = WS.getResponseStatusCode(active)

println("Active Tickets "+stat2)

def active2 = active.getResponseText()

println(JsonOutput.prettyPrint(active2))

ticket = WS.sendRequest(findTestObject('API/Postman/GetHelp/Tickets/GET Ticket', [('HHD_API_Url') : GlobalVariable.HHD_API_Url
            , ('HHD_API_Bearer') : GlobalVariable.HHD_API_Bearer]))

stat3 = WS.getResponseStatusCode(ticket)

println("Ticket "+stat3)

def ticket2 = ticket.getResponseText()

println(JsonOutput.prettyPrint(ticket2))

