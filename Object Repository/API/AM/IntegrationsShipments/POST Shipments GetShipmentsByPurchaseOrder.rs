<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST Shipments GetShipmentsByPurchaseOrder</name>
   <tag></tag>
   <elementGuidId>e337fcf2-1e22-45ee-a0f8-79186025cf01</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n\t\&quot;009731\&quot;,\n\t\&quot;P118432\&quot;,\n\t\&quot;007341\&quot;\n]&quot;,
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
      <webElementGuid>91f405e8-f655-43aa-a886-a9e0cddcd2b3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${TIPWebAPI_Bearer}</value>
      <webElementGuid>a6b14e2b-ee28-43e9-afa1-e4e93266ac70</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${TIPWebAPI_Url}/api/Integrations/Shipments/GetShipmentsByPurchaseOrder</restUrl>
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
      <id>193fee72-34d5-4287-b38b-53cfbce6cc18</id>
      <masked>false</masked>
      <name>TIPWebAPI_Url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Bearer</defaultValue>
      <description></description>
      <id>16625165-b5a3-4d4c-a89d-277ab2ca69a3</id>
      <masked>false</masked>
      <name>TIPWebAPI_Bearer</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>