package fall2020Project;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.*;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		      features ="usecases",
              plugin= {"html:target/cucumber/wikipedia.html"},
			  monochrome=true,
			  snippets= SnippetType.CAMELCASE,
			  glue= {"fall2020Project"},
			  strict =true
		)


public class Acceptance{
	
	
	
	
}