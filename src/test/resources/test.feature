Feature: Verify links
    As a tester
    I want to finish test

    Scenario: Verify Latest News
        Given I am on homepage
        Then I should see "Latest News" section

    Scenario Outline: verify Links
        When I navigate to "<option>"
        Then I should see respective "<pagename>"
        Examples:
            | option   | pagename |
            | About    | About    |
            | Services | Services |
            | Work     | Work     |

    Scenario: count countries
        When I navigate to contactUs
        Then I should see offices count
