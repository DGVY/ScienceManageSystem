/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : gxkygl

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2017-11-19 15:46:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_conclude_application
-- ----------------------------
DROP TABLE IF EXISTS `t_conclude_application`;
CREATE TABLE `t_conclude_application` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `applicant` varchar(255) COLLATE utf8_bin NOT NULL,
  `applicate_time` datetime NOT NULL,
  `back_information` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `project_completion` varchar(255) COLLATE utf8_bin NOT NULL,
  `project_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `project_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `status` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_conclude_application
-- ----------------------------

-- ----------------------------
-- Table structure for t_data_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `t_data_dictionary`;
CREATE TABLE `t_data_dictionary` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` varchar(50) COLLATE utf8_bin NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `type_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1g4o8s9q2vpyp2tftoyd6prfp` (`type_id`),
  CONSTRAINT `FK1g4o8s9q2vpyp2tftoyd6prfp` FOREIGN KEY (`type_id`) REFERENCES `t_data_dictionary_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_data_dictionary
-- ----------------------------
INSERT INTO `t_data_dictionary` VALUES ('2c93d0815fb9d27c015fb9d6b1850000', 'COLLEGE_ELECTRONIC', '电子商务学院', '402896b55f6c17a6015f6c2848610003');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f6c17a6015f6c1df4360001', 'PROJECTLEVEL_COMMON', '普通项目', '402896b55f6c17a6015f6c1cc3b10000');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f6c17a6015f6c1e351c0002', 'PROJECTLEVEL_KEY', '重点项目', '402896b55f6c17a6015f6c1cc3b10000');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f6c17a6015f6c2900f40004', 'COLLEGE_INFORMATION', '信息学院', '402896b55f6c17a6015f6c2848610003');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f6c17a6015f6c2976df0005', 'COLLEGE_DANCE', '舞蹈学院', '402896b55f6c17a6015f6c2848610003');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f6c17a6015f6c2b3b740007', 'ACHIEVEMENTTYPE_PAPER', '论文', '402896b55f6c17a6015f6c2a812c0006');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f6c17a6015f6c2b88810008', 'ACHIEVEMENTTYPE_ENTITY', '实体', '402896b55f6c17a6015f6c2a812c0006');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f75207b015f757817030002', 'SUBJECT_MATH', '数学', '402896b55f75207b015f757566e80000');
INSERT INTO `t_data_dictionary` VALUES ('402896b55f75207b015f757941b30003', 'SUBJECT_COMPUTER', '计算机', '402896b55f75207b015f757566e80000');

-- ----------------------------
-- Table structure for t_data_dictionary_type
-- ----------------------------
DROP TABLE IF EXISTS `t_data_dictionary_type`;
CREATE TABLE `t_data_dictionary_type` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` varchar(50) COLLATE utf8_bin NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_db5rt211jr732oscxmxjt1vu7` (`code`),
  UNIQUE KEY `UK_q0331knscty81fr5rq0s6bl1t` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_data_dictionary_type
-- ----------------------------
INSERT INTO `t_data_dictionary_type` VALUES ('402896b55f6c17a6015f6c1cc3b10000', 'PROJECTLEVEL', '项目等级');
INSERT INTO `t_data_dictionary_type` VALUES ('402896b55f6c17a6015f6c2848610003', 'COLLEGE', '学院');
INSERT INTO `t_data_dictionary_type` VALUES ('402896b55f6c17a6015f6c2a812c0006', 'ACHIEVEMENTTYPE', '项目结果类型');
INSERT INTO `t_data_dictionary_type` VALUES ('402896b55f75207b015f757566e80000', 'SUBJECT', '学科');

