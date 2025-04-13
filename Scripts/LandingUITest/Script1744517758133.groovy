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

WebUI.navigateToUrl('https://stg-app.nexmedis.com/')

WebUI.verifyElementText(findTestObject('LandingPage_NEXMEDIS/div_Sistem informasi kesehatan terpadu untu_36b1f5'), 'Sistem informasi kesehatan terpadu untuk pelayanan medis')

WebUI.verifyElementText(findTestObject('LandingPage_NEXMEDIS/h1_Aplikasi rekam medis elektronik (RME) be_0881ed'), 'Aplikasi rekam medis elektronik (RME) bertenaga AI untuk menyederhanakan operasional fasilitas kesehatan, memajukan layanan klinis Anda')

WebUI.verifyElementText(findTestObject('LandingPage_NEXMEDIS/p_Healthcare Management Software'), 'Healthcare Management Software')

WebUI.verifyElementText(findTestObject('LandingPage_NEXMEDIS/label_ID OrganisasiPerusahaan'), 'ID Organisasi/Perusahaan')

WebUI.setText(findTestObject('LandingPage_NEXMEDIS/input_ID OrganisasiPerusahaan_id'), 'official_nexmedis')

WebUI.click(findTestObject('Object Repository/LandingPage_NEXMEDIS/button_Lanjut'))

