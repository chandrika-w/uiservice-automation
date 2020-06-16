$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/login.feature");
formatter.feature({
  "name": "Verify login feature of WebUi",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify valid login with valid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in WebUi login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_is_in_WebUi_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid username \"demo\" and valid password \"demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_enters_a_valid_username_and_valid_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user must go to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_must_go_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify invalid login with different combination of usernames and passwords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in WebUi login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid \"\u003cUsername\u003e\" username and \"\u003cPassword\u003e\" password",
  "keyword": "When "
});
formatter.step({
  "name": "the user click fail login",
  "keyword": "And "
});
formatter.step({
  "name": "the user must see the expected error page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "demo1",
        "demo"
      ]
    },
    {
      "cells": [
        "demo2",
        "demo"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify invalid login with different combination of usernames and passwords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in WebUi login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_is_in_WebUi_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid \"demo1\" username and \"demo\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_enters_an_invalid_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click fail login",
  "keyword": "And "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_click_fail_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user must see the expected error page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_must_see_the_expected_error_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify invalid login with different combination of usernames and passwords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in WebUi login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_is_in_WebUi_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid \"demo2\" username and \"demo\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_enters_an_invalid_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click fail login",
  "keyword": "And "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_click_fail_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user must see the expected error page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ckw.ui.auto.steps.LoginSteps.the_user_must_see_the_expected_error_page()"
});
formatter.result({
  "status": "passed"
});
});