-- ----------------------------
-- Table structure for t_fund
-- ----------------------------
DROP TABLE IF EXISTS `t_fund`;
CREATE TABLE `t_fund` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `number` int(11) NOT NULL,
  `project_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `subject` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkrxr9g9y2oyst7x26ve7x59i5` (`project_id`),
  CONSTRAINT `FKkrxr9g9y2oyst7x26ve7x59i5` FOREIGN KEY (`project_id`) REFERENCES `t_project` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_fund
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `parent_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjpo0wq99a03xl6oxm1gcwmbol` (`parent_id`),
  CONSTRAINT `FKjpo0wq99a03xl6oxm1gcwmbol` FOREIGN KEY (`parent_id`) REFERENCES `t_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES ('2c93d0815fd2dff8015fd2e567140000', 'account:project:*', '项目管理', null, null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2dff8015fd2e5d64a0001', 'account:project:list', '项目列表', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2dff8015fd2e6830c0002', 'account:project:add', '项目添加', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2e800015fd2e86ac10000', 'account:project:delete', '项目删除', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2e800015fd2e8dbec0001', 'account:project:update', '项目编辑', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2e800015fd2e9e5850002', 'account:project:detail', '项目详情', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2e800015fd2ea2f730003', 'account:project:application', '项目申报', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd2e800015fd2eac2ba0004', 'account:project:conclude', '项目结题', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd3158d260000', 'account:project:updateApplication', '项目变更', '2c93d0815fd2dff8015fd2e567140000', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd318c55a0001', 'account:conclude:*', '结题管理', null, null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd31d8ab10002', 'account:conclude:list', '结题列表', '2c93d0815fd312d3015fd318c55a0001', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd3228bcc0003', 'account:conclude:detail', '申请详情', '2c93d0815fd312d3015fd318c55a0001', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd322c2df0004', 'account:conclude:pass', '申请通过', '2c93d0815fd312d3015fd318c55a0001', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd323341c0005', 'account:conclude:notpass', '申请驳回', '2c93d0815fd312d3015fd318c55a0001', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd32d2bf50006', 'account:application:*', '申报管理', null, null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd32dbe1d0007', 'account:application:list', '申报列表', '2c93d0815fd312d3015fd32d2bf50006', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd32ded5b0008', 'account:application:notpass', '申报驳回', '2c93d0815fd312d3015fd32d2bf50006', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd32e128a0009', 'account:application:pass', '申报通过', '2c93d0815fd312d3015fd32d2bf50006', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd32e3fbb000a', 'account:application:detail', '申报详情', '2c93d0815fd312d3015fd32d2bf50006', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd332d51c000b', 'account:projectUpdate:*', '变更管理', null, null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd3330443000c', 'account:projectUpdate:list', '变更列表', '2c93d0815fd312d3015fd332d51c000b', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd33334e5000d', 'account:projectUpdate:detail', '变更详情', '2c93d0815fd312d3015fd332d51c000b', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd3335c12000e', 'account:projectUpdate:pass', '变更通过', '2c93d0815fd312d3015fd332d51c000b', null);
INSERT INTO `t_permission` VALUES ('2c93d0815fd312d3015fd33397f4000f', 'account:projectUpdate:notpass', '变更驳回', '2c93d0815fd312d3015fd332d51c000b', null);
INSERT INTO `t_permission` VALUES ('4028862b5d987476015d987949820000', 'system:dataDictionary:*', '数据字典', null, null);
INSERT INTO `t_permission` VALUES ('ff8080815d4e9212015d4e9714cd0003', 'account:user:*', '用户管理', null, null);
INSERT INTO `t_permission` VALUES ('ff8080815d4e9212015d4e9796070004', 'account:user:add', '添加用户', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fc0e2015d4fd29cf00000', 'account:user:update', '修改用户', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fc0e2015d4fd2f59e0001', 'account:user:delete', '删除用户', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fd7244a0001', 'account:user:list', '用户列表', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fd7d96b0002', 'account:user:password', '修改密码', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fd919fd0004', 'account:user:status', '禁用启用用户', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fd9931d0005', 'account:user:permission', '分配权限', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fda70b50006', 'account:user:role', '分配角色', 'ff8080815d4e9212015d4e9714cd0003', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fdf6b450008', 'account:role:*', '角色管理', null, null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fdf99570009', 'account:role:add', '添加角色', 'ff8080815d4fd4d9015d4fdf6b450008', null);
INSERT INTO `t_permission` VALUES ('ff8080815d4fd4d9015d4fe03177000b', 'account:role:update', '修改角色', 'ff8080815d4fd4d9015d4fdf6b450008', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d511fa2410000', 'account:role:delete', '删除角色', 'ff8080815d4fd4d9015d4fdf6b450008', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d512057050001', 'account:role:list', '角色列表', 'ff8080815d4fd4d9015d4fdf6b450008', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d5120a1cd0002', 'account:permission:*', '权限管理', null, null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d512160c10003', 'account:permission:list', '权限列表', 'ff8080815d511dc6015d5120a1cd0002', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d51218d630004', 'account:permission:add', '添加权限', 'ff8080815d511dc6015d5120a1cd0002', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d5121cbe00005', 'account:permission:update', '修改权限', 'ff8080815d511dc6015d5120a1cd0002', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d51220fd70006', 'account:permission:delete', '删除权限', 'ff8080815d511dc6015d5120a1cd0002', null);
INSERT INTO `t_permission` VALUES ('ff8080815d511dc6015d51231c4a0007', 'account:role:permission', '角色分配权限', 'ff8080815d4fd4d9015d4fdf6b450008', null);
INSERT INTO `t_permission` VALUES ('ff8080815e6fecbf015e702a7afd0000', 'system:dictType:*', '类型', '4028862b5d987476015d987949820000', null);
INSERT INTO `t_permission` VALUES ('ff8080815e6fecbf015e702ac7790001', 'system:dictType:list', '列表', 'ff8080815e6fecbf015e702a7afd0000', null);
INSERT INTO `t_permission` VALUES ('ff8080815e6fecbf015e702d3e080002', 'system:dictType:add', '添加', 'ff8080815e6fecbf015e702a7afd0000', null);
INSERT INTO `t_permission` VALUES ('ff8080815e6fecbf015e702d84220003', 'system:dictType:update', '更新', 'ff8080815e6fecbf015e702a7afd0000', null);
INSERT INTO `t_permission` VALUES ('ff8080815e6fecbf015e702dabbd0004', 'system:dictType:delete', '删除', 'ff8080815e6fecbf015e702a7afd0000', null);
INSERT INTO `t_permission` VALUES ('ff8080815e6fecbf015e703174990005', 'system:dictDetail:*', '明细', '4028862b5d987476015d987949820000', null);
INSERT INTO `t_permission` VALUES ('ff8080815e703b3a015e703c3d310000', 'system:dictDetail:add', '添加', 'ff8080815e6fecbf015e703174990005', null);
INSERT INTO `t_permission` VALUES ('ff8080815e703b3a015e703c823b0001', 'system:dictDetail:delete', '删除', 'ff8080815e6fecbf015e703174990005', null);
INSERT INTO `t_permission` VALUES ('ff8080815e703b3a015e703cad8b0002', 'system:dictDetail:update', '修改', 'ff8080815e6fecbf015e703174990005', null);
INSERT INTO `t_permission` VALUES ('ff8080815e703b3a015e703cf71b0003', 'system:dictDetail:list', '列表', 'ff8080815e6fecbf015e703174990005', null);

-- ----------------------------
-- Table structure for t_project
-- ----------------------------
DROP TABLE IF EXISTS `t_project`;
CREATE TABLE `t_project` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `achievement_type` varchar(255) COLLATE utf8_bin NOT NULL,
  `begin_time` datetime NOT NULL,
  `can_application` bit(1) DEFAULT NULL,
  `can_conclude` bit(1) DEFAULT NULL,
  `can_update` bit(1) DEFAULT NULL,
  `college` varchar(255) COLLATE utf8_bin NOT NULL,
  `created_user` varchar(255) COLLATE utf8_bin NOT NULL,
  `economic_analysis` varchar(255) COLLATE utf8_bin NOT NULL,
  `existing_conditions` varchar(255) COLLATE utf8_bin NOT NULL,
  `expected_result` varchar(255) COLLATE utf8_bin NOT NULL,
  `level` varchar(255) COLLATE utf8_bin NOT NULL,
  `member_jsons` varchar(255) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `purpose` varchar(255) COLLATE utf8_bin NOT NULL,
  `status` int(11) NOT NULL,
  `subject` varchar(255) COLLATE utf8_bin NOT NULL,
  `user_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `viable_analysis` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_project
