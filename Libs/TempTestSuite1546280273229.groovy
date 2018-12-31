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


suiteProperties.put('id', 'Test Suites/suite4')

suiteProperties.put('name', 'suite4')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\USER-PC\\Katalon Studio\\qlue-automation\\Reports\\suite4\\20190101_011753\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/suite4', suiteProperties, [new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - home', 'Test Cases/case 4 - home',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - about us', 'Test Cases/case 4 - about us',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - products (solutions)', 'Test Cases/case 4 - products (solutions)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - were hiring (career)', 'Test Cases/case 4 - were hiring (career)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - contact', 'Test Cases/case 4 - contact',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - privacy policy', 'Test Cases/case 4 - privacy policy',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - projects (blog)', 'Test Cases/case 4 - projects (blog)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null), new TestCaseBinding('Test Cases/case 1 - open web', 'Test Cases/case 1 - open web',  null), new TestCaseBinding('Test Cases/case 4 - partner (alliances)', 'Test Cases/case 4 - partner (alliances)',  null), new TestCaseBinding('Test Cases/case 1 - close web', 'Test Cases/case 1 - close web',  null)])
