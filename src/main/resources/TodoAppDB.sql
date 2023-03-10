CREATE DATABASE TodoApp DEFAULT CHARACTER SET UTF8MB4 COLLATE UTF8MB4_UNICODE_CI;

USE TodoApp;

CREATE TABLE `todo_list` (
    list_id VARCHAR(10) NOT NULL,
    list_name VARCHAR(128) NOT NULL,
    list_completed_datetime TIMESTAMP DEFAULT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (list_id)
);

CREATE TABLE `todo_task` (
    task_id VARCHAR(15) NOT NULL,
    list_id VARCHAR(10) NOT NULL,
    task_name VARCHAR(192) NOT NULL,
    task_important_flag BOOLEAN NOT NULL DEFAULT FALSE,
    task_deadline TIMESTAMP DEFAULT NULL,
    task_complete_percent TINYINT NOT NULL DEFAULT 0
            CHECK (task_complete_percent >= 0 AND task_complete_percent <= 100),
    task_completed_datetime TIMESTAMP DEFAULT NULL,
    task_note VARCHAR(512) DEFAULT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (task_id),
    CONSTRAINT fk_task
            FOREIGN KEY (list_id) REFERENCES `todo_list`(list_id)
);

CREATE TABLE `gen_master` (
    gen_id VARCHAR(8),
    gen_cd VARCHAR(8),
    gen_name VARCHAR(60) NOT NULL,
    gen_value VARCHAR(20) NOT NULL,
    gen_note VARCHAR(256) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (gen_id, gen_cd)
);