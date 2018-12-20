import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

ResponseObject responseListUsers = WS.sendRequest(findTestObject('Web Service Object/Product Name/Chain_API/RESTful/reqres/GET_list_users', 
        [('URL') : GlobalVariable.G_reqres_URL, ('page') : page]))

'Verify Status Code'
WS.verifyResponseStatusCode(responseListUsers, 200)

'Verify response result of users API'
WS.verifyElementPropertyValue(responseListUsers, 'per_page', per_page)

WS.verifyElementPropertyValue(responseListUsers, ('data[' + pos) + '].id', user_id)

WS.verifyElementPropertyValue(responseListUsers, ('data[' + pos) + '].first_name', first_name)

WS.verifyElementPropertyValue(responseListUsers, ('data[' + pos) + '].last_name', last_name)

WS.verifyElementPropertyValue(responseListUsers, ('data[' + pos) + '].avatar', avatar)

responseUser = WS.sendRequest(findTestObject('Web Service Object/Product Name/Chain_API/RESTful/reqres/GET_single_user', 
        [('URL') : GlobalVariable.G_reqres_URL, ('user_id') : user_id]))

'Verify Status Code'
WS.verifyResponseStatusCode(responseUser, 200)

'Verify response result of single user API'

WS.verifyElementPropertyValue(responseUser, 'data.id', user_id)

WS.verifyElementPropertyValue(responseUser, 'data.first_name', first_name)

WS.verifyElementPropertyValue(responseUser, 'data.last_name', last_name)

WS.verifyElementPropertyValue(responseUser, 'data.avatar', avatar)

