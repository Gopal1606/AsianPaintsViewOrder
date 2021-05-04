Feature: View Orders


Scenario: Verify ordered items are displayed or not
 Given User is on Home Page
 When User Navigate to Profile icon
 And  Click on login
 And  Enter the phone number
 And  Click on submit
 And  Click on submit otp
 And  Click on profile icon 
 And  Click on my profile
 And  Click on my order tab
 But  User cant able to view ordered items
 And  Click on signout
 Then User should view home page
 