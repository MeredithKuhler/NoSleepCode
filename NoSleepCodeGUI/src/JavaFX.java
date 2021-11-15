import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.html.CSS;

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

		String TITLE_FORMAT =
				"-fx-text-fill:BLACK; -fx-font-size: 40;";

		String SUBTITLE_FORMAT =
				"-fx-text-fill:BLACK; -fx-font-size: 25;";

		String SMALLSUBTITLE_FORMAT =
				"-fx-text-fill:BLACK; -fx-font-size: 14;";

		
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
		Label SI_nameLabel = new Label("Username");
		SI_nameLabel.setStyle(SUBTITLE_FORMAT);
		TextField SI_nameField = new TextField();
		SI_nameField.setMaxWidth(200);
		
		Label SI_passLabel = new Label("Password");
		SI_passLabel.setStyle(SUBTITLE_FORMAT);
		PasswordField SI_passField = new PasswordField();
		SI_passField.setMaxWidth(200);
		
		Button SI_siButton = new Button("Sign In");
		
		Label SI_newAccount = new Label("Don't have an account?");
		SI_newAccount.setStyle(SMALLSUBTITLE_FORMAT);
		Button SI_newAccountButton = new Button("Create Account");

		
		//===== Adding Elements to Frame =====//
		VBox SI_outerBox = new VBox(PADDING_VALUE);
		SI_outerBox.setAlignment(Pos.CENTER);
		SI_outerBox.setStyle(CSS_BOX_STYLE);
		SI_outerBox.getChildren().addAll(patientIcon, SI_nameLabel, SI_nameField, SI_passLabel, SI_passField,
				SI_siButton, new Label("\n\n"), SI_newAccount, SI_newAccountButton);
		
		Scene signInScene = new Scene(SI_outerBox, 800, 600);
		signInScene.setFill(BACKGROUND);
		
		
		
	//======================== Sign Up ========================//
		Label SU_nameLabel = new Label("Full Name");
		TextField SU_nameField = new TextField();
		SU_nameField.setMaxWidth(400);
		SU_nameLabel.setStyle(SUBTITLE_FORMAT);
		
		Label SU_passLabel = new Label("Password");
		PasswordField SU_passField = new PasswordField();
		SU_passField.setMaxWidth(400);
		SU_passLabel.setStyle(SUBTITLE_FORMAT);
		
		Label SU_reenterPass = new Label("Re-enter Password");
		PasswordField SU_reenterPassField = new PasswordField();
		SU_reenterPassField.setMaxWidth(400);
		SU_reenterPass.setStyle(SUBTITLE_FORMAT);
		
		Button SU_suButton = new Button("Create Account");
		
		Label SU_logIn = new Label("Already have an account?");
		SU_logIn.setStyle(SMALLSUBTITLE_FORMAT);
		Button SU_logInButton = new Button("Sign In");

		
		//===== Adding Elements to Frame =====//
		VBox SU_outerBox = new VBox(PADDING_VALUE);
		SU_outerBox.setStyle(CSS_BOX_STYLE);
		SU_outerBox.setAlignment(Pos.CENTER);
		SU_outerBox.setSpacing(30);
		SU_outerBox.getChildren().addAll(SU_nameLabel, SU_nameField,SU_passLabel, SU_passField, SU_reenterPass, SU_reenterPassField,
				patientIcon, SU_suButton, SU_logIn, SU_logInButton);
		
		Scene signUpScene = new Scene(SU_outerBox, 800, 600);
		signUpScene.setFill(BACKGROUND);
		
		
		
	//======================== Messaging Portal ========================//
		
		
		
		
		
	//======================== Send Message ========================//
		//----- Header -----//
		Label SM_sendMessageLabel = new Label("Send a Message to:	");
		SM_sendMessageLabel.setStyle(SUBTITLE_FORMAT);

		ComboBox<String> SM_recipients = new ComboBox<String>();
		SM_recipients.getItems().add("Recipient 1");
		SM_recipients.getItems().add("Recipient 2");
		SM_recipients.getItems().add("Recipient 3");
		
		TextField SM_subject = new TextField();
		SM_subject.setMaxWidth(550);
		SM_subject.setText("Subject");
		
		//----- Text Box -----//
		Label SM_messageLabel = new Label("Message:");
		SM_messageLabel.setStyle(SMALLSUBTITLE_FORMAT);
		TextField SM_messageEntry = new TextField();
		SM_messageEntry.setMinHeight(350);

		//---- Buttons ----//
		Button SM_backButton = new Button("Back");
		SM_backButton.setStyle(CSS_BACK_BUTTON_STYLE);
		Button SM_sendButton = new Button("Send");
		SM_sendButton.setStyle(CSS_SUBMIT_BUTTON_STYLE);
		
		//===== Adding Elements to Frame =====//
		HBox SM_headerBox = new HBox();
		SM_headerBox.setSpacing(30);
		SM_headerBox.setAlignment(Pos.CENTER);
		SM_headerBox.getChildren().addAll(SM_sendMessageLabel, SM_recipients);
		SM_headerBox.setStyle(CSS_BOX_STYLE);
		SM_headerBox.setStyle("-fx-border-color: transparent;");

		VBox SM_innerBox = new VBox();
		SM_innerBox.setSpacing(20);
		SM_innerBox.getChildren().addAll(SM_subject, SM_messageLabel, SM_messageEntry);

		HBox SM_buttons = new HBox();
		SM_buttons.setStyle(CSS_BOX_STYLE);
		SM_buttons.setAlignment(Pos.CENTER_RIGHT);
		SM_buttons.setSpacing(30);
		SM_buttons.setStyle("-fx-border-color: transparent;");
		SM_buttons.getChildren().addAll(SM_sendButton, SM_backButton);

		VBox SM_outerBox = new VBox();
		SM_outerBox.setStyle(CSS_BOX_STYLE);
		SM_outerBox.setSpacing(25);
		SM_outerBox.getChildren().addAll(SM_headerBox, SM_innerBox, SM_buttons);

		
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
		VS_visitSummaryLabel.setStyle(TITLE_FORMAT);
		
		TextField VS_visitSummaryText = new TextField();
		VS_visitSummaryText.setEditable(false);
		VS_visitSummaryText.setMinHeight(450);
		VS_visitSummaryText.setMaxWidth(800);
		
		Button VS_backButton = new Button("Back");
		VS_backButton.setStyle(CSS_BACK_BUTTON_STYLE);
		
		//===== Adding Elements to Frame =====//

		HBox VS_buttons = new HBox();
		VS_buttons.setStyle(CSS_BOX_STYLE);
		VS_buttons.setAlignment(Pos.CENTER_RIGHT);
		VS_buttons.setStyle("-fx-border-color: transparent;");
		VS_buttons.getChildren().addAll(VS_backButton);
		
		VBox VS_outerBox = new VBox();
		VS_outerBox.setStyle(CSS_BOX_STYLE);
		VS_outerBox.getChildren().addAll(VS_visitSummaryLabel, VS_visitSummaryText, new Label("\n"), VS_buttons);
		
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

		Button AI_backButton = new Button("Back");
		AI_backButton.setStyle(CSS_BACK_BUTTON_STYLE);
		Button AI_submitButton = new Button("Submit");
		AI_submitButton.setStyle(CSS_SUBMIT_BUTTON_STYLE);
		
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

		// Buttons
		HBox AI_buttons = new HBox();
		AI_buttons.setStyle(CSS_BOX_STYLE);
		AI_buttons.setStyle("-fx-border-color: transparent;");
		AI_buttons.setAlignment(Pos.CENTER_RIGHT);
		AI_buttons.setSpacing(30);
		AI_buttons.getChildren().addAll(AI_submitButton, AI_backButton);
        
        
        //----- General -----//
        VBox AI_outerBox = new VBox();
        AI_outerBox.getChildren().addAll(AI_profile, AI_birthday, AI_contact, AI_buttons);
        AI_outerBox.setStyle(CSS_BOX_STYLE);
        
        // accountInfoScene Scene
        Scene accountInfoScene = new Scene(AI_outerBox, 800, 600);
        accountInfoScene.setFill(BACKGROUND);

        
        
        
	//======================== Insurance Info ========================//

		//----- Insurance Information -----//
		Label II_insuranceLabel = new Label("Insurance");
		II_insuranceLabel.setStyle(TITLE_FORMAT);
		II_insuranceLabel.setMinHeight(25);

		Label II_healthProviderLabel = new Label("Healthcare Provider:	");
		TextField II_healthProvider = new TextField();
		II_healthProviderLabel.setMinHeight(25);

		Label II_subscriberNameLabel = new Label("Subscriber Name:	");
		TextField II_subscriberName = new TextField();
		II_subscriberNameLabel.setMinHeight(25);

		Label II_subscriberNumberLabel = new Label("Subscriber Number:	");
		TextField II_subscriberNumber = new TextField();
		II_subscriberNumberLabel.setMinHeight(25);

		Label II_groupNumberLabel = new Label("Group Number:	");
		TextField II_groupNumber = new TextField();
		II_groupNumberLabel.setMinHeight(25);


		Button II_addCoverageLabel = new Button("Add a Coverage");
		Button II_backButton = new Button("Back");
		II_backButton.setStyle(CSS_BACK_BUTTON_STYLE);

		//===== Setting Up Scene =====//
		VBox II_leftBox = new VBox();
		II_leftBox.setStyle(CSS_BOX_STYLE);
		II_leftBox.getChildren().addAll(II_healthProviderLabel, II_subscriberNameLabel,
				II_subscriberNumberLabel, II_groupNumberLabel, II_addCoverageLabel);
		II_leftBox.setStyle("-fx-border-color: transparent;");
		II_leftBox.setSpacing(15);

		VBox II_rightBox = new VBox();
		II_rightBox.setStyle(CSS_BOX_STYLE);
		II_rightBox.getChildren().addAll(II_healthProvider, II_subscriberName,
				II_subscriberNumber, II_groupNumber);
		II_rightBox.setStyle("-fx-border-color: transparent;");
		II_rightBox.setSpacing(18);

		VBox II_backBox = new VBox();
		II_backBox.setStyle(CSS_BOX_STYLE);
		II_backBox.setAlignment(Pos.CENTER_RIGHT);
		II_backBox.setStyle("-fx-border-color: transparent;");
		II_backBox.getChildren().addAll(II_backButton);

		HBox II_innerBox = new HBox();
		II_innerBox.setStyle(CSS_BOX_STYLE);
		II_innerBox.getChildren().addAll(II_leftBox, II_rightBox);

		VBox II_outerBox = new VBox();
		II_outerBox.setStyle(CSS_BOX_STYLE);
		II_outerBox.getChildren().addAll(II_insuranceLabel, II_innerBox, II_backBox);

		Scene insuranceInfoScene = new Scene(II_outerBox, 800, 600);
		insuranceInfoScene.setFill(BACKGROUND);

        
	//======================== Pharmacy Info ========================//
		
		//----- Pharmacy Titles -----//
		Label PI_pharmacyInfoLabel = new Label("Pharmacy Information");
		PI_pharmacyInfoLabel.setStyle(TITLE_FORMAT);
		PI_pharmacyInfoLabel.setMinWidth(50);
		PI_pharmacyInfoLabel.setMinHeight(50);

		Label PI_pharmacyNameLabel = new Label("Pharmacy");
		PI_pharmacyNameLabel.setStyle(SUBTITLE_FORMAT);
		TextField PI_pharmacyName = new TextField();

		//---- Contact Information ----//
		Label PI_contactInfoLabel = new Label("Contact Information");
		PI_contactInfoLabel.setStyle(SUBTITLE_FORMAT);

		Label PI_faxLabel = new Label("Fax Number:");
		TextField PI_fax = new TextField();
		PI_faxLabel.setMinHeight(25);

		Label PI_emailLabel = new Label("Email:");
		TextField PI_email = new TextField();
		PI_emailLabel.setMinHeight(25);

		Label PI_addressLabel1 = new Label("Address Line 1:");
		TextField PI_address1 = new TextField();
		PI_addressLabel1.setMinHeight(25);

		Label PI_addressLabel2 = new Label("Address Line 2:");
		TextField PI_address2 = new TextField();
		PI_addressLabel2.setMinHeight(25);

		Label PI_cityLabel = new Label("City:");
		TextField PI_city = new TextField();
		PI_cityLabel.setMinHeight(25);

		Label PI_stateLabel = new Label("State:");
		TextField PI_state = new TextField();
		PI_stateLabel.setMinHeight(25);

		Label PI_zipLabel = new Label("Zip Code:");
		TextField PI_zip = new TextField();
		PI_zipLabel.setMinHeight(25);

		Button PI_backButton = new Button("Back");
		PI_backButton.setStyle(CSS_BACK_BUTTON_STYLE);


		//===== Setting Up Scene =====//

		VBox PI_leftBox = new VBox();
		PI_leftBox.setStyle(CSS_BOX_STYLE);
		PI_leftBox.getChildren().addAll(PI_pharmacyNameLabel, PI_pharmacyName, PI_contactInfoLabel,
				PI_faxLabel, PI_emailLabel, PI_addressLabel1, PI_addressLabel2, PI_cityLabel, PI_stateLabel, PI_zipLabel);
		PI_leftBox.setStyle("-fx-border-color: transparent;");
		PI_leftBox.setSpacing(15);

		VBox PI_rightBox = new VBox();
		PI_rightBox.setStyle(CSS_BOX_STYLE);
		PI_rightBox.getChildren().addAll(new Label("\n\n\n\n\n\n\n"),PI_fax, PI_email, PI_address1, PI_address2,
				PI_city, PI_state, PI_zip);
		PI_rightBox.setStyle("-fx-border-color: transparent;");
		PI_rightBox.setSpacing(17);

		VBox PI_backBox = new VBox();
		PI_backBox.setStyle(CSS_BOX_STYLE);
		PI_backBox.setAlignment(Pos.CENTER_RIGHT);
		PI_backBox.setStyle("-fx-border-color: transparent;");
		PI_backBox.getChildren().addAll(PI_backButton);

		HBox PI_innerBox = new HBox();
		PI_innerBox.setStyle(CSS_BOX_STYLE);
		PI_innerBox.getChildren().addAll(PI_leftBox, PI_rightBox);

		VBox PI_outerBox = new VBox();
		PI_outerBox.setStyle(CSS_BOX_STYLE);
		PI_outerBox.getChildren().addAll(PI_pharmacyInfoLabel, PI_innerBox, PI_backBox);


		Scene pharmacyInfoScene = new Scene(PI_outerBox, 800, 600);
		pharmacyInfoScene.setFill(BACKGROUND);

		
        
