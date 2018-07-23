package stepDefination.Project;

import com.Project.Project;
import com.resources.DriverScript;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps extends DriverScript{
	
	Project project=new Project(driver);

	@Given("^I am on the login page of gmail$")
	public void i_am_on_the_login_page_of_gmail() throws Throwable {
	    project.iAmOnGmailLoginPage();
	}
	
	@And("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String username) throws Throwable {
	    project.iEnterUsername(username);
	}

	@When("^I click on next button after entering correct username$")
	public void i_click_on_next_button_after_entering_correct_username() throws Throwable {
	    project.iClickOnNextButtonAfterUsername();
	}

	@And("^I enter password as \"([^\"]*)\" and click on sign in button$")
	public void i_enter_password_as(String password) throws Throwable {
		project.iEnterPasswordAndClickOnSignIn(password);
	}

	@Then("^I click on Inbox in mail after clicking login button$")
	public void i_click_on_inbox_in_mail_after_clicking_login_button() throws Throwable {
		project.iClickOnInboxForGmail();
	}

	@And("^I click on first email in the inbox$")
	public void i_click_on_first_email_in_the_inbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see email is opened after clicking on email$")
	public void i_should_see_email_is_opened_after_clicking_on_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^I click on sent items appearing on the left pane$")
	public void i_click_on_sent_items_appearing_on_the_left_pane() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see sent emails appearing in the inbox section$")
	public void i_should_see_sent_emails_appearing_in_the_inbox_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@And("^I click on mail icon in my account for gmail$")
	public void i_click_on_mail_icon_in_my_account_for_gmail() throws Throwable{
		project.iClickOnMailIconForGmail();
	}

}
