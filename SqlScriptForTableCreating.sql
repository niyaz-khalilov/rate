CREATE TABLE Banks
(
    id   bigint primary key GENERATED ALWAYS AS IDENTITY,
    name varchar(30) not null UNIQUE
);

CREATE TABLE People
(
    id          bigint primary key GENERATED ALWAYS AS IDENTITY,
    name        varchar(30) not null,
    surname     varchar(30) not null,
    password    text        not null,
    email       varchar(30) not null UNIQUE,
    dateOfBirth date        not null
);

CREATE TABLE Currencies
(
    id   bigint primary key GENERATED ALWAYS AS IDENTITY,
    name varchar(8) not null unique
);

CREATE table RatesOfBanks
(
    id              bigint primary key GENERATED ALWAYS AS IDENTITY,
    currencyId      bigint references Currencies (id) ON delete CASCADE ON update cascade,
    bankId          bigint references Banks (id) ON delete CASCADE ON update cascade,
    purchasePrice   float8,
    sellingPrice    float8,
    measurementTime timestamp,
    unique (currencyId, bankId)
);

Create table BanksOfPeople
(
    personId bigint references People (id) ON delete CASCADE ON update cascade,
    bankId   bigint references Banks (id) ON delete CASCADE ON update cascade,
    unique (personId, bankId)
);

Create table CurrenciesOfPeople
(
    personId   bigint references People (id) ON delete CASCADE ON update cascade,
    currencyId bigint references Currencies (id) ON delete CASCADE ON update cascade,
    unique (personId, currencyId)
)