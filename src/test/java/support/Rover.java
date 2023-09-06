package support;

public class Rover {
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;
    Integer x = 0;
    Integer y = 0;
    Integer facing = N;
    public Rover() {
    }
    public void setPosition(Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public String printPosition() {
        char dir = 'N';
        if (facing == 1) {
            dir = 'N';
        } else if (facing == 2) {
            dir = 'E';
        } else if (facing == 3) {
            dir = 'S';
        } else if (facing == 4) {
            dir = 'W';
        }else{
            throw new IllegalArgumentException("Please enter a valid position");
        }
        String position= String.valueOf(x)+String.valueOf(y)+dir;
        return position;
    }
    public void process(String commands){

        for (int idx = 0; idx < commands.length(); idx++) {
            process(commands.charAt(idx));
        }
    }

    public void process(Character command){
        if(command.equals('L')){
            turnLeft();
        }else if(command.equals('R')){
            turnRight();
        }else if(command.equals('M')){
            move();
        }else{
            throw new IllegalArgumentException("Speak in Mars language");
        }
    }
    public void move() {
        if (facing == N) {
            this.y++;
        } else if (facing == E) {
            this.x++ ;
        } else if (facing == S) {
            this.y--;
        } else if (facing == W) {
            this.x--;
        }else{
            throw new IllegalArgumentException("Please prived a valid direction");
        }
    }
    public void turnLeft() {
        facing = (facing - 1) < N ? W : facing - 1;
    }
    public void turnRight() {
        facing = (facing+1) > W ? N : facing+ 1;
    }
}
