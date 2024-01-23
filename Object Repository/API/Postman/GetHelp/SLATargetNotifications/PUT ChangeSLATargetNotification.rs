<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT ChangeSLATargetNotification</name>
   <tag></tag>
   <elementGuidId>a162798d-2e39-482a-8fe8-a3a94e9aff46</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;slaTargetNotificationID\&quot;: 1,\n\t\&quot;slaTargetRuleID\&quot;: 1,\n\t\&quot;enabled\&quot;: true,\n\t\&quot;lastModifiedByUserAccountID\&quot;: 5,\n\t\&quot;slaTargetNotificationDetails\&quot;: [\n\t\t{\n\t\t\t\&quot;slaTargetNotificationDetailID\&quot;: 1,\n\t\t\t\&quot;slaTargetNotificationID\&quot;: 1,\n\t\t\t\&quot;slaTargetTypeID\&quot;: 1,\n\t\t\t\&quot;targetNotificationValue\&quot;: 10,\n\t\t\t\&quot;targetNotificationComparisonValue\&quot;: \&quot;\u003e\&quot;,\n\t\t\t\&quot;targetNotificationComparisonTypeID\&quot;: 0,\n\t\t\t\&quot;lastModifiedByUserAccountID\&quot;: 5\n\t\t},\n\t\t{\n\t\t\t\&quot;slaTargetNotificationDetailID\&quot;: 0,\n\t\t\t\&quot;slaTargetNotificationID\&quot;: 1,\n\t\t\t\&quot;slaTargetTypeID\&quot;: 2,\n\t\t\t\&quot;targetNotificationValue\&quot;: 5,\n\t\t\t\&quot;targetNotificationComparisonValue\&quot;: \&quot;\u003c\&quot;,\n\t\t\t\&quot;targetNotificationComparisonTypeID\&quot;: 1,\n\t\t\t\&quot;lastModifiedByUserAccountID\&quot;: 5\n\t\t},\n\t\t{\n\t\t\t\&quot;slaTargetNotificationDetailID\&quot;: 14,\n\t\t\t\&quot;slaTargetNotificationID\&quot;: 1,\n\t\t\t\&quot;slaTargetTypeID\&quot;: 1,\n\t\t\t\&quot;targetNotificationValue\&quot;: 0,\n\t\t\t\&quot;targetNotificationComparisonValue\&quot;: \&quot;\u003d\&quot;,\n\t\t\t\&quot;targetNotificationComparisonTypeID\&quot;: 0,\n\t\t\t\&quot;lastModifiedByUserAccountID\&quot;: 5\n\t\t}\n\t]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${HHD_API_Bearer}</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${HHD_API_Url}/api/SLATargetNotification/ChangeSLATargetNotification</restUrl>
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
      <id>1bed7f6f-572f-4f7e-94d5-04702ec0df3b</id>
      <masked>false</masked>
      <name>HHD_API_Url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.HHD_API_Bearer</defaultValue>
      <description></description>
      <id>578acf09-5f01-4762-9e4c-cd0d8198e98e</id>
      <masked>false</masked>
      <name>HHD_API_Bearer</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>