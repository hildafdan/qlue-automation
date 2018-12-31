import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/suite2')

suiteProperties.put('name', 'suite2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\USER-PC\\Katalon Studio\\qlue-automation\\Reports\\suite2\\20190101_010026\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/suite2', suiteProperties, [new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 2 - home', 'Test Cases/case 2 - home',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 2 - about us', 'Test Cases/case 2 - about us',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 2 - projects (blog)', 'Test Cases/case 2 - projects (blog)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 2 - city partners (partner)', 'Test Cases/case 2 - city partners (partner)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 2 - alliances (partner)', 'Test Cases/case 2 - alliances (partner)',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 2 - were hiring (career)', 'Test Cases/case 2 - were hiring (career)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null)])
