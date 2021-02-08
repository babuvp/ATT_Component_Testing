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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.att.com/')

WebUI.maximizeWindow()

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_Deals'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/deals/', FailureHandling.CONTINUE_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_Phones  devices'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/buy/phones/', FailureHandling.CONTINUE_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_Wireless'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/wireless/', FailureHandling.CONTINUE_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_Internet'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/internet/fiber/', FailureHandling.STOP_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_TV'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/tv/', FailureHandling.CONTINUE_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_Prepaid'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/prepaid/', FailureHandling.CONTINUE_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Headband/a_Bundles'), 'href')

WebUI.verifyEqual(headbandURL, 'https://www.att.com/bundles/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

