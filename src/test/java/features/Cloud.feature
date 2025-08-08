Feature: Validate Cloud Page
  @Cloud
  Scenario Outline: Validate User is able to login to EZYThemes Application
    Given User is on EZYThemes Application
    When User enters <UserName> and <Password>
    Then User should be able to login to EZYThemes Application
    Then User should be able enter the <ProjectName> and should able to search the project and Click on Review Link

    Examples:
      | UserName                    | Password     | | ProjectName |
      | vijay.benal@graphenesvc.com | Graphene@123 | | QC_Flowtest_06-Mar-25_v1|




