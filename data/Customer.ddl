create table Customer (
  customerId INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
  firstName VARCHAR(25) NOT NULL,
  lastName VARCHAR(25) NOT NULL,
  phoneNumber VARCHAR(20) NOT NULL,
  email VARCHAR(40) NOT NULL
);