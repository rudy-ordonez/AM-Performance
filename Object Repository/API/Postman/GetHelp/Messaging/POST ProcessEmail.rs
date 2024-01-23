<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST ProcessEmail</name>
   <tag></tag>
   <elementGuidId>f17616cd-7096-465d-b4ee-52b103850511</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n\t\&quot;ToEmail\&quot;: \&quot;helpdesk@sandbox.hsshelpdesk.com\&quot;,\r\n\t\&quot;FromEmail\&quot;: \&quot;gcollazo@hayessoft.com\&quot;,\r\n\t\&quot;Subject\&quot;: \&quot;My Alien Laptop is a lemon !!!\&quot;,\r\n\t\&quot;Body\&quot;: \&quot;The fan is always on, Slow, over heats, video goes in and out, no network, and bad sound\&quot;,\r\n\t\&quot;SentDate\&quot;: \&quot;2019-05-08T20:56:53.703\&quot;\r\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${HHD_API_Url}/api/Messaging/ProcessEmail</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.HHD_API_Url</defaultValue>
      <description></description>
      <id>97cae0f8-fbc9-42c2-82b4-58575499ea7e</id>
      <masked>false</masked>
      <name>HHD_API_Url</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
