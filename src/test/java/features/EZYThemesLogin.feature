Feature: Login to EZYThemes Application
@Login
Scenario Outline: Validate User is able to login to EZYThemes Application
    Given User is on EZYThemes Application
    When User enters <UserName> and <Password>
    Then User should be able to login to EZYThemes Application

    Examples:
        | UserName                    | Password     |
        | vijay.benal@graphenesvc.com | Graphene@123 |