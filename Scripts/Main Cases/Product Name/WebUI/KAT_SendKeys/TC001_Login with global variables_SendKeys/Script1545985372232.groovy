import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.swing.JOptionPane

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
 * The test case is used to verify the Login feature of Github system.
 * Username and password are defaul values of variables in the test steps.
 *
 * Scenario: Login Test
 * Given The Github Login page is opening
 * When I login with valid username and password
 * Then I am at the Dashboard page
 *
 */
WebUI.openBrowser('')

WebUI.navigateToUrl("${GlobalVariable.G_git_URL_default}")

WebUI.waitForElementVisible(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/h1_Sign_in_to_GitHub'), 60)

WebUI.verifyTextPresent('Sign in to GitHub', false)

WebUI.setText(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/input_Username'), username)

WebUI.setText(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/input_password'), password)

WebUI.click(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/input_Sign_in'))

String title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'GitHub', false)

WebUI.closeBrowser()

