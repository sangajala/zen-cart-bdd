@home
Feature: Home page functionality

#  As a consumer
#  I want to view the homepage to understand about the application
#  so that I an shop easily
#///accptance sceriaons

  Scenario: Consumer can view the category and navigate

    Given consumer is in homepage
    Then a category exists in the left panel
    And the number of item available should be shown
    When consumer opens the category with name 'Sample Cat'
    Then the list of products with name as 'test' under the category should be shown
    And the number of items should match the available items


#  Scenario: Consumer can view the preview of the product top with best sellers and navigates into the product by image
#
#    Given consumer is in homepage
#    Then the home page should have top 10 products sorted with best sellers in preview
#    When consumer navigates to the product by selecting the image
#    Then the product page should be shown
#
#
#  Scenario: Consumer can view the preview of the product top with best sellers
#
#    Given consumer is in homepage
#    Then the home page should have top 10 products sorted with best sellers in preview and navigates into the product by link
#    When consumer navigates to the product by selecting the link
#    Then the product page should be shown
#
#
##    Functional scnarios
#
#  Scenario:  No categories available
#    Given consumer is in homepage
#    When no categories available
#    Then a message to the user should be shown saying no categories available
#
#
#  Scenario: catageory with no items
#    Given consumer is in homepage
#    When category exists with no items available
#    Then the category should show with zero items
#    And the category should not be a link
#
#  showing the price with correct currency
#  Scenario: price of the item with correct currency
#    Given user is in homepage
#    When the price of item with currency
#    Then the item should have price@Then("^the list of products with name as 'test' under the category should be shown$")

#    Given user is in homepage
#    When user see the category list
#    Then user should see the maximum categories of 10 in the list
#
#
#  Maximum size of the name of the category
#  Scenario: size of name of category
#    Given user is in homepage
#    When user see name of category
#    Then user should see the name of category as maximum size
#
#
#  Only 10 top sellers should be show
#  Scenario: top sellers in the list
#    Given user is in homepage
#    When user selects the category
#    Then user should see the 10 top sellers in the list
#
#
#  Scrollable
#  Scenario: categories can be scrollable
#    Given user is in homepage
#    When user see the category list
#    Then user should see the category list to be scrollable