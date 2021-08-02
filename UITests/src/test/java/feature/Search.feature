Feature: Search an item in ebay website

  Scenario Outline: Enter a search item in ebay website
    Given I have navigated to ebay website
    When I enter a <SearchItem>
    Then the search results are displayed

    Examples: 
      | SearchItem |
      | phone      |
      | laptop     |
