Feature: Verify the login of applications

Scenario: Verify user is able to login successfully
Given I am on the login page of gmail
And I enter username as "<Your Username>"
When I click on next button after entering correct username
And I enter password as "<Your Password>" and click on sign in button
And I click on mail icon in my account for gmail
Then I click on Inbox in mail after clicking login button
#And I click on first email in the inbox
#Then I should see email is opened after clicking on email
#And I click on sent items appearing on the left pane
#Then I should see sent emails appearing in the inbox section