package Modele;

/**
 * classe Bike : hérite de classe Vehicle
 * Représente un vélo de l'entreprise "Company"
 */
public class Bike extends Vehicle
{
	/**
	 * Constructeur de la classe Bike : utilise uniquement le constructeur de Vehicle, super(). 
	 * @param name, nom du velo
	 * @param buyPrice, prix d'achat du velo
	 */
  public Bike(String name, int buyPrice)
  {
    super(name,buyPrice,0,0,0, buyPrice/30000);// nous faudra methode
  }
  // fin d'intialisation, aucun getter setter, parce que bike héritera des getters de vehicle

  /**
   * redefinition de la méthode clone.
   * @return un clone du vélo qui appelle cette méthode.
   */
  public Bike clone()
  {
    return new Bike(this.name,this.buyPrice);
  }  
  
  /**
   * implémentation de la methode abstraite herité de la classe Vehicle.
   * Modifie la vitesse du vélo grace à la vitesse d'une instance d'une sous classe de Cycliste, mise en paramètre.
   */
  public void setAverageSpeed(Employee pinaud)
  {
    this.averageSpeed = pinaud.getAverageSpeed();
  }

}
