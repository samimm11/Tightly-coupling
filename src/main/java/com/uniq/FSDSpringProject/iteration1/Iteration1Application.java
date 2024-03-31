
package com.uniq.FSDSpringProject.iteration1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Mario {
	void up() {
		System.out.println("up from mario");
	}

	void down() {
		System.out.println("down from mario");
	}

	void right() {
		System.out.println("right from mario");
	}

	void left() {
		System.out.println("left from mario");
	}
}

class Contra{
	void up() {
		System.out.println("up from contra");
	}

	void down() {
		System.out.println("down from contra");
	}

	void right() {
		System.out.println("right from contra");
	}

	void left() {
		System.out.println("left from  contra");
	}
}

class RunGame{
	void run(Mario obj) {
		obj.up();
		obj.down();
		obj.right();
		obj.left();
	}
	void run(Contra obj) {
		obj.up();
		obj.down();
		obj.right();
		obj.left();
	}
}

@SpringBootApplication
public class Iteration1Application {

	public static void main(String[] args) {
//		SpringApplication.run(Iteration1Application.class, args);
		Mario maria = new Mario();
		Contra contra = new Contra();
		RunGame runGame = new RunGame();
		runGame.run(maria);
	}

}
