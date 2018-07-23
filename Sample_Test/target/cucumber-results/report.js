$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sampleFeatureFile.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the login of applications",
  "description": "",
  "id": "verify-the-login-of-applications",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3067067503,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user is able to login successfully",
  "description": "",
  "id": "verify-the-login-of-applications;verify-user-is-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the login page of gmail",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username as \"daramanoj.92\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on next button after entering correct username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password as \"chintu0692\" and click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on mail icon in my account for gmail",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Inbox in mail after clicking login button",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectSteps.i_am_on_the_login_page_of_gmail()"
});
formatter.result({
  "duration": 3124182884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "daramanoj.92",
      "offset": 21
    }
  ],
  "location": "ProjectSteps.i_enter_username_as(String)"
});
formatter.result({
  "duration": 911765087,
  "status": "passed"
});
formatter.match({
  "location": "ProjectSteps.i_click_on_next_button_after_entering_correct_username()"
});
formatter.result({
  "duration": 350960037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chintu0692",
      "offset": 21
    }
  ],
  "location": "ProjectSteps.i_enter_password_as(String)"
});
formatter.result({
  "duration": 4474343840,
  "status": "passed"
});
formatter.match({
  "location": "ProjectSteps.i_click_on_mail_icon_in_my_account_for_gmail()"
});
formatter.result({
  "duration": 21451006088,
  "status": "passed"
});
formatter.match({
  "location": "ProjectSteps.i_click_on_inbox_in_mail_after_clicking_login_button()"
});
formatter.result({
  "duration": 8501349596,
  "status": "passed"
});
formatter.after({
  "duration": 2247193722,
  "status": "passed"
});
});