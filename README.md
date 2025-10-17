# --Hibernate-Relational-CRUD
# Hibernate Many-to-One Demo: Question–Answer Mapping

This project demonstrates a **Many-to-One** relationship using Hibernate ORM, where multiple `Answer` entities are linked to a single `Question`. It includes object creation, bidirectional mapping, and CRUD-style persistence using Hibernate's session and transaction management.

---

## 🔧 Tech Stack

- Java SE
- Hibernate ORM
- MySQL (or H2 for demo)
- Maven (optional)
- Eclipse/IntelliJ

---

## 🧩 Entity Relationship

- **Question** → can have many **Answers**
- **Answer** → belongs to one **Question**

```plaintext
Answer (Many) ─────▶ Question (One)


src/
└── com.sample/
    ├── ManytoOneDemo.java
    ├── Question.java
    └── Answer.java
hibernate.cfg.xml
README.md
