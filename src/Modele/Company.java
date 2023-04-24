package Modele;


import java.util.ArrayList;


/**
 * la classe Company qui permet de regrouper toutes les données du projet.
 */

public class Company
{
    
// ATTRIBUT
  private ArrayList<Employee> l_employee;
  private ArrayList<Vehicle> l_vehicle;
  private ArrayList<Delivery> l_delivery;
  private ArrayList<Delivery> l_delivery_possible;
  private ArrayList<Delivery> l_delivery_optimal;
  private ArrayList<Delivery> l_delivery_ecologic;

  /**
   * Constructeur de la classe Company, initialise toutes les listes déclarées 
   * en attribut.
   */

  public Company()
  {
    this.l_employee = new ArrayList<Employee>();
    this.l_vehicle = new ArrayList<Vehicle>();
    this.l_delivery = new ArrayList<Delivery>();
    this.l_delivery_possible = new ArrayList<Delivery>();
    this.l_delivery_optimal = new ArrayList<Delivery>();
    this.l_delivery_ecologic = new ArrayList<Delivery>();
  }

  /**
   * méthode qui permet d'ajouter un employé à la liste d'employés.
   * @param a est une variable de type Employee
   */

  public void addListE(Employee a)
  {  
	  this.l_employee.add(a);
	  
  }
  /**
   *  methode : permet d'ajouter un vehicule à  la liste de vehicule.
   * @param b est une variable de type Vehicle.
   */
  
  public void addListV(Vehicle b)
  {  
	  this.l_vehicle.add(b);
	  
  }

  /**
   *  methode : permet d'ajouter une livraison à  la liste de livraison.
   * @param deli est une variable de type Delivery.
   */
  
  
  public void addListD(Delivery deli)
  {
    this.l_delivery.add(deli);

  }
  
  /**
   * methode : affiche la liste de véhicule d'une instance de la classe Company
   */
  public void displayListVehicule()
  {	  System.out.println("\n");
	  for(int i=0; i<l_vehicle.size(); i++)
	  {
		  System.out.println(l_vehicle.get(i).toString());
	  }
  }
  
  /**
   * methode : affiche la liste d'employés d'une instance de la classe Company
   */

  public void displayListEmployee()
  {	
	  System.out.println("\n");
	  for(int i=0; i<this.l_employee.size(); i++)
	  {
		  System.out.println( this.l_employee.get(i).toString());
	  }
  }
  
  /**
   * methode : affiche la liste de livraisons d'une instance de la classe Company
   */

  public void displayListDelivery()
  {	
	  
	System.out.println("\n");
    for(int i = 0; i<this.l_delivery.size(); i++)
    {
        System.out.println(this.l_delivery.get(i).toString());
    }
  }
  
  /**
   * methode : affiche la liste de livraisons d'une instance de la classe Company
   */

  
   public void displayListDeliveryPossible()
  {	
	 System.out.println("\n" + "The possible deliveries are");
    for(int i = 0; i<this.l_delivery_possible.size(); i++)
    {
        System.out.println(this.l_delivery_possible.get(i).toString());
    }
  }
  
   /**
    * methode : affiche la liste de livraisons optimales d'une instance de la classe Company
    */

  public void displayListDeliveryOptimal()
  {
	System.out.println("\n");  
	System.out.println("The optimal deliveries are:");
    for(int i = 0; i<this.l_delivery_optimal.size(); i++)
    {
        System.out.println(this.l_delivery_optimal.get(i).toString());
    }
  }
  
  /**
   * methode : affiche la liste de livraisons écologiques d'une instance de la classe Company
   */
   public void displayListDeliveryEcologic()
  {
	System.out.println("\n");
	System.out.println("The possible ecological deliveries are:");
    for(int i = 0; i<this.l_delivery_ecologic.size(); i++)
    {
        System.out.println(this.l_delivery_ecologic.get(i).toString());
    }
  }

   /**
    * methode : permet de generer la liste des livraisons possible à partir de la liste des livraisons.
    * on parcourt la liste des livraisons avec un "foreach", et test si la livraison est possible,
    * avec la methode isDeliveryPossible() définie dans la classe Delivery.
    */

  public void possibleDelivery()
  {	
	 
    for(Delivery deli : this.l_delivery)
    {
      if(deli.isDeliveryPossible())
      {
        this.l_delivery_possible.add(deli);
      }
    }

    if(this.l_delivery_possible.size() == 0)
    {
      System.out.println(" None delivery possible, the meal couldn't have been delivered");
    }
    
  }
  
