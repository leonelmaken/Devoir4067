# Devoir4067
premier exercice sur le patron de construction "factory method"

factory method :
principes :
  - Déclarer une fabrique avec une méthode de création de l’objet qui attend
    les données nécessaires pour déterminer le type de l’objet à créer.
  - Il est utilisé lorsqu’à l’exécution il est nécessaire de déterminer
    dynamiquement quel objet d’un ensemble de sous-classes doit être
    instancier.

  Les Participants : 
    - le client : le classe(programme) qui fait appel à la fabrique pour lui
      fournir des objets de type Produit
    - ProduitConcret : les sous classes concrètes à instancier
    - Produit : la classe abstraite dont les sous –classes seront instanciées
    - Frabrique : la classe qui définit la méthode de création d’objets

Abstract factory : 

principes :

  - Le but est de créer des objets regroupés en familles sans avoir à
    connaître leurs classes concrètes.
  - Permet de fournir une interface unique pour instancier des objets
    d’une même famille sans avoir à connaitre les classes à instancier.

Les participants : 
  - FrabriqueAbstraite : interface spécifiant les signatures des méthodes
    créant les différents objets
  - FrabriqueConcrete (1 et 2) : classes implémentant les méthodes de
    création d’objets. Connaissent les familles et les produits, capable de
    créer une instance d’un produit pour une famille.
  - Produit (A et B) : interfaces (ou classes abstraites) des produits
    indépendamment de leur famille.
  - Produit (Ax et Bx) : introduisent les familles de produits
  - Client : le classe(programme) qui fait appel à la fabrique pour lui
    fournir des objets de type Produit

 Singleton :
    principes : 
     - L’objectif du pattern SINGLETON est de garantir qu’une classe ne
       possède qu’une seule instance et de fournir un point d’accès global à
       celle-ci.
     - Fourni une méthode de classe unique retournant cette unique instance.
     - Restreint l'instanciation d'une classe à un seul point.
     - On l’implémente en écrivant une classe contenant une méthode qui
       crée une instance uniquement s'il n'en existe pas encore. Sinon elle
       renvoie une référence vers l'objet qui existe déjà.
     - Il faudra veiller à ce que le constructeur de la classe soit privé, afin de
       s'assurer que la classe ne puisse être instanciée autrement que par la
       méthode de création contrôlée.  

    participants : 
       - Un seul participant : la classe singleton
le Bluider :
    principes :
      - Créer des objets complexes à partir d’autres objets sources.
      - Ces parties (objets sources) doivent (généralement) être créées
        suivant un ordre ou un algorithme spécifique.
      - Concrètement, assembler plusieurs objets pour les « monter » et
        n’en faire qu’un.  

    les participants :
      - MonteurAbstrait : précise une classe abstraite (ou une interface)
        pour la création de partie d’un objet Produit

      - MonteurConcret : construit et assemble des parties du produit
        par implémentation des méthodes du MonteurAbstrait  

      - Directeur : construit un objet en utilisant l’interface du Monteur

      - Produit : représente l’objet complexe en cours de construction
L'implémentation de chaque patron de construction se trouve dans le dossier code et la présentation de chaque patron dans le dossier models      
