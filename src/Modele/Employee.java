package Modele;

/**
 * Classe Employee : classe abstraite , car on instancie jamais  un objet de la classe Employee
 * donc aucun objet dans le programme n'a Employee en type dynamique
 * represente un employé de la classe company.
 * l'employé livre un repas avec un vehicule.
 * Relation de composition avec la classe Company et d'agregation avec la classe Delivery et avec la classe Bike.
 * 
 * attributs : un nom , un poids, un salaire, une charge utile
 *
 */
public abstract  class Employee
{
  protected String name;
  protected double weight;
  protected double  wage;// by hour
  protected double usedCharge; 

  /**
   * Constructeur de la classe Employee.
   * la charge utile d'un employé est égale à son poids divisé par 8.
   * @param name le nom
   * @param weight , le poids
   * @param wage , le salaire
   */
  public Employee(String name, double weight, double wage)
  {
    this.name = name;
    this.weight = weight;
    this.wage =wage;
    this.usedCharge = this.weight/8;
  }
  public String getName()
  {
    return this.name;
  }
  public double getWeight()
  {
    return this.weight;
  }
  public double getWage()
  {
    return this.wage;
  }
  public double getUsedCharge()
  {
    return this.usedCharge;
  }

  /**
   * méthode abstraite car on ne veut l'utiliser que pour une instance des sous-classes de la classe Cyclist
   * elle meme heritée de la classe Employee.
   * @return
   */
  public abstract double getAverageSpeed();
  /* on la defini car on veut manipuler tous les employee avec le type satic "employee"
    et on veut pouvoir appeler la methode dans le cas ou le type dynamique est un cyclist */
/**
 * methode abstraite clone : on la redéfinie dans les sous classes de Employee
 */
  public abstract Employee clone();
/**
 * redefinition de la methode toString de la super classe Object.
 * @return une en String les informations d'une instance de la classe Employee
 */
  public String toString()
  {
    return "employee :  name : " + this.name + "; weight : " + weight + " wage : " + wage + "€";
  }
  

}