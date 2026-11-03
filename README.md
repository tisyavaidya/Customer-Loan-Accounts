# Customer Loan Accounts

A Java program that manages **customers and all their loans**: each customer can hold any mix of car loans, mortgages and unsecured loans, and the program prints a monthly payment report per customer.

## Design

```
Customer ─ first name, last name, SSN
   │  has many (ArrayList<LoanAccount>)
   ▼
LoanAccount  (base class: principal, rate, term, monthly payment)
   ├── CarLoan          + vehicle VIN
   ├── PrimaryMortgage  + monthly PMI, property Address
   └── UnsecuredLoan
```

- **Polymorphism:** a customer's loans are stored in one `ArrayList<LoanAccount>`. `printMonthlyReport()` loops through them and calls each loan's own `toString()`, without checking which type it is.
- **Encapsulation:** customer details are private, with getters and setters, and loans are added only through `addLoanAccount()`.
- Builds on the [Loan Account Hierarchy](https://github.com/tisyavaidya/Loan-Account-Hierarchy) by adding the `Customer` class.

## Example output

The customers and loans are sample data from the assignment's test code:

```
Monthly Report of Customers by Loan Account
Account Report for Customer: Tony Stark with SSN 111-22-3333

Car Loan with:
Principal : $25000.00
Annual Interest Rate :4.90%
Term of Loan in Months :72
Monthly Payment: $401.46
Vehicle VIN: IRQ3458977

Primary Mortgage Loan with:
Principal : $250000.00
Annual Interest Rate :3.75%
Term of Loan in Months :360
Monthly Payment: $1157.79
PMI Monthly Amount: $35.12
Property Address:
  321 Main Street
  State College, PA 16801

Unsecured Loan with:
Principal : $5000.00
Annual Interest Rate :10.75%
Term of Loan in Months :48
Monthly Payment: $128.62
...
```

## Run it

```bash
javac *.java
java main
```

Remove the `package com.mycompany.programmingassignment3;` lines first, or open the NetBeans project in `programmingassignment3 (1).zip`.

Coursework for a Java object-oriented programming course at Penn State.

## Tools

Java (classes, inheritance, polymorphism, ArrayList)

---

[Tisya Vaidya](https://tisyavaidya.com) · [LinkedIn](https://www.linkedin.com/in/tisya-vaidya/) · [GitHub](https://github.com/tisyavaidya)
