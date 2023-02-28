## Big Decimals

- An immutable, used over the `double` type when precision is really really important

- Not all decimals can be represented using `double` type accurately

- Some objects can lose precision with double and cause unexpected behavior while performing arithmetic operations

###### Issue with `double`

```java
double x = 0.1;
double y = 0.2;

System.out.print(x + y); // 0.30000000000000004
```

- `Big Decimal` object can be used to fix such precision issues
- Make sure to use the constructor that expects a _String_ to ensure value is represented exactly in the object and the above issue doesn't repeat

###### Fix with `BigDecimal`

```java
BigDecimal x = new BigDecimal("0.1");
BigDecimal y = new BigDecimal("0.2");

System.out.print(x.add(y)); // 0.3
```

#### When to use Big Decimal?

- In fields such as _data analysis_, _engineering_, _finance_, precision is really important
- Use `BigDecimal` where data is very sensitive and precision matters
