CREATE TABLE orders(
    id              BIGINT NOT NULL PRIMARY KEY,
    external_id     VARCHAR(26) NOT NULL,
    product_id      VARCHAR(26),
    origin_system   VARCHAR(50) NOT NULL,
    value           FLOAT NOT NULL,
    quantity        INT,
    status          VARCHAR(50),
    payment_id      BIGINT,
    created_at      TIMESTAMP NOT NULL
);

CREATE TABLE payments(
    id          BIGINT NOT NULL PRIMARY KEY,
    external_id VARCHAR(26),
    paid_value  FLOAT NOT NULL,
    currency    VARCHAR(6) NOT NULL
);