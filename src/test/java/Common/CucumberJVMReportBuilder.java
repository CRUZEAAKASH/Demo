package Common;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CucumberJVMReportBuilder {

    @Test
    public static void generateReport() {
        String projectName = "Demo";
        String reportFolderName = "reports";
        File reportOutputDirectory = new File(reportFolderName);
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(System.getProperty("user.dir") + "\\" + reportFolderName + "\\cucumber.json");

        String buildNumber = "version 0000";
        String projName = projectName + " Automation Report Creation";

        Configuration configuration = new Configuration(reportOutputDirectory, projName);
        configuration.setBuildNumber(buildNumber);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
