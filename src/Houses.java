import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	Robot hi =  new Robot();
	hi.setX(50);
	hi.setY(550);
	hi.setSpeed(200);
	hi.miniaturize();
	hi.sparkle();
	hi.penDown();
	hi.setRandomPenColor();
	
	//-----------
	drawHouse(hi, "small");
	grenGrass(hi);
	drawBuilding(hi,"medium");
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, "medium");
	grenGrass(hi);
	drawBuilding(hi,"large");
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, "medium");
	grenGrass(hi);
	drawBuilding(hi,"large");
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, "small");
	grenGrass(hi);
	drawBuilding(hi,"large");
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, "medium");
	grenGrass(hi);
	drawBuilding(hi,"medium");
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, "small");
	grenGrass(hi);
	drawBuilding(hi,"medium");
	hi.turn(270);
}
public static void drawHouse(Robot hi, String height) {
	int size = 214000000;
	if(height.equals("small")) {
	size = 60;
	}
	else if(height.equals("medium")) {
		size = 120;
	}
	else if(height.equals("large")) {
		size = 240;
	}
	
	hi.move(size);
	hi.turn(30);
	hi.move(40);
hi.turn(120);
hi.move(40);
hi.turn(30);
hi.move(size);
}
public static void drawBuilding(Robot hi, String height) {
	int size = 214000000;
	if(height.equals("small")) {
	size = 60;
	}
	else if(height.equals("medium")) {
		size = 120;
	}
	else if(height.equals("large")) {
		size = 240;
	}
	hi.setRandomPenColor();
	hi.turn(270);
	hi.move(size);
	hi.turn(90);
	hi.move(50);
	hi.turn(90);
	hi.move(size);
	hi.turn(90);
}
public static void grenGrass(Robot hi) {
	hi.turn(270);
	hi.setPenColor(85,170,85);
	hi.move(20);
}
}

