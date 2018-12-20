<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET_list_users</name>
   <tag></tag>
   <elementGuidId>4e3f1ed6-477b-43c0-96e4-29c52c4c938f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${URL}/api/users/?page=${page}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'https://reqres.in'</defaultValue>
      <description></description>
      <id>4528d176-df0a-42e9-8d27-e57e769061c1</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>1</defaultValue>
      <description></description>
      <id>1e1aead5-7f72-424f-85e8-9337b6e93ec7</id>
      <masked>false</masked>
      <name>page</name>
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







WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)




WS.verifyElementPropertyValue(response, 'per_page', 3)

WS.verifyElementPropertyValue(response, &quot;data[0].id&quot;, 1)

WS.verifyElementPropertyValue(response, 'data[0].first_name', 'George')

WS.verifyElementPropertyValue(response, 'data[0].last_name', 'Bluth')

WS.verifyElementPropertyValue(response, 'data[0].avatar', 'https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
