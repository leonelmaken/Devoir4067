# Devoir4067
**premier exercice sur le patron de construction "factory method"**

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

**Deuxième execice "les patrons de structurations"**
****L'Adapter ****:

• Son but est de convertir l’interface d’une classe existante en un
  autre attendue par le client également existants afin qu’ils
  puissent travailler ensemble.
  
• Il s’agit de confier à une classe existante une nouvelle interface
  pour répondre aux besoins de clients.
  
• Convertir l’interface d’une classe en une autre conforme à
  l’attente d’un client.
  
• Permettre la collaboration d’instances dont les classes ont des
  interfaces incompatibles.

Les participants :

• Interface : introduit la signature des méthodes de l’objet
• Client : programme ou classe qui interagit avec les objets
  répondant à interface
• Adaptateur : implémente les méthodes de Interface en
  invoquant les méthodes de l’objet adapte
• Adapte : l’objet dont l’interface doit être adaptée pour
  correspondre a Interface.

**Le patron composite** :

• Il permet de combiner des objets en structures plus grandes.
• Il décrit une façon de traiter de la même manière les objets
  simples et les objets composites .
• Composer des objets dans des structures arborescentes pour
  représenter des hiérarchies composants/composés
• Permet au client de manipuler uniformément les objets simples et
  les objets au sein de leurs compositions.

Les participants:

• Component
  – déclare l’interface commune à tous les objets
  – déclare le comportement par défaut pour toutes les classes
• Leaf : représente une feuille
  – Implémente le comportement élémentaire
• Composite : définit le comportement des composants ayant des
  fils, stocke les fils et implémente les opérations nécessaires à leur
  gestion.
• Client : utilise l’interface component
  – Si le receveur est une feuille la requête est directement traitée
  – Sinon le composite retransmet la requête à ses fils.

**Le patron Bridge** :

• Il permet de découpler l’interface d’une classe et son
  implémentation.
• Ceci permet à l’interface et l’implémentation de varier
  séparément.
• Utilise la règle : préférez la composition à l’héritage?.

Les participants :

• Abstraction : définit l’interface de l’abstraction; gère une référence
  à un objet de type implémentation.
• RefineAbstration : enrichit l’interface définie par l’abstraction pour
  constituer une classe concrète
• Implementor : définit l’interface commune pour toutes les
  implémentations concrètes. En général elle définit des opérations
  primitives
• ConcreteImplementor : réalise concrètement l’implémentation de
  l’interface.
• bridge : lien d’association qui fait le pont entre l’abstraction et
  l’implémentation.

**Le patron Decorator** :

• Attacher dynamiquement des fonctionnalités supplémentaires à
  un objet.
• L’ajout se fait dynamiquement à l’exécution
• Cet ajout de fonctionnalités ne modifie pas l’interface de l’objet
• L’ajout reste transparent vis-à-vis des clients.
• il offre une alternative assez souple à l’héritage pour composer de
  nouvelles fonctionnalités.

Les participants :

• ComposantAbstrait : déclare l’interface commune pour les
  décorateurs et les objets décorés.
• ComposantConcret : la classe qui définit les objets initiaux auxquels
  de nouvelles fonctionnalités doivent être ajoutées.
• Decorateur composant: classe abstraite ayant une référence vers un
• DecorateurConcretA et DecorateurConcretB : définissent des
  comportement supplémentaires pouvant être ajoutés dynamiquement aux composants.
• Client : utilise le décorateur pour l’ajout dynamique des
  fnctionnalités.  

Les codes de ces différents patrons se retrouvent dans le dossiers codes/patrons de structuration et les modeles dans le dossiers modèles/patrons de structurations.
