package stepDefinitions;

import support.PageInitializer;
import io.cucumber.java.en.*;
import pageObjects.Positioning;

public class RoverStepDefinition {

    Positioning positioning = PageInitializer.positioning;

    @Given("rover turns left from the current location {string}")
    public void rover_turns_left_from_the_current_location(String currentLocation) {
        positioning.RoverTurnsLeft(currentLocation);
    }

    @Then("Verify facing is {string}")
    public void verify_facing_is(String facing) {
        positioning.VerifyFacingIs(facing);
    }

    @Given("rover turns right from the current location {string}")
    public void rover_turns_right_from_the_current_location(String currentLocation) {
       positioning.RoverTurnsRight(currentLocation);
    }

    @Given("rover moves one grid forward from current position {string}")
    public void rover_moves_one_grid_forward_from_current_position(String currentPosition) {
        positioning.roverMoves(currentPosition);
    }

    @Then("Verify new position is {string}")
    public void verify_new_position_is(String position) {
        positioning.verifyRoversPosition(position);
    }

    @Given("rover moves from {string} to given location {string}")
    public void rover_moves_from_to_given_location(String startPosition, String targetPosition) {
        positioning.roverMovesToGivenLocation(startPosition, targetPosition);

    }

    @Then("Verify the target position and location")
    public void verify_the_target_position_and_location() {

        positioning.VerifyTargetLocation();
    }



//    @Given("rover moves from {string} position and location by given {string} command")
//    public void rover_moves_from_position_and_location_by_given_command(String startPosition, String command) {
//       positioning.processByTheCommand(startPosition,command);
//    }
//    @Then("verify new position and location is {string}")
//    public void verify_new_position_and_location_is(String targetLocation) {
//        positioning.verifyCommandPositionAndLocation(targetLocation);
//    }

    @Given("rover moves from {string} to given {string}")
    public void rover_moves_from_to_given(String startPosition, String command) {
        positioning.processByTheCommand(startPosition,command);
    }
    @Then("verify new position and location {string}")
    public void verify_new_position_and_location(String targetLocation) {
        positioning.verifyCommandPositionAndLocation(targetLocation);
    }


}