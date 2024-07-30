# About Project
This API was developed thinking about creating a banking system similar to one of the largest banks in Brazil... Santander

# Class structure (Domain API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

# Technologies used
[![My Skills](https://skillicons.dev/icons?i=java,spring,postgres,gradle,hibernate,git)](https://skillicons.dev)

**Java** - For the development of the application back-end. <br>
**Spring** - Framework used in apllication. <br>
**PostegreSQL** - Database used. <br>
**Gradle** - For dependency management.
**Hibernate** - For high-performance object/relational querying and persistence. <br>
**Git** - For version control

# What problem does this API solve?
- This API that I developed was made thinking about helping people create a bank account, more easily and quickly, faster transfers, faster responses, and of course... a lighter and more optimized application, and with a system fluid.
