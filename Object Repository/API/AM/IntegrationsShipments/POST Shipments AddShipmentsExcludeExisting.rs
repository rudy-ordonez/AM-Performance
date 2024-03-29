<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST Shipments AddShipmentsExcludeExisting</name>
   <tag></tag>
   <elementGuidId>8c62ec68-b5c3-4205-b212-f9c4b82180aa</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[  \r\n   {  \r\n      \&quot;OrderNumber\&quot;:\&quot;100000\&quot;,\r\n      \&quot;LineNumber\&quot;:\&quot;1\&quot;,\r\n      \&quot;SiteID\&quot;:\&quot;46411\&quot;,\r\n      \&quot;TicketNumber\&quot;:null,\r\n      \&quot;QuantityShipped\&quot;:1,\r\n      \&quot;TicketedBy\&quot;:null,\r\n      \&quot;TicketedDate\&quot;:null,\r\n      \&quot;Status\&quot;:\&quot;Open\&quot;,\r\n      \&quot;InvoiceNumber\&quot;:null,\r\n      \&quot;InvoiceDate\&quot;:null\r\n   },\r\n   {  \r\n      \&quot;orderNumber\&quot;:\&quot;3422013\&quot;,\r\n      \&quot;lineNumber\&quot;:1,\r\n      \&quot;siteID\&quot;:\&quot;69033\&quot;,\r\n      \&quot;ticketNumber\&quot;:null,\r\n      \&quot;quantityShipped\&quot;:1,\r\n      \&quot;ticketedBy\&quot;:null,\r\n      \&quot;ticketedDate\&quot;:null,\r\n      \&quot;status\&quot;:\&quot;Open\&quot;,\r\n      \&quot;invoiceNumber\&quot;:null,\r\n      \&quot;invoiceDate\&quot;:null\r\n   }\r\n]&quot;,
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
      <webElementGuid>b52e1537-9d3c-4c49-9fea-0c33eda7ccf7</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${TIPWebAPI_Bearer}</value>
      <webElementGuid>44db2976-e880-4046-bed5-a20c6ac9a8e1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${TIPWebAPI_Url}/api/Integrations/Shipments/AddShipmentsExcludeExisting</restUrl>
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
      <id>1c42e759-079f-48cb-bfdb-994f27e37ca2</id>
      <masked>false</masked>
      <name>TIPWebAPI_Url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Bearer</defaultValue>
      <description></description>
      <id>23670fb8-d0b7-4de5-8bc9-56739e6f09eb</id>
      <masked>false</masked>
      <name>TIPWebAPI_Bearer</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
