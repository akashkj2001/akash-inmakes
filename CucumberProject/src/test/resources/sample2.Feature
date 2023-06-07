Feature: To validate the login functionality of gmail application

Scenario: To validate logine with valide username and password
Given To launch the browser and maximize window
When To launch the url of the facebook application
And To pass valide user name in email field
And to cilc the request otp boutton
Then To close the entire browser

Scenario Outline: To validate the positive and negative combinattion of login founctionality
Given  User has to launch the browser and maximize the window
When User has to hit the facebook url
And User has to pass the data <emaildatas> in email field
And User has to pass the data <passwarddatas> in password field
Then Close the entier browser

Examples:
|emaildatas|passwarddatas|
|akashkj@gmail.com|shbbgy|
|12345@gmail.com|akashkja|
|akashkja000@gmail.com|inmakes|
|jenuaksh1441@gmail.com|imakesinfo|
