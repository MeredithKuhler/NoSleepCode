import java.io.FileInputStream;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
		
		String CSS_LOGOUT_BUTTON_STYLE =
				"-fx-background-color: #5A70A9;\n" +
				"-fx-text-fill: #ffffff";
		
		String CSS_BACK_BUTTON_STYLE =
				"-fx-background-color: #ff0000;\n" +
				"-fx-text-fill: #ffffff";
		
		String CSS_SUBMIT_BUTTON_STYLE =
				"";
		
		//----- Global Elements -----//
		Image userIcon = new Image("UserIcon.png");
		ImageView patientIcon = new ImageView(userIcon);
		patientIcon.setFitHeight(50);
		patientIcon.setFitWidth(50);
		patientIcon.setPreserveRatio(true);
		
		//----- Global Buttons -----//
		Button PP_logOutButton = new Button("LOG OUT");
		PP_logOutButton.setStyle(CSS_LOGOUT_BUTTON_STYLE);
		
		Button backButton = new Button("Back");
		backButton.setStyle(CSS_BACK_BUTTON_STYLE);
		
		Button submitButton = new Button("Submit");
		submitButton.setStyle(CSS_SUBMIT_BUTTON_STYLE);
		
		HBox bottomButtons = new HBox(PADDING_VALUE);
		bottomButtons.getChildren().addAll(submitButton, backButton);
		
		
		/*
		Label labelName = new Label("");
		TextField textName = new TextField();
		 */

		
        //======================== Patient Portal ========================//
		Button PP_settingsButton = new Button("Account Settings");
		
		Label PP_patient = new Label("Patient Portal");
		
		
		//----- Navigation Menu -----//
		//Image PP_insuranceIcon = new Image();		
		Button PP_insuranceButton = new Button("Insurance");
		//PP_insuranceButton.setStyle("-fx-background-color: transparent;");
		//Image PP_pharmacyIcon = new Image();
		Button PP_pharmacyButton = new Button("Pharmacy Information");
		//Image PP_messagesIcon = new Image();
		Button PP_messagesButton = new Button("Messages");
		//Image PP_visitsIcon = new Image();
		Button PP_visitsButton = new Button("Visit Summary");
		
		
		//===== Adding Elements to Frame =====//
		HBox PP_topButtons = new HBox(PADDING_VALUE);
		PP_topButtons.setStyle(CSS_BOX_STYLE);
		PP_topButtons.getChildren().addAll(PP_logOutButton, PP_settingsButton);
		
		VBox PP_profile = new VBox();
		PP_profile.getChildren().addAll(patientIcon, PP_patient);
		PP_profile.setStyle(CSS_BOX_STYLE);
		
		HBox PP_navImagesBox = new HBox(PADDING_VALUE);
		//PP_navImagesBox.getChildren().addAll(PP_insuranceIcon, PP_pharmacyIcon, PP_messagesIcon, PP_visitsIcon);
		
		HBox PP_navButtonsBox = new HBox(PADDING_VALUE);
		PP_navButtonsBox.getChildren().addAll(PP_insuranceButton, PP_pharmacyButton, PP_messagesButton, PP_visitsButton);
		
		VBox PP_navMenu = new VBox();
		PP_navMenu.setStyle(CSS_BOX_STYLE);
		PP_navMenu.getChildren().addAll(PP_navImagesBox, PP_navButtonsBox);
		
		
		//----- General -----//
		VBox PP_outerBox = new VBox();
		PP_outerBox.getChildren().addAll(PP_topButtons, PP_profile, PP_navMenu);
		
		Scene patientPortalScene = new Scene(PP_outerBox, 800, 600);
		patientPortalScene.setFill(BACKGROUND);
		
		
		//======================== Messaging Portal ========================//
		
		
		
        //======================== Send Message ========================//
		
		
		
        //======================== Visit Summary ========================//
		
		
		
		//======================== Account Information ========================//
		
		//----- General Section -----//
		
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
		
		VBox AI_patientName = new VBox();
		AI_patientName.getChildren().addAll(patientIcon, AI_nameBox);
		AI_patientName.setStyle(CSS_BOX_STYLE);
		
		//----- Birthday Boxes -----//
		HBox AI_bMonthBox = new HBox(PADDING_VALUE); // patient birth month label and field    
        AI_bMonthBox.getChildren().addAll(AI_bMonthLabel, AI_bMonth);
        
        HBox AI_bDayBox = new HBox(PADDING_VALUE); // patient birth day label and field 
        AI_bDayBox.getChildren().addAll(AI_bDayLabel, AI_bDay);
        
        HBox AI_bYearBox = new HBox(PADDING_VALUE); // patient birth year label and field 
        AI_bYearBox.getChildren().addAll(AI_bYearLabel, AI_bYear);
        
        HBox AI_bDateBox = new HBox(PADDING_VALUE);
        AI_bDateBox.getChildren().addAll(AI_bMonthBox, AI_bDayBox, AI_bYearBox);
        
        
        VBox AI_birthday = new VBox();
        AI_birthday.getChildren().addAll(AI_birthdayLabel, AI_bDateBox);
        AI_birthday.setStyle(CSS_BOX_STYLE);
        
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
        
        
        VBox AI_contact = new VBox();
        AI_contact.getChildren().addAll(AI_contactInfoLabel, AI_cAddress1Box, AI_cAddress2Box,
        		AI_cAddrInfoBox, AI_cPhoneBox, AI_cEmailBox);
        AI_contact.setStyle(CSS_BOX_STYLE);
        
        
        //----- General -----//
        
        VBox AI_outerBox = new VBox();
        AI_outerBox.getChildren().addAll(AI_patientName, AI_birthday, AI_contact, bottomButtons);
        AI_outerBox.setStyle(CSS_BOX_STYLE);
        
        
        Scene accountInfoScene = new Scene(AI_outerBox, 800, 600);
        accountInfoScene.setFill(BACKGROUND);
        
        
        
        //======================== Insurance Info ========================//
        
        
        
        //======================== Pharmacy Info ========================//
	
        
        
        //======================== Control ========================//
        
        primaryStage.show(); 
        
        //----- Testing Panels -----//
        //primaryStage.setScene(patientPortalScene);
        primaryStage.setScene(accountInfoScene);
	}
	
	
	//======================== Main Method ========================//
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}






