    Feature: i want create new user in utest.com

    Scenario: create new users
      Given user  was navigated for the web
      When  create new user
      Then  successful user creation