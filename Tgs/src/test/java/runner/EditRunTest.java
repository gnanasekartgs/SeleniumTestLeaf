package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/Feature/Editlead.feature", glue= {"Steps"}, monochrome=true/*, dryRun=true, snippets = SnippetType.CAMELCASE*/)
public class EditRunTest extends AbstractTestNGCucumberTests{

}
