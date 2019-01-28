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
	drawHouse(hi, 107);
	grenGrass(hi);
	drawBuilding(hi,300);
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, 120);
	grenGrass(hi);
	drawBuilding(hi,246);
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, 68);
	grenGrass(hi);
	drawBuilding(hi,260);
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, 21);
	grenGrass(hi);
	drawBuilding(hi,235);
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, 95);
	grenGrass(hi);
	drawBuilding(hi,266);
	hi.turn(270);
	grenGrass(hi);
	hi.turn(270);
	//-----------
	drawHouse(hi, 73);
	grenGrass(hi);
	drawBuilding(hi,287);
	hi.turn(270);
}
public static void drawHouse(Robot hi, int height) {
	
	hi.move(height);
	hi.turn(30);
	hi.move(40);
hi.turn(120);
hi.move(40);
hi.turn(30);
hi.move(height);
}
public static void drawBuilding(Robot hi, int height) {
	hi.setRandomPenColor();
	hi.turn(270);
	hi.move(height);
	hi.turn(90);
	hi.move(50);
	hi.turn(90);
	hi.move(height);
	hi.turn(90);
}
public static void grenGrass(Robot hi) {
	hi.turn(270);
	hi.setPenColor(85,170,85);
	hi.move(20);
}
}

