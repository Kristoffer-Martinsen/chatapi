CREATE TABLE if not exists messages (
  id integer,
  message varchar,
  user_id integer,
  created_at timestamp,
  updated_at timestamp,
  PRIMARY KEY (id)
);