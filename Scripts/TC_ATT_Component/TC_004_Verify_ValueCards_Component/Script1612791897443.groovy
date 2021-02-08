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

WebUI.verifyElementText(findTestObject('Cards/div_LEARN HOW'), 'LEARN HOW', FailureHandling.STOP_ON_FAILURE)

attribute = WebUI.getAttribute(findTestObject('Cards/div_LEARN HOW'), 'class', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Cards/div_LEARN HOW'), 'class', 'color-ui-white type-eyebrow-small font-medium rel  ', 
    30, FailureHandling.STOP_ON_FAILURE)

if (attribute.contains('color-ui-white')) {
    println('Found color')
}

WebUI.verifyElementHasAttribute(findTestObject('Cards/div_LEARN HOW'), 'class', 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media3'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media4'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media5'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media6'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media7'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media7'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media8'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media9'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media9'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media10'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media10'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media11'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media11'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media12'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media12'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media13'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media13'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media14'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media14'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media15'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media15'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage_Image/div_media16'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Homepage_Image/div_media16'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

