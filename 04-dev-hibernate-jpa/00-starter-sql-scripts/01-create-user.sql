-- Drop user first if they exist
DROP USER if exists 'iamsidh'@'%' ;

-- Now create user with prop privileges
CREATE USER 'iamsidh'@'%' IDENTIFIED BY 'iamsidh';

GRANT ALL PRIVILEGES ON * . * TO 'iamsidh'@'%';