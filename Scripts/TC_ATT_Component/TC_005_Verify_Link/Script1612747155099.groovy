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

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media7'), 5)

headbandURL = WebUI.getAttribute(findTestObject('Link/a_Shop all phone deals'), 'href', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(headbandURL, 'https://www.att.com/deals/cell-phone-deals/', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Link/a_Find a store'), 5, FailureHandling.STOP_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Link/a_Find a store'), 'href', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(headbandURL, 'https://www.att.com/stores/', FailureHandling.STOP_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Link/a_Learn more1'), 'href', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(headbandURL, 'https://www.att.com/wireless/right-to-you/', FailureHandling.STOP_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Link/a_Learn more2'), 'href', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(headbandURL, 'https://www.att.com/wireless/delivery-and-shipping-options/', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Link/a_Learn more3'), 5, FailureHandling.STOP_ON_FAILURE)

headbandURL = WebUI.getAttribute(findTestObject('Link/a_Learn more3'), 'href', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(headbandURL, 'https://www.att.com/wireless/offers/discount-program/appreciation/', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

