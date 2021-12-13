CREATE TABLE IF NOT EXISTS `t_project` (
    `id` bigint primary key auto_increment comment '主键',
    `name` varchar(20) not null comment '项目名称',
    `owner` varchar(200) comment '所有者',
    `modified_by` varchar(200) comment '修改者',
    `created_at` datetime comment '创建时间',
    `updated_at` datetime comment '修改时间',
    unique key `pm` (`name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;