import java.io.FileInputStream;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFX extends Application
{
//======================== JavaFX Method ========================//
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Scanner scan = new Scanner(System.in);

		
		
//=========================================================================================================================//
// 
// Section: Global Pages & Styling
// Description: Pages used by all users and elements/styling that will be needed on all 3 portals
//
//=========================================================================================================================//
		
		
		Color BACKGROUND = Color.rgb(255, 153, 0);
		int PADDING_VALUE = 10;
		Insets PADDING = new Insets(PADDING_VALUE);
		
		String CSS_BOX_STYLE = // this will be edited
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 2;\n" +
                "-fx-border-style: solid;\n" +
                "-fx-padding: 5px;\n" +
                "-fx-background-color: transparent;";
		
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

		
		
	//======================== Sign In ========================//
		Label SI_nameLabel = new Label("Full Name");
		TextField SI_nameField = new TextField();
		
		Label SI_passLabel = new Label("Password");
		PasswordField SI_passField = new PasswordField();
		
		Button SI_siButton = new Button("Sign In");
		
		Label SI_newAccount = new Label("Don't have an account?");
		Button SI_newAccountButton = new Button("Create Account");

		
		//===== Adding Elements to Frame =====//
		VBox SI_userInfo = new VBox(PADDING_VALUE);
		SI_userInfo.getChildren().addAll(patientIcon, SI_nameLabel, SI_nameField, SI_passLabel, SI_passField);
		
		VBox SI_buttons = new VBox(PADDING_VALUE);
		SI_buttons.getChildren().addAll(SI_siButton, SI_newAccount, SI_newAccountButton);
		
		VBox SI_outerBox = new VBox();
		SI_outerBox.setStyle(CSS_BOX_STYLE);
		SI_outerBox.getChildren().addAll(SI_userInfo, SI_buttons);
		
		Scene signInScene = new Scene(SI_outerBox, 800, 600);
		signInScene.setFill(BACKGROUND);
		
		
		
	//======================== Sign Up ========================//
		Label SU_nameLabel = new Label("Full Name");
		TextField SU_nameField = new TextField();
		
		Label SU_passLabel = new Label("Password");
		PasswordField SU_passField = new PasswordField();
		
		Label SU_reenterPass = new Label("Re-enter Password");
		PasswordField SU_reenterPassField = new PasswordField();
		
		Button SU_suButton = new Button("Create Account");
		
		Label SU_logIn = new Label("Already have an account?");
		Button SU_logInButton = new Button("Sign In");

		
		//===== Adding Elements to Frame =====//
		VBox SU_passEnterBox = new VBox(PADDING_VALUE);
		SU_passEnterBox.getChildren().addAll(SU_passLabel, SU_passField, SU_reenterPass, SU_reenterPassField);
		
		VBox SU_userInfo = new VBox(PADDING_VALUE);
		SU_userInfo.getChildren().addAll(patientIcon, SU_nameLabel, SU_nameField, SU_passEnterBox);
		
		VBox SU_buttons = new VBox(PADDING_VALUE);
		SU_buttons.getChildren().addAll(SU_suButton, SU_logIn, SU_logInButton);
		
		VBox SU_outerBox = new VBox();
		SU_outerBox.setStyle(CSS_BOX_STYLE);
		SU_outerBox.getChildren().addAll(SU_userInfo, SU_buttons);
		
		Scene signUpScene = new Scene(SU_outerBox, 800, 600);
		signUpScene.setFill(BACKGROUND);
		
		
		
	//======================== Messaging Portal ========================//
		
		
		
		
		
	//======================== Send Message ========================//
		//----- Header -----//
		ComboBox<String> SM_recipients = new ComboBox<String>();
		SM_recipients.getItems().add("Recipient 1");
		SM_recipients.getItems().add("Recipient 2");
		SM_recipients.getItems().add("Recipient 3");
		
		TextField SM_subject = new TextField();
		SM_subject.setText("Subject");
		
		//----- Text Box -----//
		Label SM_messageLabel = new Label("Message:");
		TextField SM_messageEntry = new TextField();
		
		
		//===== Adding Elements to Frame =====//
		VBox SM_address = new VBox(PADDING_VALUE);
		SM_address.getChildren().addAll(SM_recipients, SM_subject);
		
		VBox SM_message = new VBox(PADDING_VALUE);
		SM_message.getChildren().addAll(SM_messageLabel, SM_messageEntry);
		
		VBox SM_outerBox = new VBox();
		SM_outerBox.setStyle(CSS_BOX_STYLE);
		SM_outerBox.getChildren().addAll(SM_address, SM_message, bottomButtons);
		
		Scene sendMessageScene = new Scene(SM_outerBox, 800, 600);
		sendMessageScene.setFill(BACKGROUND);
		
		
		
		
		
		
		
		
		
//=========================================================================================================================//
//
// Section: Patient Portal Pages
// Description: Pages accessible to the patient user-type
//
//=========================================================================================================================//

		
		
	//======================== Patient Portal ========================//
		Button PP_settingsButton = new Button("Account Settings");
		
		Label PP_patient = new Label("Patient Portal");
		
		
		//----- Navigation Menu -----//
		//Image PP_insuranceIcon = new Image();		
		Button PP_insuranceButton = new Button("Insurance");
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
		PP_outerBox.setStyle(CSS_BOX_STYLE);
		
		// patientPortalScene Scene
		Scene patientPortalScene = new Scene(PP_outerBox, 800, 600);
		patientPortalScene.setFill(BACKGROUND);
		
		
		
	//======================== Visit Summary ========================//
		
		Label VS_visitSummaryLabel = new Label("Visit Summary");
		
		TextField VS_visitSummaryText = new TextField();
		
		
		
		//===== Adding Elements to Frame =====//
		
		VBox VS_outerBox = new VBox();
		VS_outerBox.setStyle(CSS_BOX_STYLE);
		VS_outerBox.getChildren().addAll(backButton, VS_visitSummaryLabel, VS_visitSummaryText);
		
		// Visit Summary Scene
		Scene visitSummaryScene = new Scene(VS_outerBox, 800, 600);
		visitSummaryScene.setFill(BACKGROUND);
		
		
		
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
		
		VBox AI_profile = new VBox();
		AI_profile.getChildren().addAll(patientIcon, AI_nameBox);
		AI_profile.setStyle(CSS_BOX_STYLE);
		
		
		//----- Birthday Boxes -----//
		// Birthday Nested Boxes
		HBox AI_bMonthBox = new HBox(PADDING_VALUE); // patient birth month label and field    
        AI_bMonthBox.getChildren().addAll(AI_bMonthLabel, AI_bMonth);
        
        HBox AI_bDayBox = new HBox(PADDING_VALUE); // patient birth day label and field 
        AI_bDayBox.getChildren().addAll(AI_bDayLabel, AI_bDay);
        
        HBox AI_bYearBox = new HBox(PADDING_VALUE); // patient birth year label and field 
        AI_bYearBox.getChildren().addAll(AI_bYearLabel, AI_bYear);
        
        HBox AI_bDateBox = new HBox(PADDING_VALUE);
        AI_bDateBox.getChildren().addAll(AI_bMonthBox, AI_bDayBox, AI_bYearBox);
        
        // Birthday Outer Box
        VBox AI_birthday = new VBox();
        AI_birthday.getChildren().addAll(AI_birthdayLabel, AI_bDateBox);
        AI_birthday.setStyle(CSS_BOX_STYLE);
        
        
        //----- Contact Boxes -----//
        // Contact Nested Boxes
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
        
        // Contact Outer Box
        VBox AI_contact = new VBox();
        AI_contact.getChildren().addAll(AI_contactInfoLabel, AI_cAddress1Box, AI_cAddress2Box,
        		AI_cAddrInfoBox, AI_cPhoneBox, AI_cEmailBox);
        AI_contact.setStyle(CSS_BOX_STYLE);
        
        
        //----- General -----//
        VBox AI_outerBox = new VBox();
        AI_outerBox.getChildren().addAll(AI_profile, AI_birthday, AI_contact, bottomButtons);
        AI_outerBox.setStyle(CSS_BOX_STYLE);
        
        // accountInfoScene Scene
        Scene accountInfoScene = new Scene(AI_outerBox, 800, 600);
        accountInfoScene.setFill(BACKGROUND);
        
        
        
	//======================== Insurance Info ========================//
        
        
        
	//======================== Pharmacy Info ========================//
		
		
		
		
		
		
		
        
//=========================================================================================================================//
//
// Section: Nurse Portal Pages
// Description: 
//
//=========================================================================================================================//

		
		
		
		
		
		
		
//=========================================================================================================================//
//
// Section: Doctor Portal Pages
// Description: Pages shown for doctor type users (excluding pages already created for the nurse portal
//
//=========================================================================================================================//		
		
	
		
		
		
		
//=========================================================================================================================//
//
// Section: Scene Control
// Description: 
//
//=========================================================================================================================//
        
        primaryStage.show(); 
        
        
		//===== Testing Panels =====//
        
        //----- general scenes -----//
        //primaryStage.setScene(signInScene);
        //primaryStage.setScene(signUpScene);
        //primaryStage.setScene(sendMessageScene);
        //primaryStage.setScene(messagingPortalScene);
        
        //----- patient portal -----//
		//primaryStage.setScene(patientPortalScene);
        //primaryStage.setScene(accountInfoScene);
		//primaryStage.setScene(visitSummaryScene);
	}
	
	
//======================== Main Method ========================//
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}




//=========================================================================================================================//
//
//Section: 
//Description: 
//
//=========================================================================================================================//	

