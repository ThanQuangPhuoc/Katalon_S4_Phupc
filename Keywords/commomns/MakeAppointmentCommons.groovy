package commomns
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MakeAppointmentCommons {
	@Keyword
	public void inputAppointmentinfo(String facility, String applyHostpitalReadmission, String visitDate, String comment) {
		WebUI.selectOptionByLabel(findTestObject('MakeAppointment/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), facility, false)

		if (Boolean.parseBoolean(applyHostpitalReadmission)) {
			WebUI.check(findTestObject('MakeAppointment/input_Apply for hospital readmission_hospital_readmission'))
		}

		WebUI.sendKeys(findTestObject('MakeAppointment/input_Visit Date (Required)_visit_date'), visitDate)

		WebUI.sendKeys(findTestObject('MakeAppointment/textarea_Comment_comment'), comment)

		WebUI.click(findTestObject('MakeAppointment/button_Book Appointment'))
	}

	@Keyword
	public void verifyAppointment(String facility, String applyHostpitalReadmission, String visitDate, String comment) {
		WebUI.verifyElementText(findTestObject('Verify/p_Seoul CURA Healthcare Center'), facility)

		if (Boolean.parseBoolean(applyHostpitalReadmission)) {
			WebUI.verifyElementText(findTestObject('Verify/p_Yes'), 'Yes')
		} else {
			WebUI.verifyElementText(findTestObject('Verify/p_Yes'), 'No')
		}

		WebUI.verifyElementText(findTestObject('Verify/p_01042022'), visitDate)

		WebUI.verifyElementText(findTestObject('Verify/p_My comment'), comment)
	}
}