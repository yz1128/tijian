/*
 Navicat Premium Dump SQL

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80036 (8.0.36)
 Source Host           : localhost:3306
 Source Schema         : tijian

 Target Server Type    : MySQL
 Target Server Version : 80036 (8.0.36)
 File Encoding         : 65001

 Date: 10/09/2025 18:33:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for checkitem
-- ----------------------------
DROP TABLE IF EXISTS `checkitem`;
CREATE TABLE `checkitem`  (
  `ciId` int NOT NULL AUTO_INCREMENT COMMENT '检查项编号',
  `ciName` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '检查项名称',
  `ciContent` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '检查项内容',
  `meaning` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项意义',
  `remarks` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ciId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for checkitemdetailed
-- ----------------------------
DROP TABLE IF EXISTS `checkitemdetailed`;
CREATE TABLE `checkitemdetailed`  (
  `cdId` int NOT NULL AUTO_INCREMENT COMMENT '检查项明细编号',
  `name` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '检查项细明名称',
  `unit` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项明细单位',
  `minrange` double NULL DEFAULT NULL COMMENT '检查项细明正常值范围中的最小值',
  `maxrange` double NULL DEFAULT NULL COMMENT '检查项细明正常值范围中的最大值',
  `normalValue` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项细明正常值（非数字型）',
  `normalValueString` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项验证范围说明文字',
  `type` int NOT NULL DEFAULT 1 COMMENT '检查项明细类型（1：数值围范验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）',
  `ciId` int NOT NULL COMMENT '所属检查项编号',
  `remarks` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cdId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cidetailedreport
-- ----------------------------
DROP TABLE IF EXISTS `cidetailedreport`;
CREATE TABLE `cidetailedreport`  (
  `cidrId` int NOT NULL AUTO_INCREMENT COMMENT '检查项明细报告主键',
  `name` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '检查项明细名称',
  `unit` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项明细单位',
  `minrange` double NULL DEFAULT NULL COMMENT '检查项细明正常值范围中的最小值',
  `maxrange` double NULL DEFAULT NULL COMMENT '检查项细明正常值范围中的最大值',
  `normalValue` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项细明正常值（非数字型）',
  `normalValueString` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项验证范围说明文字',
  `type` int NOT NULL DEFAULT 1 COMMENT '检查项明细类型（1：数值范围验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）',
  `value` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '检查项目明细值',
  `isError` int NOT NULL DEFAULT 0 COMMENT '此项是否异常（0：无异常；1：异常）',
  `ciId` int NOT NULL COMMENT '所属检查项报告编号',
  `orderId` int NOT NULL COMMENT '所属预约编号',
  PRIMARY KEY (`cidrId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 160 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cireport
-- ----------------------------
DROP TABLE IF EXISTS `cireport`;
CREATE TABLE `cireport`  (
  `cirId` int NOT NULL AUTO_INCREMENT COMMENT '检查项报告主键',
  `ciId` int NOT NULL COMMENT '检查项编号',
  `ciName` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '检查项名称',
  `orderId` int NOT NULL COMMENT '所属预约编号',
  PRIMARY KEY (`cirId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor`  (
  `docId` int NOT NULL AUTO_INCREMENT COMMENT '医生编号',
  `docCode` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医生编码',
  `realName` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '真实姓名',
  `password` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `sex` int NOT NULL COMMENT '性别',
  `deptno` int NOT NULL COMMENT '所属科室（1：检验科；2：内科；3：外科）',
  PRIMARY KEY (`docId`) USING BTREE,
  UNIQUE INDEX `docCode`(`docCode` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hospital
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital`  (
  `hpId` int NOT NULL AUTO_INCREMENT COMMENT '医院编号',
  `name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医院名称',
  `picture` mediumtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医院图片',
  `telephone` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医院电话',
  `address` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医院地址',
  `businessHours` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '营业时间',
  `deadline` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '采血截止时间',
  `rule` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '预约人数规则',
  `state` int NOT NULL COMMENT '医院状态（1：正常；2：其他）',
  PRIMARY KEY (`hpId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `orderId` int NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `orderDate` date NOT NULL COMMENT '预约日期',
  `userId` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '客户编号',
  `hpId` int NOT NULL COMMENT '所属医院编号',
  `smId` int NOT NULL COMMENT '所属套餐编号',
  `state` int NOT NULL DEFAULT 1 COMMENT '订单状态（1：未归档；2：已归档）',
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100569837 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for overallresult
-- ----------------------------
DROP TABLE IF EXISTS `overallresult`;
CREATE TABLE `overallresult`  (
  `orId` int NOT NULL AUTO_INCREMENT COMMENT '总检结论项编号',
  `title` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '总检结论项标题',
  `content` varchar(400) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '总检结论项内容',
  `orderId` int NOT NULL COMMENT '所属预约编号',
  PRIMARY KEY (`orId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for setmeal
-- ----------------------------
DROP TABLE IF EXISTS `setmeal`;
CREATE TABLE `setmeal`  (
  `smId` int NOT NULL AUTO_INCREMENT COMMENT '套餐编号',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '套餐名称',
  `type` int NOT NULL COMMENT '套餐类型（1：男士餐套；0：女士套餐）',
  `price` int NOT NULL COMMENT '套餐价格',
  PRIMARY KEY (`smId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for setmealdetailed
-- ----------------------------
DROP TABLE IF EXISTS `setmealdetailed`;
CREATE TABLE `setmealdetailed`  (
  `sdId` int NOT NULL AUTO_INCREMENT COMMENT '套餐明细编号（无意义主键）',
  `smId` int NOT NULL COMMENT '套餐编号',
  `ciId` int NOT NULL COMMENT '检查项编号',
  PRIMARY KEY (`sdId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `userId` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户编号（手机号码）',
  `password` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `realName` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '真实姓名',
  `sex` int NOT NULL COMMENT '用户性别（1：男；0女）',
  `identityCard` varchar(18) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '身份证号',
  `birthday` date NOT NULL COMMENT '出生日期',
  `userType` int NOT NULL COMMENT '用户类型（1：普通用户；2：东软内部员工；3：其他）',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- View structure for v_orders
-- ----------------------------
DROP VIEW IF EXISTS `v_orders`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_orders` AS select `orders`.`orderId` AS `orderId`,`orders`.`orderDate` AS `orderDate`,`orders`.`userId` AS `userId`,`orders`.`hpId` AS `hpId`,`orders`.`smId` AS `smId`,`orders`.`state` AS `state`,`users`.`realName` AS `realName`,`users`.`sex` AS `sex`,`users`.`identityCard` AS `identityCard`,`setmeal`.`name` AS `setmealName`,`setmeal`.`type` AS `type`,`setmeal`.`price` AS `price`,`hospital`.`name` AS `hospitalName`,`hospital`.`picture` AS `picture`,`hospital`.`telephone` AS `telephone`,`hospital`.`address` AS `address`,`hospital`.`businessHours` AS `businessHours` from (((`orders` join `users` on((`orders`.`userId` = `users`.`userId`))) join `setmeal` on((`orders`.`smId` = `setmeal`.`smId`))) join `hospital` on((`orders`.`hpId` = `hospital`.`hpId`)));

SET FOREIGN_KEY_CHECKS = 1;
