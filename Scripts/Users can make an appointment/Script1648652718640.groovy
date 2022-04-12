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

WebUI.callTestCase(findTestCase('User Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MakeAppointment/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'))

WebUI.click(findTestObject('MakeAppointment/Frame_1648653534126', [('Name') : 'Seoul CURA Healthcare Center']))

WebUI.click(findTestObject('MakeAppointment/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('MakeAppointment/input_Medicaid_programs', [('Button') : 'radio_program_medicaid']))

WebUI.click(findTestObject('MakeAppointment/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('MakeAppointment/td_1'))

WebUI.sendKeys(findTestObject('MakeAppointment/textarea_Comment_comment'), 'My comment')

WebUI.click(findTestObject('MakeAppointment/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Verify/p_Seoul CURA Healthcare Center'), 'Seoul CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Verify/p_Medicaid'), 'Medicaid')

WebUI.verifyElementText(findTestObject('Verify/p_01042022'), '01/04/2022')

WebUI.verifyElementText(findTestObject('Verify/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Verify/p_My comment'), 'My comment')

