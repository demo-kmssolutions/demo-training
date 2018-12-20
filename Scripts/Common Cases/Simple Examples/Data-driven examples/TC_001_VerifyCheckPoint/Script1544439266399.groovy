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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://analytics.katalon.com/index.html')

WebUI.setText(findTestObject('Page_Katalon Analytics (Beta)/input_Log In_username'), 'demo.kmssolutions@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/input_Log In_password'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/button_Log In'))

WebUI.click(findTestObject('Object Repository/Test Object/Product Name/AnalyticsKatalon/Page_Katalon Analytics (Beta)/button_Log In'))

actual = WebUI.verifyElementPresent(findTestObject('Page_Dashboard - Katalon Analytics/span_Dashboard'), 10)

