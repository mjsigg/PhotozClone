create table if not exists photoz (
      id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
      file_name varchar(255),
      content_type varchar(255),
      data binary large object
);
--
-- CREATE TABLE IF NOT EXISTS PHOTOZ (
--     id BIGINT IDENTITY PRIMARY KEY,
--     file_name VARCHAR(255),
--     content_type VARCHAR(255),
--     data BINARY
--  );