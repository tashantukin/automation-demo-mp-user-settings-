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

int randomInt = new Random().nextInt(9999 - 10 + 1) + 10

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.user_url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('User Login/a_REGISTER  SIGN IN'))

WebUI.click(findTestObject('User Login/a_Accept Cookies'))

WebUI.click(findTestObject('User Onboarding/a_Sign up here'))

WebUI.setText(findTestObject('User Onboarding/input_Your emailusername_username'), 'user '+ randomInt)

WebUI.setText(findTestObject('User Onboarding/input_Your password_password'), GlobalVariable.buyer_password)

WebUI.setText(findTestObject('User Onboarding/input_Reconfirm password_reconfirm-password'), GlobalVariable.buyer_password)

WebUI.setText(findTestObject('User Onboarding/input_Notification email_notificationemail'), randomInt + '@gmail.com')

WebUI.click(findTestObject('User Onboarding/input_Sign up here_account-submit'))

