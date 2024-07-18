package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void jvmReport(String Jsonfile, String targetname) {

		File file = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\OMRBranchHotelAutomationProject\\target" + targetname);

		Configuration configuration = new Configuration(file, "OMR Branch Project");

		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser", "144");
		configuration.addClassifications("OS", "WIN11");
		configuration.addClassifications("Sprint", "34");

		List<String> jsonfile = new ArrayList<>();
		jsonfile.add(Jsonfile);

		ReportBuilder bulider = new ReportBuilder(jsonfile, configuration);

		bulider.generateReports();
	}
}
