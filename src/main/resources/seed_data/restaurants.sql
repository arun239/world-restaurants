INSERT INTO `restaurant` (`id`, `name`, `cuisines`, `cost`, `currency_name`, `currency_symbol`, `has_table_booking`, `has_online_delivery`, `aggregate_rating`, `rating_color`, `rating_text`, `votes`, `createdat`, `updatedat`, `deletedat`)
VALUES
    (6317637, 'Le Petit Souffle', 'French, Japanese, Desserts', 1100.00, 'Botswana Pula(P)', '(P)', 1, 0, 4.80, 'Dark Green', 'Excellent', 314, '2019-03-24 17:36:18', '2019-03-24 17:36:18', NULL),
    (6304287, 'Izakaya Kikufuji', 'Japanese', 1200, 'Botswana Pula(P)', '(P)',1, 0, 4.5, 'Dark Green', 'Excellent', 591, '2019-03-24 17:36:18', '2019-03-24 17:36:18', NULL),
    (6300002, 'Heat - Edsa Shangri-La', 'Seafood, Asian, Filipino, Indian', 4000, 'Botswana Pula(P)', '(P)',1, 0, 4.4, 'Green', 'Very Good', 270, '2019-03-24 17:36:18', '2019-03-24 17:36:18', NULL),
    (6318506, 'Ooma', 'Japanese, Sushi', 1500, 'Botswana Pula(P)', '(P)', 0, 0, 4.9, 'Dark Green', 'Excellent', 365, '2019-03-24 17:36:18', '2019-03-24 17:36:18', NULL),
    (6600681, 'Chez Michou', 'Fast Food, French', 55, 'Brazilian Real(R$)', '(R$)',0, 0, 3, 'Orange', 'Average', 6, '2019-03-24 17:36:18', '2019-03-24 17:36:18', NULL),
    (17284203, 'BJs Country Buffet    American', 'BBQ', 10, 'Dollar($)', '($)',0, 0, 3.3, 'Orange', 'Average', 25, '2019-03-24 17:36:18', '2019-03-24 17:36:18', NULL);




INSERT INTO `restaurant_address` (`id`, `country_code`, `city`, `address`, `locality`, `locality_verbose`, `longitude`, `latitude`, `restaurant_id`, `createdat`, `updatedat`, `deletedat`)
VALUES
    (1, 162, 'Makati City', 'Third Floor, Century City Mall, Kalayaan Avenue, Poblacion, Makati City', 'Century City Mall, Poblacion, Makati City', 'Century City Mall, Poblacion, Makati City, Makati City', 121.027535, 14.565443, 6317637, '2019-03-24 17:53:27', '2019-03-24 17:53:27', NULL),

    (2, 162, 'Makati City', 'Little Tokyo, 2277 Chino Roces Avenue, Legaspi Village, Makati City, Little Tokyo, Legaspi Village, Makati City', 'Century City Mall, Poblacion, Makati City', 'Little Tokyo, Legaspi Village, Makati City, Makati City', 121.014101, 14.553708, 6304287, '2019-03-24 17:53:27', '2019-03-24 17:53:27', NULL),

    (3, 162, 'Mandaluyong City', 'Edsa Shangri-La, 1 Garden Way, Ortigas, Mandaluyong City', 'Edsa Shangri-La, Ortigas, Mandaluyong City', 'Edsa Shangri-La, Ortigas, Mandaluyong City, Mandaluyong City', 121.056831, 14.581404, 6300002, '2019-03-24 17:53:27', '2019-03-24 17:53:27', NULL),


    (4, 162, 'Mandaluyong City', 'Third Floor, Mega Fashion Hall, SM Megamall, Ortigas, Mandaluyong City', 'SM Megamall, Ortigas, Mandaluyong City', 'SM Megamall, Ortigas, Mandaluyong City, Mandaluyong City', 121.056475, 14.585318, 6318506, '2019-03-24 17:53:27', '2019-03-24 17:53:27', NULL),


    (5, 30, 'Braslia', 'SLNC, 208, Bloco A, Loja 30, Asa Norte, Braslia', 'Asa Norte', 'Asa Norte, Braslia', -47.88178889, -15.76414167, 6600681, '2019-03-24 17:53:27', '2019-03-24 17:53:27', NULL),

    (6, 216, 'Albany', '2401 Dawson Rd, Albany, GA 31707', 'Albany', 'Albany, Albany', -84.207095, 31.608743, 17284203, '2019-03-24 17:53:27', '2019-03-24 17:53:27', NULL);