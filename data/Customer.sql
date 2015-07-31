--DELETE FROM Customer;

INSERT INTO Customer (firstName, lastName, phoneNumber, email)
  VALUES ('Harry', 'Potter', '+44 02065551212', 'harry@hogwarts.ac.uk');
INSERT INTO Customer (firstName, lastName, phoneNumber, email)
  VALUES ('Ron', 'Weasley', '+44 02065551213', 'ron@hogwarts.ac.uk');
INSERT INTO Customer (firstName, lastName, phoneNumber, email)
  VALUES ('Hermione', 'Granger', '+44 02065551214', 'hermione@hogwarts.ac.uk');

SELECT * FROM Customer;  