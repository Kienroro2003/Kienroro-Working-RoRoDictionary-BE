USE RoRoDictionary;
INSERT INTO word (`word`, `word_scraping`, `meaning_translate`, `meaning_scraping`, `pronoun`, `flag_used`, `id`)
VALUES ("Hello", "Hello", "xin chao", "xin chao", "helou", "YES", 1);
INSERT INTO word (`word`, `word_scraping`, `meaning_translate`, `meaning_scraping`, `pronoun`, `flag_used`, `id`)
VALUES ("bye", "bye", "tam biet", "tam biet", "bei", "YES", 2);
INSERT INTO word (`word`, `word_scraping`, `meaning_translate`, `meaning_scraping`, `pronoun`, `flag_used`, `id`)
VALUES ("good", "good", "tot", "tot", "goud", "YES", 3);
INSERT INTO word (`word`, `word_scraping`, `meaning_translate`, `meaning_scraping`, `pronoun`, `flag_used`, `id`)
VALUES ("bad", "bad", "xau", "xau", "baed", "YES", 4);
INSERT INTO word (`word`, `word_scraping`, `meaning_translate`, `meaning_scraping`, `pronoun`, `flag_used`, `id`)
VALUES ("play", "play", "choi", "choi", "plei", "YES", 5);

INSERT INTO `type` (`name_type`, `id`)
VALUES ("Adj", 1);
INSERT INTO `type` (`name_type`, `id`)
VALUES ("Verb", 2);
INSERT INTO `type` (`name_type`, `id`)
VALUES ("Noun", 3);

INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (1, 3);
INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (1, 2);
INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (2, 1);
INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (2, 2);
INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (3, 1);
INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (4, 1);
INSERT INTO `word_type` (`word_id`, `type_id`)
VALUES (5, 2);