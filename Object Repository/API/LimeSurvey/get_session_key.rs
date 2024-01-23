<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>get_session_key</name>
   <tag></tag>
   <elementGuidId>11129340-5083-426b-b223-8c7baf6da6b3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;jsonrpc\&quot;: \&quot;2.0\&quot;,\n\t\&quot;method\&quot;: \&quot;get_session_key\&quot;,\n\t\&quot;params\&quot;: [\n\t\t\&quot;${LimeSurvey_Username}\&quot;,\n\t\t\&quot;${LimeSurvey_Password}\&quot;,\n      \t\&quot;Authdb\&quot;\n\t],\n\t\&quot;id\&quot;: 1\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>2f0ca48d-21fc-4bfd-8c96-5c9a5f577137</webElementGuid>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${HHD_API_Url}/index.php/admin/remotecontrol</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.LimeSurvey_Username</defaultValue>
      <description></description>
      <id>c2625486-23aa-409f-a6eb-d9bd52eb84a8</id>
      <masked>false</masked>
      <name>LimeSurvey_Username</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.LimeSurvey_Password</defaultValue>
      <description></description>
      <id>565fbfee-3e02-4076-9361-3a94f88da38a</id>
      <masked>false</masked>
      <name>LimeSurvey_Password</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.HHD_API_Url</defaultValue>
      <description></description>
      <id>26f6c8c6-c457-4d93-8701-2e7d4d7f52cf</id>
      <masked>false</masked>
      <name>HHD_API_Url</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementPropertyValue(response, 'error', 'null')
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
