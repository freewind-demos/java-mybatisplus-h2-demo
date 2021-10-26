CREATE TABLE messages
(
    id       BIGINT NOT NULL auto_increment unique ,
    text     VARCHAR(25)    NOT NULL,
    CONSTRAINT pk_messages PRIMARY KEY (id)
);

ALTER TABLE messages
    ADD CONSTRAINT uc_messages_id UNIQUE (id);
