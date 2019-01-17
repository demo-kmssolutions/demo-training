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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/**
 * The test case is used to verify the Login feature of Katalon Analytics system.
 * Username and password are defaul values of variables in the test steps.
 *
 * Scenario: Login Test
 * Given The Github Login page is opening
 * When I login with valid username and password
 * Then I am at the Dashboard page
 *
 */
'Invoke Browser and Navigate to Katalon Analytics'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://analytics.katalon.com/index.html')

WebUI.maximizeWindow()

'Wait til the user element present'
WebUI.waitForElementPresent(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/input_Log In_username'), 
    10)

'Enter the value of username'
WebUI.setText(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/input_Log In_username'), 
    'demo.kmssolutions@gmail.com')

'Wait til the password element present'
WebUI.waitForElementPresent(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/input_Log In_password'), 
    10)

'Enter the value of password'
WebUI.setEncryptedText(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/input_Log In_password'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

'Wait til the login button clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/button_Log In'))

'Click on the login button'
WebUI.click(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/button_Log In'))

'Get real title of the page'
actual = WebUI.getWindowTitle()

'Verify actual and expected result'
WebUI.verifyMatch(actual, expected, false)

'Close browser'
WebUI.closeBrowser()