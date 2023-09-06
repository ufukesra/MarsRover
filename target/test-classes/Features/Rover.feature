Feature: Rover's Movement

  Scenario: Rover should be able to turn left
    Given rover turns left from the current location "N"
    Then Verify facing is "W"

  Scenario: Rover should be able to turn right
    Given rover turns right from the current location "N"
    Then Verify facing is "E"

  Scenario: Rover should be able to move forward
   Given rover moves one grid forward from current position "00"
    Then Verify new position is "01N"

  Scenario: Rover should be able to reach target position and location
    Given rover moves from "00N" to given location "12N"
    Then Verify the target position and location

  Scenario Outline: Rover should be able to process bey the given <command>
    Given rover moves from "00N" to given "<command>"
    Then verify new position and location "<position>"
    Examples:
    |command   |position|
    |LMLMLMLMM |01N     |
    |MMRMMRMRRM|22N     |

