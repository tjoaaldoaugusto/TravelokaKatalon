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

WebUI.navigateToUrl('https://www.traveloka.com/id-id')

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/h4_Rental Mobil'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_Tanpa Sopir'))

WebUI.setText(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Lokasi Rental Anda_css-11aywtz r-z2ww_9dcc70'), 
    'Jaka')

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_JakartaJakarta Special Capital Region, _b041b6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.setText(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'), 
    '09:00')

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_13'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_0'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.setText(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'), 
    '09:00')

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_13'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_Hari ini_css-1dbjc4n r-1f720gc r-184en5c'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_13'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_0'))

WebUI.setText(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'), 
    '09:00')

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_Hari ini_css-1dbjc4n r-1f720gc r-184en5c'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/input_Waktu Selesai_css-11aywtz r-z2wwpe r-_db6de6'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_Hari ini_css-1dbjc4n r-1pexk7n'))

WebUI.click(findTestObject('Object Repository/Page_Rental Mobil Harga Murah Rp200rb hari _1ac039/div_Cari Mobil'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Ganti Pencarian'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/svg'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Toyota All New AgyaRp 220.555hari42AUTOMATIC'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_LanjutkanLanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Please Select Below Options_css-1dbjc4n_741222'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Kantor Rental'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Kantor Rental_css-1dbjc4n r-1naam9t r-1_d0f904'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Please Select Below OptionsKantor RentalGratis'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Please Select Below Options_css-1dbjc4n_0314af'))

WebUI.click(findTestObject('Object Repository/Page_Rental dan Sewa Mobil Harga Murah Rp 2_40f279/div_Durasi Rental'))

WebUI.closeBrowser()

