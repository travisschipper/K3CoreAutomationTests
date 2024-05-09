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

WebUI.openBrowser('https://platform.devkingsiii.com/SmartScheduler/Scheduler')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_Input_UsernameVal'), 'Moxie3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_Input_PasswordVal'), 'n+HS8Dw6Pqw9opsRY7b/Hg==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Password_Checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_K3 Core Home/div_Work Order Management'), 5)

WebUI.closeBrowser()

