insert into account(number, name, type, balance_date, currency, balance)
values
(
    585309209,
    'SGSavings726',
    'Savings',
    current_date(),
    'SGD',
    84327.51
);
insert into account(number, name, type, balance_date, currency, balance)
values
(
    791066619,
    'AUSavings933',
    'Savings',
    current_date(),
    'AUD',
    88005.93
);
 insert into account(number, name, type, balance_date, currency, balance)
 values
 (
     1232223212,
     'SGCurrent166',
     'Current',
     current_date(),
     'SGD',
     38010.62
 );
insert into transaction(id, account_number, date, type, currency, credit_amount, debit_amount, narrative)
values (
    8765,
    1232223212,
    current_date(),
    'Credit',
    'SGD',
    9540.98,
    0,
    'transaction one'
);
insert into transaction(id, account_number, date, type, currency, credit_amount, debit_amount, narrative)
values
(
    8766,
    1232223212,
    current_date(),
    'Credit',
    'SGD',
    7497.82,
    0,
    'transaction two'
);
insert into transaction(id, account_number, date, type, currency, credit_amount, debit_amount, narrative)
values
(
    8767,
    1232223212,
    current_date(),
    'Debit',
    'SGD',
    0,
    9812.5,
    'transaction three'
);
insert into transaction(id, account_number, date, type, currency, credit_amount, debit_amount, narrative)
values
(
    8768,
    791066619,
    current_date(),
    'Debit',
    'AUD',
    0,
    347.91,
    'transaction one'
);
insert into transaction(id, account_number, date, type, currency, credit_amount, debit_amount, narrative)
values
(
    8769,
    585309209,
    current_date(),
    'Credit',
    'AUD',
    519.37,
    0,
    'transaction one'
);