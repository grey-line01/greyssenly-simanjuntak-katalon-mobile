@CreateProfile

Feature: Create Profile

As an unregistered user

I want to be able to create a profile 

so that I can login to access Bank Demo App

@Valid 

Scenario: Create Profile with Valid Input

Given I am on the create profile page

When I enter my valid first name “lala”, last name “lili”, country “canada”, username “lala”, password “lala123”, and confirm password “lala123”

And I click the "Create Profile" button

Then I should be redirected to login page

#Examples:
| First Name | Last Name | Country | Username | Password | Confirm Password |
| lala             | lili               | canada  | lala            | lala123     | lala123                  |