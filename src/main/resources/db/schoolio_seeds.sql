DELETE FROM users;

DELETE FROM announcements;

INSERT INTO users(id, name,email, age, distrito, concelho, freguesia)
VALUES(1, "Nuno", "nuno@schoolio.com", 20, "Lisboa", "Cascais", "Bicesse"),
      (2, "João", "joao@schoolio.com", 30, "Lisboa", "", ""),
      (3, "Catarina", "catarina@schoolio.com", 31, "Lisboa", "", ""),
      (4, "Rodolfo", "rodolfo@schoolio.com", 27, "Terceira", "", "");

INSERT INTO announcements(id, name, description, user_id)
VALUES(1, "Lápis", "Caixa de Lápis fechada da bic", 2),
      (2, "Estojo", "Estojo do Lightning McQueen em estado perfeito", 1),
      (3, "Compasso", "", 4),
      (4, "Canetas", "Canetas 4 cores nunca usadas", 3);