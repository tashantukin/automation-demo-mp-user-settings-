import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/Buyer Login (Linked)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Buyer with Company Linked/span_Juan'), 0)

WebUI.verifyElementText(findTestObject('Buyer with Company Linked/span_Juan'), 'Juan')

WebUI.verifyElementPresent(findTestObject('Buyer with Company Linked/span_gca_company2'), 0)

WebUI.verifyElementNotPresent(findTestObject('New Onboard- Homepage/i_Change Password_icon icon-clock-blue'), 0)

WebUI.verifyElementPresent(findTestObject('Buyer with Company Linked/a_My Company Page'), 0)

WebUI.verifyElementPresent(findTestObject('Buyer with Company Linked/a_Update My Company Page'), 0)