//=========================================================================================================================//
//
// Section: Nurse Portal Pages
// Description: Pages shown for nurse type users.  These may also be seen by Doctor users.
//
//=========================================================================================================================//

		//===== Patient Selection =====//

		Label PS_nameLabel = new Label("Patient Name:");
		TextField PS_patientName = new TextField();

		Label PS_MRnLabel = new Label("MRn:");
		TextField PS_MRn = new TextField();

		Label PS_dobLabel = new Label("Date of Birth:");
		TextField PS_dob = new TextField();

		Button PS_editPatientFile = new Button("Edit Patient File");


		//===== Patient Information View =====//

		Label PIV_patientInfoViewLabel = new Label("Patient Information View");

		Label PIV_logVisitLabel = new Label("Log a Visit");
		//Button PIV_logVisitButton = new Button();
		//Image PIV_logVisitIcon = new Image();

		Label PIV_previousVisitLabel = new Label("Previous Visits");
		//Button PIV_prevVisitButton = new Button();
		//Image PIV_prevVisitIcon = new Image();

		Label PIV_insPharContLabel = new Label("Insurance, Pharmacy and Contact");
		//Button PIV_insPharContButton = new Button();
		//Image PIV_insPharContIcon = new Image();

		Label PIV_sendPrescriptionLabel = new Label("Send a Prescription\n*Doctors Only*");
		//Button PIV_sendPrescriptionButton = new Button();
		//Image PIV_sendPrescriptionIcon = new Image();



		//===== Log a Visit =====//

		Label LV_logVisitLabel = new Label("Log a Visit");
		LV_logVisitLabel.setStyle(TITLE_FORMAT);

		Label LV_takeVitalsLabel = new Label("Take Vitals:");
		LV_takeVitalsLabel.setStyle(SUBTITLE_FORMAT);

		Label LV_weightLabel = new Label("Weight:");
		TextField LV_weight = new TextField();
		LV_weightLabel.setMinHeight(25);

		Label LV_heightLabel = new Label("Height:");
		TextField LV_height = new TextField();
		LV_heightLabel.setMinHeight(25);

		Label LV_tempLabel = new Label("Temperature:");
		TextField LV_temp = new TextField();
		LV_tempLabel.setMinHeight(25);

		Label LV_bloodLabel = new Label("Blood Pressure:");
		TextField LV_blood = new TextField();
		LV_bloodLabel.setMinHeight(25);

		Label LV_over12Label = new Label("Patient over 12:");
		LV_over12Label.setMinHeight(25);
		CheckBox LV_yesBox = new CheckBox("Yes");

		Label LV_allergiesLabel = new Label("Allergies:");
		TextField LV_allergies = new TextField();
		LV_allergiesLabel.setMinHeight(25);

		Label LV_healthConcernsLabel = new Label("Health Concerns:");
		TextField LV_healthConcerns = new TextField();
		LV_healthConcernsLabel.setMinHeight(25);

		Label LV_dateLabel = new Label("Date:");
		TextField LV_date = new TextField();
		LV_dateLabel.setMinHeight(25);

		Button LV_backButton = new Button("Back");
		LV_backButton.setStyle(CSS_BACK_BUTTON_STYLE);

		Button LV_submitButton = new Button("Submit");
		LV_submitButton.setStyle(CSS_SUBMIT_BUTTON_STYLE);


		//---- Setting Up Scene ----//

		VBox LV_leftBox = new VBox();
		LV_leftBox.setStyle(CSS_BOX_STYLE);
		LV_leftBox.getChildren().addAll(LV_takeVitalsLabel, LV_weightLabel, LV_heightLabel, LV_tempLabel,
				LV_bloodLabel, LV_over12Label, LV_allergiesLabel, LV_healthConcernsLabel, LV_dateLabel);
		LV_leftBox.setStyle("-fx-border-color: transparent;");
		LV_leftBox.setSpacing(15);

		VBox LV_rightBox = new VBox();
		LV_rightBox.setStyle(CSS_BOX_STYLE);
		LV_rightBox.getChildren().addAll(new Label("\n\n"), LV_weight, LV_height, LV_temp,
				LV_blood, LV_yesBox, LV_allergies, LV_healthConcerns, LV_date);
		LV_rightBox.setStyle("-fx-border-color: transparent;");
		LV_rightBox.setSpacing(17);

		HBox LV_backBox = new HBox();
		LV_backBox.setStyle(CSS_BOX_STYLE);
		LV_backBox.setAlignment(Pos.CENTER_RIGHT);
		LV_backBox.setStyle("-fx-border-color: transparent;");
		LV_backBox.getChildren().addAll(LV_submitButton, LV_backButton);
		LV_backBox.setSpacing(18);

		HBox LV_innerBox = new HBox();
		LV_innerBox.setStyle(CSS_BOX_STYLE);
		LV_innerBox.getChildren().addAll(LV_leftBox, LV_rightBox);

		VBox LV_outerBox = new VBox();
		LV_outerBox.setStyle(CSS_BOX_STYLE);
		LV_outerBox.getChildren().addAll(LV_logVisitLabel, LV_innerBox, LV_backBox);


		Scene logVisitScene = new Scene(LV_outerBox, 800, 600);
		logVisitScene.setFill(BACKGROUND);



		//===== Previous Visits =====//

		Label PV_prevVisitsLabel = new Label("Previous Visits");

		//TableColumn PV_visit1 = new TableColumn


		//===== Insurance, Pharmacy and Contact =====//

		Label IPC_insurePharContLabel = new Label("Insurance, Pharmacy and Contact");
		IPC_insurePharContLabel.setStyle(TITLE_FORMAT);

		Label IPC_MRnLabel = new Label("MRn:");
		TextField IPC_MRn = new TextField();
		IPC_MRnLabel.setMinHeight(25);

		Label IPC_patientNameLabel = new Label("Patient Name:");
		TextField IPC_patientName = new TextField();
		IPC_patientNameLabel.setMinHeight(25);

		Label IPC_dobLabel = new Label("Date of Birth:");
		TextField IPC_dob = new TextField();
		IPC_dobLabel.setMinHeight(25);

		Label IPC_patientNumLabel = new Label("Phone #:");
		TextField IPC_patientNum = new TextField();
		IPC_patientNumLabel.setMinHeight(25);

		Label IPC_phoneNumLabel1 = new Label("Phone #:");
		TextField IPC_phoneNum1 = new TextField();
		IPC_phoneNumLabel1.setMinHeight(25);

		Label IPC_phoneNumLabel2 = new Label("Phone #:");
		TextField IPC_phoneNum2 = new TextField();
		IPC_phoneNumLabel2.setMinHeight(25);

		Label IPC_emailLabel = new Label("Email:");
		TextField IPC_email = new TextField();
		IPC_emailLabel.setMinHeight(25);

		Label IPC_emergencyContactLabel1 = new Label("Emergency Contact Information");
		IPC_emergencyContactLabel1.setStyle(SMALLSUBTITLE_FORMAT);

		Label IPC_emergencyContactLabel2 = new Label("Emergency Contact Information");
		IPC_emergencyContactLabel2.setStyle(SMALLSUBTITLE_FORMAT);

		Label IPC_nameLabel1 = new Label("Name:");
		TextField IPC_name1 = new TextField();

		Label IPC_nameLabel2 = new Label("Name:");
		TextField IPC_name2 = new TextField();

		Label IPC_relationshipLabel1 = new Label("Relationship:");
		TextField IPC_relationship1 = new TextField();

		Label IPC_relationshipLabel2 = new Label("Relationship:");
		TextField IPC_relationship2 = new TextField();

		Label IPC_providerLabel = new Label("Provider:");
		TextField IPC_provider = new TextField();
		IPC_providerLabel.setMinHeight(25);

		Label IPC_pharmacyInfoLabel = new Label("Pharmacy Information");
		IPC_pharmacyInfoLabel.setStyle(SMALLSUBTITLE_FORMAT);

		Label IPC_pharNameLabel = new Label("Name:	");
		Text IPC_pharName = new Text("Unknown");

		Label IPC_pharAddrLabel = new Label("Address:	");
		Text IPC_pharAddr = new Text("Unknown");

		Label IPC_pharFaxLabel = new Label("Fax #:	");
		Text IPC_pharFax = new Text("Unknown");

		Label IPC_pharEmailLabel = new Label("Email:	");
		Text IPC_pharEmail = new Text("Unknown");

		Label IPC_insuranceInfoLabel = new Label("Insurance Information");
		IPC_insuranceInfoLabel.setStyle(SMALLSUBTITLE_FORMAT);

		Label IPC_insuranceNumLabel = new Label("Insurance #:");
		TextField IPC_insuranceNum = new TextField();
		IPC_insuranceNumLabel.setMinHeight(25);

		Label IPC_phoneOnCardLabel = new Label("Phone # (on Card):");
		TextField IPC_phoneOnCard = new TextField();
		IPC_phoneOnCardLabel.setMinHeight(25);

		Button IPC_backButton = new Button("Back");
		IPC_backButton.setStyle(CSS_BACK_BUTTON_STYLE);

		Button IPC_submitButton = new Button("Submit");
		IPC_submitButton.setStyle(CSS_SUBMIT_BUTTON_STYLE);

		//---- Setting Up Scene ----//

		VBox IPC_leftBox1 = new VBox();
		IPC_leftBox1.setStyle(CSS_BOX_STYLE);
		IPC_leftBox1.getChildren().addAll(IPC_MRnLabel, IPC_patientNameLabel, IPC_dobLabel, IPC_patientNumLabel, IPC_emailLabel,
				IPC_emergencyContactLabel1, IPC_nameLabel1, IPC_relationshipLabel1, IPC_phoneNumLabel1,
				IPC_emergencyContactLabel2, IPC_nameLabel2, IPC_relationshipLabel2, IPC_phoneNumLabel2);
		IPC_leftBox1.setStyle("-fx-border-color: transparent;");
		IPC_leftBox1.setSpacing(15);

		VBox IPC_rightBox1 = new VBox();
		IPC_rightBox1.setStyle(CSS_BOX_STYLE);
		IPC_rightBox1.getChildren().addAll(IPC_MRn, IPC_patientName, IPC_dob, IPC_patientNum, IPC_email,
				IPC_name1, IPC_relationship1, IPC_phoneNum1,
				IPC_name2, IPC_relationship2, IPC_phoneNum2);
		IPC_rightBox1.setStyle("-fx-border-color: transparent;");
		IPC_rightBox1.setSpacing(17);

		VBox IPC_leftBox2 = new VBox();
		IPC_leftBox2.setStyle(CSS_BOX_STYLE);
		IPC_leftBox2.getChildren().addAll(IPC_pharmacyInfoLabel, IPC_pharNameLabel, IPC_pharAddrLabel, IPC_pharFaxLabel, IPC_pharEmailLabel,
				IPC_insuranceInfoLabel, IPC_providerLabel, IPC_insuranceNumLabel, IPC_phoneOnCardLabel);
		IPC_leftBox2.setStyle("-fx-border-color: transparent;");
		IPC_leftBox2.setSpacing(15);

		VBox IPC_rightBox2 = new VBox();
		IPC_rightBox2.setStyle(CSS_BOX_STYLE);
		IPC_rightBox2.getChildren().addAll(new Label("\n"), IPC_pharName,IPC_pharAddr, IPC_pharFax, IPC_pharEmail,
				new Label("\n"), IPC_provider, IPC_insuranceNum, IPC_phoneOnCard);
		IPC_rightBox2.setStyle("-fx-border-color: transparent;");
		IPC_rightBox2.setSpacing(17);

		HBox IPC_backBox = new HBox();
		IPC_backBox.setStyle(CSS_BOX_STYLE);
		IPC_backBox.setAlignment(Pos.CENTER_RIGHT);
		IPC_backBox.setStyle("-fx-border-color: transparent;");
		IPC_backBox.setSpacing(17);
		IPC_backBox.getChildren().addAll(IPC_submitButton, IPC_backButton);

		HBox IPC_innerBox = new HBox();
		IPC_innerBox.setStyle(CSS_BOX_STYLE);
		IPC_innerBox.setSpacing(20);
		IPC_innerBox.getChildren().addAll(IPC_leftBox1, IPC_rightBox1, IPC_leftBox2, IPC_rightBox2);

		VBox IPC_outerBox = new VBox();
		IPC_outerBox.setStyle(CSS_BOX_STYLE);
		IPC_outerBox.getChildren().addAll(IPC_insurePharContLabel, IPC_innerBox, IPC_backBox);


		Scene insurePharContScene = new Scene(IPC_outerBox, 800, 600);
		insurePharContScene.setFill(BACKGROUND);

		
