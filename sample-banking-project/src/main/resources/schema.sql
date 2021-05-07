CREATE TABLE account (
    number BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(10) NOT NULL,
    balance_date DATE NOT NULL,
    currency VARCHAR(10) NOT NULL,
    balance DOUBLE(10,2) NOT NULL
);
CREATE TABLE transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_number BIGINT,
    date DATE NOT NULL,
    type VARCHAR(10) NOT NULL,
    currency VARCHAR(10) NOT NULL,
    credit_amount DOUBLE(10,2),
    debit_amount DOUBLE(10,2),
    narrative VARCHAR(100)
);
ALTER TABLE transaction ADD FOREIGN KEY (account_number) REFERENCES account(number);