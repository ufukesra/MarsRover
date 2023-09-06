package pageObjects;

import org.junit.Assert;
import support.Rover;

public class Positioning {

    Rover rover = new Rover();
    String target;
    String facing;

    public void RoverTurnsLeft(String currentLocation){
        Assert.assertEquals(currentLocation,rover.printPosition().charAt(rover.printPosition().length()-1)+"");
        rover.turnLeft();
    }
    public void VerifyFacingIs(String facing){
        Assert.assertEquals(rover.printPosition().substring(rover.printPosition().length()-1),facing);
        //System.out.println( "The position of rover is : "+ rover.printPosition().toString());
    }

    public void RoverTurnsRight(String currentLocation){
        Assert.assertEquals(currentLocation,rover.printPosition().charAt(rover.printPosition().length()-1)+"");
        rover.turnRight();
    }

    public void roverMoves(String currentPosition){
        Assert.assertEquals(currentPosition,rover.printPosition().substring(0,2));
        rover.move();
    }

    public void verifyRoversPosition(String position){
        Assert.assertEquals(rover.printPosition(),position);
    }

    public void roverMovesToGivenLocation(String startPosition, String targetPosition){
        target=targetPosition;
        Assert.assertEquals(startPosition,rover.printPosition());
        int x=Integer.parseInt(targetPosition.charAt(0)+"");
        int y=Integer.parseInt(targetPosition.charAt(1)+"");
         facing=targetPosition.substring(targetPosition.length()-1);



        rover.setPosition(x,y,facingConvertion());
    }

    public Integer facingConvertion(){
        int dir=0;
        if (facing.equals("N")){
            dir=1;
        }else if(facing.equals("E")){
            dir=2;
        }else if(facing.equals("S")){
            dir=3;
        }else if(facing.equals("W")){
            dir=4;
        }else{
            throw new IllegalArgumentException("Entered unexpected location");

        }
        return dir;
    }


    public void VerifyTargetLocation(){
        Assert.assertEquals(target,rover.printPosition());
    }

    public void processByTheCommand(String startPosition, String command){
        Assert.assertEquals(startPosition,rover.printPosition());
        rover.process(command);
    }

    public void verifyCommandPositionAndLocation(String targetPosition){
        Assert.assertEquals(targetPosition,rover.printPosition());
        //System.out.println("Position: "+ rover.printPosition());
    }
}
