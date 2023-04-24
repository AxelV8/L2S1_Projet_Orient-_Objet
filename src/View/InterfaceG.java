package View;



import Modele.BeginnerCyclist;
import Modele.*;
import Modele.Company;
import Modele.Delivery;
import Modele.Employee;
import Modele.ExpertCyclist;
import Modele.GpsPoint;
import Modele.Meal;
import Modele.ScootDriver;
import Modele.Scooter;
import Modele.SportifCyclist;
import Modele.Vehicle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

/**
 * Main composé du test avec les données ainsi que les interfaces graphiques
 * 
 */

public class InterfaceG extends Application {
   public static void main(String[] args) {
       launch(args);
   }

   
   
   @Override
   public void start(Stage primaryStage) throws Exception 
   {
   
	   try {
		   /**
		    * création des objets
		    */
   			Company company = new Company();

   			GpsPoint p1 = new GpsPoint();
   			GpsPoint p2 = new GpsPoint(3,0);
     
   			Employee Jade = new BeginnerCyclist("Jade", 55, 7.1);
   			company.addListE(Jade);
   			Employee  Alfred = new ScootDriver("Alfred", 80, 7.2);
   			company.addListE(Alfred);
   			Employee Anna = new ExpertCyclist("Anna", 67, 7.4);
   			company.addListE(Anna);
   			Employee Tiago = new ScootDriver("Tiago", 62, 7.2);
   			company.addListE(Tiago);
   			Employee Blaise = new SportifCyclist("Blaise", 74, 7.25);
   			company.addListE(Blaise);

   			company.displayListEmployee();

   			Vehicle Cyclou1 = new Bike("Cyclou", 450);
   			company.addListV(Cyclou1);
   			Vehicle Vavite1 = new Bike("Vavite", 500); 
   			company.addListV(Vavite1);
   			Vehicle Yamama1 = new Scooter("Yamaha", 3500, 300, 50, 7.5 );
   			company.addListV(Yamama1);
   			Vehicle Piagigi1 = new Scooter("Piagigi", 2000, 150, 35, 6 );
   			company.addListV(Piagigi1);
   			Vehicle Vespo1 = new Scooter("Vespo", 2500, 125, 30, 5.5 );
   			company.addListV(Vespo1);
   			/**
 		    * Affiche la liste des véhicules
 		    */
   			company.displayListVehicule();

   			Meal Kebab = new Meal("Kebab", 5);

   			Delivery d1 = new Delivery(Kebab, Anna, Cyclou1);
   			d1.addGpsPoint(p1);
   			d1.addGpsPoint(p2);
   			company.addListD(d1);

   			Delivery d2 = new Delivery(Kebab, Jade, Vavite1);
   			d2.addGpsPoint(p1);
   			d2.addGpsPoint(p2);
   			company.addListD(d2);

   			Delivery d3 = new Delivery(Kebab, Blaise, Yamama1);
   			d3.addGpsPoint(p1);
		    d3.addGpsPoint(p2);
		    company.addListD(d3);

		    Delivery d4 = new Delivery(Kebab, Alfred, Vespo1);
		    d4.addGpsPoint(p1);
		    d4.addGpsPoint(p2);
		    company.addListD(d4);

		    Delivery d5 = new Delivery(Kebab, Tiago, Piagigi1);
		    d5.addGpsPoint(p1);
		    d5.addGpsPoint(p2);
		    company.addListD(d5);

		 
		    company.possibleDelivery();
		    /**
			 * Affiche la liste des courses possibles
		     */
		    company.displayListDeliveryPossible();

		    company.optimalDelivery();
		    /**
			 * Affiche la liste des courses optimales
		     */
		    company.displayListDeliveryOptimal();

		    company.ecologicDelivery();
		    /**
			 * Affiche la liste des courses ecologiques
		     */
		    company.displayListDeliveryEcologic();
		    /**
			 * Affiche la course qui dure le moins longtemps
		     */
		    company.bestTimeDelivery();
		    /**
			 * Affiche la liste qui coute le moins chere
		     */
		    company.bestPriceDelivery();
     //-----------------------------------------------------------------------//
     //Partie Interface Graphique
		    Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
   	
		    Scene scene = new Scene(root, Color.BLACK);
		    Stage stage = new Stage();
   	 
		    stage.setTitle("Super Delivery Service");
		    stage.setScene(scene); 
		    stage.show();
   	
   	 	} catch( Exception e){
   	 			e.printStackTrace();
   	 	  }
   
   	 }
   
  
	   
   
}




