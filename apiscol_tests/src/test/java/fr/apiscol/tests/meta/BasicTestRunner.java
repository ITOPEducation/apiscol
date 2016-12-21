package fr.apiscol.tests.meta;

import org.junit.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class BasicTestRunner {

	@Test
	public void testRunner() throws Exception {
		SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
		runner.setProjectFile("src/test/resources/soapui-scripts/apiscol-meta.xml");
		runner.run();
	}
}
