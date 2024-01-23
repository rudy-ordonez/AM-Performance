<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update User - Body</name>
   <tag></tag>
   <elementGuidId>113b871e-2082-4ad3-9f61-2a3eaf581400</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;UserID\&quot;:\&quot;2\&quot;,\n\t\&quot;LoginName\&quot;: \&quot;pepe2\&quot;,\n\t\&quot;Active\&quot;: \&quot;true\&quot;,\n\t\&quot;UserTypeId\&quot;: 1,\n\t\&quot;FirstName\&quot;: \&quot;Jose\&quot;,\n\t\&quot;MiddleName\&quot;: \&quot;El\&quot;,\n\t\&quot;LastName\&quot;: \&quot;Toro\&quot;,\n\t\&quot;Email\&quot;: \&quot;bu@Vaca.com\&quot;,\n\t\&quot;PhoneNumber\&quot;: \&quot;8005145555\&quot;,\n\t\&quot;UpdatedById\&quot;: \&quot;2\&quot;\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${HHD_API_Url}/api/User/UpdateUser</restUrl>
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
      <id>6268c30d-4d90-44b4-8997-58cb6f7c1085</id>
      <masked>false</masked>
      <name>HHD_API_Url</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
