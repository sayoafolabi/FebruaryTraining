package cucumber;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter"},
				features = {"src/cucumber"},
				glue = {"cucumber.steps"},
				tags = {"@Audi"}
		)
public class ReportRunnerAudi {
	
		@BeforeClass
		public static void setup() {
    	
    	String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
		String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
		
		String fileName = String.format("C:/FebruaryTraining/Autotrader/report/%s/report_%s.html", dateNow, timeNow);
		//String fileName = String.format("C:/FebruaryTraining/Autotrader/report/%s/report.html", dateNow);
		
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
        ExtentCucumberFormatter.
        	initiateExtentCucumberFormatter(new File(fileName));
 
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/cucumber/resource/extent-config.xml"));
 
        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v2.27");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.0.1");
        ExtentCucumberFormatter.addSystemInfo("Company Name", "Autotrader");
 
        
    }

}
