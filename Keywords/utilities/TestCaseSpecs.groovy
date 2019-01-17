package utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class TestCaseSpecs {
	public enum TestCaseType {
		WEB_UI("implementedBy:WebUI"),
		API("implementedBy:API"),
		MOBILE("implementedBy:Mobile"),
		FLAKY("FlakyTest");

		String description;

		TestCaseType(des) {
			this.description = des;
		}
	}

	public static boolean isWebUI(TestCase testCase) {
		return TestCaseType.WEB_UI.description.equals(testCase.getTag())
	}

	public static boolean isAPI(TestCase testCase) {
		return TestCaseType.API.description.equals(testCase.getTag())
	}

	public static boolean isMobile(TestCase testCase) {
		return TestCaseType.MOBILE.description.equals(testCase.getTag())
	}

	public static boolean isFlakyTest(TestCase testCase) {
		return TestCaseType.FLAKY.description.equals(testCase.getTag())
	}
}