//=========================================================================================================================//
//
// Section: Doctor Portal Pages
// Description: Pages shown for doctor type users (excluding pages already created for the nurse portal
//
//=========================================================================================================================//





//=========================================================================================================================//
//
//Section:	Event Handling
//Description:
//
//=========================================================================================================================//

		//===== New Account button on Sign In page =====//
		SI_newAccountButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(signUpScene);
					}
				});

		//===== Back Button on Insurance Info Page =====//
		II_backButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(patientPortalScene);
					}
				});

		//===== Back Button on Log a Visit Page =====//
		LV_backButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						// FIX THIS, NEEDS TO RETURN TO PATIENT/DOCTOR
						primaryStage.setScene(patientPortalScene);
					}
				});

		//===== Log In button on Sign Up Page =====//
		SU_logInButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						// FIX THIS, NEEDS TO RETURN TO PATIENT/DOCTOR
						primaryStage.setScene(signInScene);
					}
				});

		//===== Back Button on Visit Summary Page =====//
		VS_backButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(patientPortalScene);
					}
				});

		//===== Back Button on Send Message Page =====//
		SM_backButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						//FIX THIS, SHOULD GO TO MESSAGING PORTAL
						primaryStage.setScene(patientPortalScene);
					}
				});

		//===== Back button on Pharmacy Info Page =====//
		PI_backButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(patientPortalScene);
					}
				});

		//===== Insurance button on Patient Portal Page =====//
		PP_insuranceButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(insuranceInfoScene);
					}
				});

		//===== Pharmacy button on Patient Portal Page =====//
		PP_pharmacyButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(pharmacyInfoScene);
					}
				});

		//===== Messages button on Patient Portal Page =====//
		PP_messagesButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						// FIX THIS, SHOULD GO TO MESSAGES PORTAL PAGE
						primaryStage.setScene(pharmacyInfoScene);
					}
				});


		//===== Visit Summary button on Patient Portal Page =====//
		PP_visitsButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(visitSummaryScene);
					}
				});

		//===== Account Settings button on Patient Portal Page =====//
		PP_settingsButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(accountInfoScene);
					}
				});

		//===== Log out button on Patient Portal Page =====//
		PP_logOutButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(signInScene);
					}
				});

		//===== Back button on Account Info Page =====//
		AI_backButton.addEventHandler(MouseEvent.MOUSE_PRESSED,
				new EventHandler<MouseEvent>(){
					@Override public void handle(MouseEvent e){
						primaryStage.setScene(patientPortalScene);
					}
				});


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
		primaryStage.setScene(patientPortalScene);
        //primaryStage.setScene(accountInfoScene);
		//primaryStage.setScene(visitSummaryScene);
		//primaryStage.setScene(pharmacyInfoScene);
		//primaryStage.setScene(insuranceInfoScene);

		//---- nurse portal ----//
		//primaryStage.setScene(logVisitScene);
		//primaryStage.setScene(insurePharContScene);
	}
	
	
//======================== Main Method ========================//
	public static void main(String[] args) {
		Application.launch(args);
	}

}



//=========================================================================================================================//
//
//Section:
//Description:
//
//=========================================================================================================================//
