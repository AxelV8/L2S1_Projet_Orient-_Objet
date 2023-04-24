package Modele;

/**
 * classe Bike : h�rite de classe Vehicle
 * Repr�sente un v�lo de l'entreprise "Company"
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
  // fin d'intialisation, aucun getter setter, parce que bike h�ritera des getters de vehicle

  /**
   * redefinition de la m�thode clone.
   * @return un clone du v�lo qui appelle cette m�thode.
   */
  public Bike clone()
  {
    return new Bike(this.name,this.buyPrice);
  }  
  
  /**
   * impl�mentation de la methode abstraite herit� de la classe Vehicle.
   * Modifie la vitesse du v�lo grace � la vitesse d'une instance d'une sous classe de Cycliste, mise en param�tre.
   */
  public void setAverageSpeed(Employee pinaud)
  {
    this.averageSpeed = pinaud.getAverageSpeed();
  }

}
