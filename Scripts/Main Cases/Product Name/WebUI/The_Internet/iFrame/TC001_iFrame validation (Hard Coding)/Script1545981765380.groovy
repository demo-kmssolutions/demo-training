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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.G_TheInternetTestingSite)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Test Object/Product Name/The_Internet/Page_The Internet/a_Frames'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Test Object/Product Name/The_Internet/Page_The Internet/Iframe/a_iFrame'))

WebUI.waitForPageLoad(30)

WebUI.switchToFrame(findTestObject('Object Repository/Test Object/Product Name/The_Internet/Page_The Internet/Iframe/iframe_Formats_mce_0_ifr'),
	10)

actual = WebUI.getText(findTestObject('Test Object/Product Name/The_Internet/Page_The Internet/Iframe/p_Your content goes here.'))

WebUI.verifyEqual(actual, 'Your content goes here.')

WebUI.closeBrowser()