-- ----------------------------

-- ----------------------------
-- Table structure for t_project_application
-- ----------------------------
DROP TABLE IF EXISTS `t_project_application`;
CREATE TABLE `t_project_application` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `applicant` varchar(255) COLLATE utf8_bin NOT NULL,
  `applicate_time` datetime NOT NULL,
  `back_information` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `project_description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `project_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `project_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `status` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_project_application
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_bkpm7njy2ort1yoiddc7jg8gj` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `permission_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `role_id` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for t_update_application
-- ----------------------------
DROP TABLE IF EXISTS `t_update_application`;
CREATE TABLE `t_update_application` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `applicant` varchar(255) COLLATE utf8_bin NOT NULL,
  `applicate_time` datetime NOT NULL,
  `back_information` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `project_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `project_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `status` varchar(255) COLLATE utf8_bin NOT NULL,
  `update_description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_update_application
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `card` varchar(18) COLLATE utf8_bin DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `password` varchar(100) COLLATE utf8_bin NOT NULL,
  `phone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `realname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `salt` varchar(255) COLLATE utf8_bin NOT NULL,
  `state` varchar(255) COLLATE utf8_bin NOT NULL,
  `type` varchar(255) COLLATE utf8_bin NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `college` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_g8gqk4e142wekcb1t6d3v2mwx` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('402896ca5f38db72015f38dc28640000', '11111', '2017-10-20 16:17:53', 'e729b0114195e2e6e9a1a91e6b36f5ac', '11111', '11111', '737159ce79c4ce87142800b104511899', '1', 'admin', 'admin', null);

-- ----------------------------
-- Table structure for t_user_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_user_permission`;
CREATE TABLE `t_user_permission` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `permission_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `user_id` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user_permission
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `role_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `user_id` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
