import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.navigateToUrl(GlobalVariable.G_TheInternetTestingSite)

'Wait till the page load'
WebUI.waitForPageLoad(15)

'Click on Dropdown button'
WebUI.click(findTestObject('Object Repository/Test Object/Product Name/The_Internet/Page_The Internet/a_dropdown'))

'Wait till the page load'
WebUI.waitForPageLoad(GlobalVariable.G_Timeout_Small)

'Verifying the dropdown with expected and actual values\\r\\n'
CustomKeywords.'projects.demoUAT.VerifyExpectedAndActualOptionsInDropdown.VerifyExpectedAndActual'(findTestObject('Test Object/Product Name/The_Internet/Page_The Internet/DropDown/select_Please select an option'), 
    ['Please select an option', 'Option 1', 'Option 2'])

'Verify the first option can not clickable'
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Test Object/Product Name/The_Internet/Page_The Internet/DropDown/option_Please select an option'), 
    FailureHandling.STOP_ON_FAILURE)

'Verify whether the values in the dropdown are in Alphabetical Order using Custom Keyword'
CustomKeywords.'projects.demoUAT.VerifyDrodownValues_AlphabeticalOrder.verifyOptionsInDropdownInAphabeticalOrder'(findTestObject(
        'Test Object/Product Name/The_Internet/Page_The Internet/DropDown/select_Please select an option'), 'Please select an option')

