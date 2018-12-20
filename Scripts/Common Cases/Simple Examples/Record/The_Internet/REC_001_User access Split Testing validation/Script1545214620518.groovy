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

WebUI.navigateToUrl(GlobalVariable.G_TheInternetTestingSite)

WebUI.verifyElementPresent(findTestObject('Test Object/Product Name/The_Internet/Page_The Internet/a_AB Testing'), 10)

WebUI.click(findTestObject('Object Repository/Test Object/Product Name/The_Internet/Page_The Internet/a_AB Testing'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementPresent(findTestObject('Test Object/Product Name/The_Internet/Page_The Internet/lbl_NoABTest'), 10)

actual = WebUI.getText(findTestObject('Test Object/Product Name/The_Internet/Page_The Internet/lbl_NoABTest'))

WebUI.verifyMatch(actual, 'No A/B Test', false)

