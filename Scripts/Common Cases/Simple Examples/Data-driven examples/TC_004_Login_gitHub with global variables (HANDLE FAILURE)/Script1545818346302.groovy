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
 * Username and password are GLOBAL values of PROFILE in the test steps.
 *
 * Scenario: Login Test
 * Given The Github Login page is opening
 * When I login with valid username
 *      I login with invalid password element
 *      I login with valid password
 * Then I am at the Dashboard page
 *
 */
WebUI.openBrowser(GlobalVariable.G_git_URL_default)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/h1_Sign_in_to_GitHub'), 60)

WebUI.verifyTextPresent('Sign in to GitHub', false)

WebUI.setText(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/input_Username'), GlobalVariable.G_git_username_default)

WebUI.setText(findTestObject('Wrong Element'), 'Wrong Password', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/input_password'), GlobalVariable.G_git_password_default)

WebUI.click(findTestObject('Test Object/Product Name/gitHub/Pages/Login Page/Page_Sign in to GitHub  GitHub/input_Sign_in'))

actualDashboardTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(actualDashboardTitle, expectedDashboardTitle, false)

WebUI.closeBrowser()
