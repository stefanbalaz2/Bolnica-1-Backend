package raf.bolnica1.patient.cucumber.medicalrecordservice;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/medicalrecordservice")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "raf.bolnica1.patient.cucumber.medicalrecordservice")
public class MedicalRecordServiceTests {
}