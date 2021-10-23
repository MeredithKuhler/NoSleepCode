import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		//JFrame patientPortal = new JFrame("Patient Portal");
		//JFrame messagingPortal = new JFrame("Messaging Portal");
		//JFrame sendMessage = new JFrame("Send a Message");
		//JFrame visitSummary = new JFrame("Visit Summary");
		//JFrame accountInfo = new JFrame("Account Information");
		//JFrame insuranceInfo = new JFrame("Insurance Page");
		//JFrame pharmacyInfo = new JFrame("Pharmacy Information");
		
		Color BACKGROUND = Color.rgb(255, 153, 0); // not currently working
		int PADDING_VALUE = 10;
		Insets PADDING = new Insets(PADDING_VALUE);
		
		String CSS_BOX_STYLE = // this will be edited
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 2;\n" +
                "-fx-border-style: solid;\n" +
                "-fx-padding: 5px";
		
		
		//----- Back Button -----//
		Button backButton = new Button("Back");
		backButton.setStyle("-fx-background-color: #ff0000; ");
		
		
		//----- Submit Button -----//
		Button submitButton = new Button("Submit");
		
		
		HBox buttonBox = new HBox(PADDING_VALUE);
		buttonBox.getChildren().addAll(submitButton, backButton);
		
		/*
		Label labelName = new Label("");
		TextField textName = new TextField();
		 */

		
        //======================== Patient Portal ========================//
		
		
		
		//======================== Messaging Portal ========================//
		
		
		
        //======================== Send Message ========================//
		
		
		
        //======================== Visit Summary ========================//
		
		
		
		//======================== Account Information ========================//
		
		//----- General Section -----//
		//profile picture
		
		Label AI_patientNameLabel = new Label("Patient Name:");
		TextField AI_name = new TextField();
		
		
		//----- Birthday Section -----//
		Label AI_birthdayLabel = new Label("Birthday");
		
		Label AI_bMonthLabel = new Label("Month");
		TextField AI_bMonth = new TextField();
		
		Label AI_bDayLabel = new Label("Day");
		TextField AI_bDay = new TextField();
		
		Label AI_bYearLabel = new Label("Year");
		TextField AI_bYear = new TextField();
		
		
		//----- Contact Section -----//
		Label AI_contactInfoLabel = new Label("Contact Information");
		
		Label AI_cAddress1Label = new Label("Address Line 1");
		TextField AI_cAddress1 = new TextField();
		
		Label AI_cAddress2Label = new Label("Address Line 2");
		TextField AI_cAddress2 = new TextField();
		
		Label AI_cCityLabel = new Label("City");
		TextField AI_cCity = new TextField();
		
		Label AI_cStateLabel = new Label("State");
		TextField AI_cState = new TextField();
		
		Label AI_cZipLabel = new Label("Zip Code");
		TextField AI_cZip = new TextField();
		
		Label AI_cPhoneLabel = new Label("Phone Number");
		TextField AI_cPhone = new TextField();
		
		Label AI_cEmailLabel = new Label("Email");
		TextField AI_cEmail = new TextField();
		
		
		//===== Adding Elements to Frame =====//
		
		
		HBox AI_nameBox = new HBox(PADDING_VALUE); // patient name label and field
		AI_nameBox.getChildren().addAll(AI_patientNameLabel, AI_name);
		
		
		//----- Birthday Boxes -----//
		HBox AI_bMonthBox = new HBox(PADDING_VALUE); // patient birth month label and field    
        AI_bMonthBox.getChildren().addAll(AI_bMonthLabel, AI_bMonth);
        
        HBox AI_bDayBox = new HBox(PADDING_VALUE); // patient birth day label and field 
        AI_bDayBox.getChildren().addAll(AI_bDayLabel, AI_bDay);
        
        HBox AI_bYearBox = new HBox(PADDING_VALUE); // patient birth year label and field 
        AI_bYearBox.getChildren().addAll(AI_bYearLabel, AI_bYear);
        
        HBox AI_bDateBox = new HBox(PADDING_VALUE);
        AI_bDateBox.getChildren().addAll(AI_bMonthBox, AI_bDayBox, AI_bYearBox);
        
        
        VBox AI_birthdayBox = new VBox();
        AI_birthdayBox.getChildren().addAll(AI_birthdayLabel, AI_bDateBox);
        AI_birthdayBox.setStyle(CSS_BOX_STYLE);
        
        //----- Contact Boxes -----//
		
        HBox AI_cAddress1Box = new HBox(PADDING_VALUE);
        AI_cAddress1Box.getChildren().addAll(AI_cAddress1Label, AI_cAddress1);
        
        HBox AI_cAddress2Box = new HBox(PADDING_VALUE);
        AI_cAddress2Box.getChildren().addAll(AI_cAddress2Label, AI_cAddress2);
        
        HBox AI_cCityBox = new HBox(PADDING_VALUE);
        AI_cCityBox.getChildren().addAll(AI_cCityLabel, AI_cCity);
        
        HBox AI_cStateBox = new HBox(PADDING_VALUE);
        AI_cStateBox.getChildren().addAll(AI_cStateLabel, AI_cState);
        
        HBox AI_cZipBox = new HBox(PADDING_VALUE);
        AI_cZipBox.getChildren().addAll(AI_cZipLabel, AI_cZip);
        
        HBox AI_cPhoneBox = new HBox(PADDING_VALUE);
        AI_cPhoneBox.getChildren().addAll(AI_cPhoneLabel, AI_cPhone);
        
        HBox AI_cEmailBox = new HBox(PADDING_VALUE);
        AI_cEmailBox.getChildren().addAll(AI_cEmailLabel, AI_cEmail);
        
        HBox AI_cAddrInfoBox = new HBox(PADDING_VALUE);
        AI_cAddrInfoBox.getChildren().addAll(AI_cCityBox, AI_cStateBox, AI_cZipBox);
        
        
        VBox AI_contactBox = new VBox();
        AI_contactBox.getChildren().addAll(AI_contactInfoLabel, AI_cAddress1Box, AI_cAddress2Box,
        		AI_cAddrInfoBox, AI_cPhoneBox, AI_cEmailBox);
        AI_contactBox.setStyle(CSS_BOX_STYLE);
        
        
        //----- General -----//
        
        VBox AI_outerBox = new VBox();
        AI_outerBox.getChildren().addAll(AI_nameBox, AI_birthdayBox, AI_contactBox, buttonBox);
        AI_outerBox.setStyle(CSS_BOX_STYLE);
        
        
        Scene accountInfoScene = new Scene(AI_outerBox, 800, 600);
        accountInfoScene.setFill(BACKGROUND);
        
        
        
        //======================== Insurance Info ========================//
        
        
        
        //======================== Pharmacy Info ========================//
        
        
        
        //======================== Control ========================//
        
        primaryStage.show(); 
        
        //----- Testing Panels -----//
        primaryStage.setScene(accountInfoScene);
	}
	
	
	//======================== Main Method ========================//
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
