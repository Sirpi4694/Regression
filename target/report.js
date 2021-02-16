$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature File/FB.feature");
formatter.feature({
  "name": "To validate the login page in FB",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has to launch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To verify login functionality with valid username and invalid password in FB",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to enter the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "arul",
        "12345"
      ]
    },
    {
      "cells": [
        "sirpi",
        "12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user unable to enter the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_unable_to_enter_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has to launch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the forget password link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to click the forget password link",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user has to enter the mobile number",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click the search button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user has to navigate OTP page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});