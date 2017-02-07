package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class FXExample extends Application {
	
	//이 경우 에러가 나는데 추상메소드를 만들거나 내 자신을 추상메소드로 만들어야 함.

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		
	}

}