  /**
   * methode : permet de génerer la liste des livraisons optimales à partir de la liste des livraisons
   * possibles.
   * Fonctionnement : le but est de comparer toutes les livraisons deux à deux. On veut donc faire
   * tous les sous ensembles à deux livraisons parmit l'ensemble de livraison que represente la liste de livraison possible.
   * On prend chaque livraison de l_delivery_possible, et on la compare avec tous ses successeurs dans la liste.
   * On fait appel à la methode "compareDelivery()" definie dans la classe Delivery.
   * Si la livraison retournée par cette méthode n'est pas dans la liste des livraisons optimales, on l'ajoute.
   */
  public void optimalDelivery()
  {		
	  int i,j;
	  Delivery dlr;
      for( i = 0; i <= l_delivery_possible.size() - 2; i++)// on s'arrete a l'avant dernier element
      {
        for( j = i+1; j <= l_delivery_possible.size()-1; j++)// on compare jusqu'au dernier element
        {	
          dlr = (l_delivery_possible.get(i).compareDelivery(l_delivery_possible.get(j)));
          if(! (l_delivery_optimal.contains(dlr)))
          {	
       
            l_delivery_optimal.add(l_delivery_possible.get(i).compareDelivery(l_delivery_possible.get(j))); // on ajoute a la liste optimal
          }
          
        }
      }
  }
  /**
   * méthode : permet de trouver la quantité minimale de Co2 dans la liste des livraisons optimales.
   * fonctionnement : on intialise la quantité minimale avec la quantité de CO2 de la premiere livraison.
   * On parcourt la l_delivery_possible, si la quantité de CO2 d'une livraison est inferieure à la quantité actuelle minimale,
   * alors la quantité minimale recoit la quantité CO2 de cette livraison. 
   * @return un réel, la quantité minimale de CO2
   */

  public double findMinQuantityCo2() // parmis la liste optimal
  {
    double  min = this.l_delivery_optimal.get(0).quantityCo2Emission();

    for(int i =1; i<this.l_delivery_optimal.size(); i++)
    {
      if(this.l_delivery_optimal.get(i).quantityCo2Emission() < min)
      {
        min = this.l_delivery_optimal.get(i).quantityCo2Emission();
      }
    }

    return min;

  }
  /**
   * methode : génère la liste des livraisons écologiques.
   * fonctionnement : on determine la quantité minimale de CO2 rejeté  parmi la liste des livraisons optimales.
   * On ajoute à la liste ecologique toutes livraisons qui possèdent cette quantité de CO2.
   */

  public void ecologicDelivery()
  {
    double min = this.findMinQuantityCo2();

    for(int i =0; i<this.l_delivery_optimal.size(); i++)
    {
      if(this.l_delivery_optimal.get(i).quantityCo2Emission() == min)
      {
        this.l_delivery_ecologic.add(this.l_delivery_optimal.get(i));

        /*permet d'ajouter tous les delivery qui ont la plus petite quantite 
          minimale de rejet de c02, exemple si il y a plusieurs delivery avec vélo
          alors la liste ecologic aura plusieurs element */
      }
    }    
  }

  /**
   * methode : permet de savoir parmit les livraisons ecologiques laquelle prend le moins de temps à faire sa livraison.
   * @return la livraison ecologique la plus rapide.
   */
  public Delivery bestTimeDelivery()
  { 
    double minTime = this.l_delivery_ecologic.get(0).timeOfCourse();
    Delivery timeDeli = this.l_delivery_ecologic.get(0);
    for(int i = 1; i<this.l_delivery_ecologic.size(); i++)
    {
      if(this.l_delivery_ecologic.get(i).timeOfCourse() < minTime)
      {
        timeDeli = this.l_delivery_ecologic.get(i);
        minTime = this.l_delivery_ecologic.get(i).timeOfCourse();

      }

    }

    System.out.println("\n" + timeDeli.toString() + " in " + minTime + "minutes, " + " this is the fastest delivery among the best deliveries");
    return timeDeli;

  }
  /**
   * methode : permets de savoir quelles livraisons écologiques coutent la moins chere
   * @return la livraison écologique  la moins chere.
   */

  public Delivery bestPriceDelivery()
  {
    double minPrice = this.l_delivery_ecologic.get(0).priceOfCourse();
    Delivery priceDeli = this.l_delivery_ecologic.get(0);
    for(int i = 1; i<this.l_delivery_ecologic.size(); i++)
    {
      if(this.l_delivery_ecologic.get(i).priceOfCourse() < minPrice)
      {
        priceDeli = this.l_delivery_ecologic.get(i);
        minPrice = this.l_delivery_ecologic.get(i).priceOfCourse();

      }

    }

    System.out.println(priceDeli.toString() + " , it cost " + minPrice + "€" + "  and this is the cheapest delivery among the best deliveries");
  
    return priceDeli;
  }

  
  
 


}
