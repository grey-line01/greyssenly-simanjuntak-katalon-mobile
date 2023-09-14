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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Reusable Test Case/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Halaman Awal/btn_CREATE A PROFILE'), 0)

Mobile.setText(findTestObject('Create Profile/inpt_First Name'), 'lala', 0)

Mobile.setText(findTestObject('Create Profile/inpt_Last Name'), 'lili', 0)

Mobile.setText(findTestObject('Create Profile/inpt_Country'), 'canada', 0)

Mobile.setText(findTestObject('Create Profile/inpt_Username'), 'lala', 0)

Mobile.setText(findTestObject('Object Repository/Create Profile/inpt_Password'), 'lala123', 0)

Mobile.setText(findTestObject('Object Repository/Create Profile/inpt_Confirm Password'), 'lala123', 0)

Mobile.tap(findTestObject('Object Repository/Create Profile/btn_Create Profile'), 0)

Mobile.tap(findTestObject('Halaman Awal/btn_LOGIN'), 0)

