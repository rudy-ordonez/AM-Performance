<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST SetTagStatus</name>
   <tag></tag>
   <elementGuidId>b41a0bad-2b7e-4f42-80c1-cdda8b499ac3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;tag\&quot;: \&quot;ASA197\&quot;,\r\n    \&quot;newStatus\&quot;: \&quot;Auctioned\&quot;,\r\n    //\&quot;newEntityUID\&quot;: \&quot;690907\&quot;,\r\n    //\&quot;newEntityTypeUID\&quot;: \&quot;2\&quot;,\r\n    //\&quot;siteUID\&quot;: 8,\r\n    \&quot;salesPrice\&quot; : 10,\r\n    \&quot;policeReportNumber\&quot; : \&quot;12345\&quot;,\r\n    \&quot;notes\&quot;: \&quot;testing using API\&quot;\r\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${TIPWebAPI_Bearer}</value>
      <webElementGuid>0f36bf08-4a97-41cb-95dd-e34a26bb8f2b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>7e7c7692-def4-43f4-84bf-c13644b4f8ed</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${TIPWebAPI_Url}/api/tag/SetTagStatus</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Url</defaultValue>
      <description></description>
      <id>6491bdc7-7744-451c-9be7-6e96298fabeb</id>
      <masked>false</masked>
      <name>TIPWebAPI_Url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Bearer</defaultValue>
      <description></description>
      <id>27fb6078-4b96-4e95-9de6-8c678378e02e</id>
      <masked>false</masked>
      <name>TIPWebAPI_Bearer</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
