-- start standalone

create table restaurant (
    id bigint(20) PRIMARY KEY,
    name varchar(500) NOT NULL,
    cuisines varchar(500) NOT NULL,
    cost decimal(6,2) NOT NULL,
    currency_name varchar(100) NOT NULL,
    currency_symbol varchar(10) NOT NULL,
    has_table_booking tinyint(1) NOT NULL,
    has_online_delivery tinyint(1) NOT NULL,
    aggregate_rating decimal(4,2) NOT NULL,
    rating_color varchar(50) NOT NULL,
    rating_text varchar(50) NOT NULL,
    votes bigint(20) NOT NULL,
    createdat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deletedat DATETIME DEFAULT NULL
);


create table restaurant_address (
    id bigint(20) PRIMARY KEY AUTO_INCREMENT,
    country_code bigint(10) NOT NULL,
    city varchar(100) NOT NULL,
    address text NOT NULL,
    locality text NOT NULL,
    locality_verbose text NOT NULL,
    longitude decimal(18,12) NOT NULL,
    latitude decimal(18,12) NOT NULL,
    restaurant_id bigint(20) NOT NULL,
    createdat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deletedat DATETIME DEFAULT NULL,
    CONSTRAINT `restaurant_id_fk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
);


-- end standalone




