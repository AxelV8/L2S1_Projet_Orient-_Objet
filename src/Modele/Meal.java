package Modele;

/**
 * classe Meal : permet de repr�senter le repas port� lors de la livraison.
 * en relation d'agregation avec la classes Delivery.
 * attributs : un entier pour la masse du repas, 
 * 				une chaine de caracteres pour le nom du repas.
 */

public class Meal 
{
  private int weight;
  private String name;
  
  /**
   * intialise les attributs de l'objet instanci� avec les valeurs donn�es en parametre.
   * @param name , pour le nom du repas
   * @param weight , pour la masse du repas
   */
  public Meal(String name, int weight)
  {
    this.name = name;
    this.weight = weight;
    
  }
  public double getWeight()
  {
    return this.weight;
  }

  public String getName()
  {
    return this.name;
  }


}