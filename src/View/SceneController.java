package View;



import java.io.IOException;

import javax.swing.text.LabelView;

import Modele.Bike;
import Modele.Company;
import Modele.Employee;
import Modele.Vehicle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;
/**
 * Controller pour l'interface graphique
 */
public class SceneController {
	/**
	 * les attributs
     */
	private Company company;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private Button logoutButton;
	@FXML
	private AnchorPane ScenePane;
	@FXML
	private AnchorPane MapPane;
	
	@FXML
	private Label myLabel;
	@FXML
	private RadioButton rButton1, rButton2, rButton3;
	

	/**
	 * On change de scène avec les méthodes ci dessous
     */
	public void switchToScene1(ActionEvent event) throws IOException {
	
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("Super Delivery");
		stage.setScene(scene);
		stage.show();
	}
	
	public void createVehicle(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("create.vehicle.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("create a Vehicle");
		stage.setScene(scene);
		stage.show();
	}
	public void createEmployee(ActionEvent event) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("create.employee.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("create an Employee");
		stage.setScene(scene);
		stage.show();
	}
	public void createDelivery(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("create.delivery.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("create a delivery");
		stage.setScene(scene);
		stage.show();
	}
	/**
	 * Quitte l'interface
     */
	public void logout(ActionEvent event)
	{
		stage = (Stage) ScenePane.getScene().getWindow();
		System.out.println("You successfully logout ! ");
		stage.close();
	}

	public void chooseEmployee(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("chooseEmployee.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("create a delivery");
		stage.setScene(scene);
		stage.show();
	}
	public void chooseVehicle(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("chooseVehicle.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("create a delivery");
		stage.setScene(scene);
		stage.show();
	}
	public void chooseMeal(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("chooseMeal.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle("create a delivery");
		stage.setScene(scene);
		stage.show();
	}
	public void getFood(ActionEvent event)
	{
		if(rButton1.isSelected())
		{
			myLabel.setText(rButton1.getText());
		} else if(rButton2.isSelected())
		  {
			myLabel.setText(rButton2.getText());
		  } else if(rButton3.isSelected())
		    {
			  myLabel.setText(rButton3.getText());
		    }
	}
		
	
	
	
}

