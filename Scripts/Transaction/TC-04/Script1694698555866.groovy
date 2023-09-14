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

WebUI.callTestCase(findTestCase('Add Account/TC-03'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transaction/btn_viewAccount'), 0)

def selectedOption = 'Deposits'

Mobile.tap(findTestObject('Object Repository/Transaction/btn_dropdownType'), 0)

WebUI.delay(2)

// Cek pilihan yang dipilih
if (selectedOption == 'All') {
    Mobile.tap(findTestObject('Object Repository/Transaction/select_All'), 0)
} else if (selectedOption == 'Payments') {
    Mobile.tap(findTestObject('Object Repository/Transaction/select_Payment'), 0)
} else if (selectedOption == 'Transfers') {
    Mobile.tap(findTestObject('Object Repository/Transaction/select_Transfers'), 0)
} else if (selectedOption == 'Deposits') {
    Mobile.tap(findTestObject('Object Repository/Transaction/select_Deposits'), 0)
} else {
    println('Pilihan tidak valid: ' + selectedOption)
}

WebUI.delay(2)

