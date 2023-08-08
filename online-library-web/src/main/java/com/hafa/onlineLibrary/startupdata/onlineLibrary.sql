INSERT INTO `onlineLibrary`.`book`
(`id`,
 `description`,
 `isbn`,
 `name`,
 `price`,
 `print_date`,
 `author_id`,
 `customer_id`)
VALUES
    (<{id: }>,
        <{description: }>,
        <{isbn: }>,
        <{name: }>,
        <{price: }>,
        <{print_date: }>,
        <{author_id: }>,
        <{customer_id: }>);


INSERT INTO `onlineLibrary`.`author`
(`id`,
 `first_name`,
 `last_name`,
 `birth_date`)
VALUES
    (<{id: }>,
        <{first_name: }>,
        <{last_name: }>,
        <{birth_date: }>);


INSERT INTO `onlineLibrary`.`customer`
(`id`,
 `first_name`,
 `last_name`,
 `address`,
 `phone_number`)
VALUES
    (<{id: }>,
        <{first_name: }>,
        <{last_name: }>,
        <{address: }>,
        <{phone_number: }>);
