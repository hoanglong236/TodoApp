CREATE DATABASE TodoApp DEFAULT CHARACTER SET UTF8MB4 COLLATE UTF8MB4_UNICODE_CI;

USE TodoApp;

CREATE TABLE `task` (
	task_id VARCHAR(10),
    task_name VARCHAR(256) NOT NULL,
    task_deadline TIMESTAMP,
    task_submit_datetime TIMESTAMP,
    task_complete_status BOOLEAN NOT NULL DEFAULT FALSE,
    task_created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    task_updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (task_id)
);

CREATE TABLE `sub_task` (
	sub_task_id VARCHAR(15),
    task_id VARCHAR(10) NOT NULL,
    sub_task_name VARCHAR(256) NOT NULL,
    sub_task_deadline TIMESTAMP,
    sub_task_complete_percent TINYINT NOT NULL DEFAULT 0 
			CHECK (sub_task_complete_percent >= 0 AND sub_task_complete_percent <= 100),
    sub_task_important BOOLEAN NOT NULL DEFAULT FALSE,
    sub_task_created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    sub_task_updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (sub_task_id)
);

CREATE TABLE `gen_master` (
	gen_id VARCHAR(5),
    gen_cd VARCHAR(5),
    gen_name VARCHAR(50) NOT NULL,
    gen_value VARCHAR(15) NOT NULL,
    gen_note VARCHAR(256) NOT NULL,
    gen_created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    gen_updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (gen_id, gen_cd)
);