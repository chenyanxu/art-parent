
-- add 用户信息-企业和学生各两个测试用户
INSERT INTO "public"."sys_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "available", "email", "icon", "logindate", "loginip", "loginname", "mobile", "name", "password", "phone", "sex", "code", "position", "usertype")
  VALUES ('780', NULL, NULL, NULL, NULL, NULL, NULL, '1', 'testenterprise@qq.com', NULL, NULL, NULL, 'qy001', '13145678901', '测试企业1', 'ICy5YqxZB1uWSwcVLSNLcA==', '88888881', '', 'qy001', NULL, '3');
INSERT INTO "public"."sys_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "available", "email", "icon", "logindate", "loginip", "loginname", "mobile", "name", "password", "phone", "sex", "code", "position", "usertype")
  VALUES ('781', NULL, NULL, NULL, NULL, NULL, NULL, '1', 'testenterprise@qq.com', NULL, NULL, NULL, 'qy002', '13145678902', '测试企业2', 'ICy5YqxZB1uWSwcVLSNLcA==', '88888882', '', 'qy002', NULL, '3');

INSERT INTO "public"."sys_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "available", "email", "icon", "logindate", "loginip", "loginname", "mobile", "name", "password", "phone", "sex", "code", "position", "usertype")
  VALUES ('782', NULL, NULL, NULL, NULL, NULL, NULL, '1', 'teststudent@qq.com', NULL, NULL, NULL, 'xs001', '13145678903', '测试学生1', 'ICy5YqxZB1uWSwcVLSNLcA==', '', '男', 'xs001', NULL, '1');
INSERT INTO "public"."sys_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "available", "email", "icon", "logindate", "loginip", "loginname", "mobile", "name", "password", "phone", "sex", "code", "position", "usertype")
  VALUES ('783', NULL, NULL, NULL, NULL, NULL, NULL, '1', 'teststudent@qq.com', NULL, NULL, NULL, 'xs002', '13145678904', '测试学生2', 'ICy5YqxZB1uWSwcVLSNLcA==', '', '男', 'xs002', NULL, '1');


-- add 用户授权（测试用户赋予角色）
INSERT INTO "public"."sys_role_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "roleid", "userid")
  VALUES ('110800', NULL, NULL, NULL, NULL, NULL, '2018-03-09 07:47:41', '702', '780');
INSERT INTO "public"."sys_role_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "roleid", "userid")
  VALUES ('110801',NULL, NULL, NULL, NULL, NULL, '2018-03-09 07:47:41', '702', '781');
INSERT INTO "public"."sys_role_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "roleid", "userid")
  VALUES ('110802',NULL, NULL, NULL, NULL, NULL, '2018-03-09 07:47:41', '703', '782');
INSERT INTO "public"."sys_role_user" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "roleid", "userid")
  VALUES ('110803',NULL, NULL, NULL, NULL, NULL, '2018-03-09 07:47:41', '703', '783');


-- add 企业详细信息
DELETE FROM public.art_enterprise;

INSERT INTO "public"."art_enterprise" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "address", "city", "code", "email", "industry", "life", "mobile", "name", "nature", "phone", "region", "scale")
  VALUES ('1', '测试企业1', '780', '2018-07-25 09:16:32', '测试企业1', '780', '2018-07-25 09:43:28.514', '解放大路5888号', '长春市', 'qy001', '1', '1', '5年', '1', '测试企业1', '1', '1', '22', '100-200人');

INSERT INTO "public"."art_enterprise" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "address", "city", "code", "email", "industry", "life", "mobile", "name", "nature", "phone", "region", "scale")
  VALUES ('2', '测试企业2', '781', '2018-07-25 16:22:32', '测试企业2', '781', '2018-07-25 16:22:32.557', '人民大街8888号', '长春市', 'qy002', '456', '6', '20年', '456', '测试企业2', '2', '456', '22', '300-500人');


-- add 企业招聘信息
DELETE FROM public.art_recruit;

INSERT INTO "public"."art_recruit" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "appliedtechnology", "city", "enterpriseaddress", "enterprisecity", "enterprisecode", "enterpriseemail", "enterpriseindustry", "enterpriselife", "enterprisemobile", "enterprisename", "enterprisenature", "enterprisephone", "enterpriseregion", "enterprisescale", "education", "functioncategoryid", "jobnumbers", "jobtype", "personrequires", "position", "positionrequires", "probationsalary", "publishdate", "region", "requiresofts", "salary")
  VALUES ('301', '测试企业1', '780', '2018-03-21 15:18:29.078', '测试企业1', '780', '2018-03-21 15:18:29.064', NULL, '长春市', '解放大路5888号', '长春市', 'qy001', 'testenterprise@qq.com', '1', '5年', '13145678901', '测试企业1', '1', '88888881', '22', '100-200 人', '2', '31', '2', '0', '1,3,5,6,7', '广告策划', '要求1，要求2，要求3', '2', '2018-03-21 00:00:00', '22', '软件1，软件2', '4');

INSERT INTO "public"."art_recruit" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "appliedtechnology", "city", "enterpriseaddress", "enterprisecity", "enterprisecode", "enterpriseemail", "enterpriseindustry", "enterpriselife", "enterprisemobile", "enterprisename", "enterprisenature", "enterprisephone", "enterpriseregion", "enterprisescale", "education", "functioncategoryid", "jobnumbers", "jobtype", "personrequires", "position", "positionrequires", "probationsalary", "publishdate", "region", "requiresofts", "salary")
  VALUES ('302', '测试企业2', '781', '2018-03-21 15:20:57.285', '测试企业2', '781', '2018-03-21 15:20:57.273', NULL, '长春', '人民大街8888号', '长春市', 'qy002', 'testenterprise@qq.com', '6', '20年', '13145678902', '测试企业2', '2', '88888882', '22', '300-500人', '2', '5', '3', '0', '5,3,1,2,11', '岗位1', '要求1，要求2', '2', '2018-03-21 00:00:00', '22', '软件1，软件2', '4');
INSERT INTO "public"."art_recruit" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "appliedtechnology", "city", "enterpriseaddress", "enterprisecity", "enterprisecode", "enterpriseemail", "enterpriseindustry", "enterpriselife", "enterprisemobile", "enterprisename", "enterprisenature", "enterprisephone", "enterpriseregion", "enterprisescale", "education", "functioncategoryid", "jobnumbers", "jobtype", "personrequires", "position", "positionrequires", "probationsalary", "publishdate", "region", "requiresofts", "salary")
  VALUES ('303', '测试企业2', '781', '2018-03-21 15:22:17.21', '测试企业2', '781', '2018-03-21 15:22:17.199', NULL, '长春', '人民大街8888号', '长春市', 'qy002', 'testenterprise@qq.com', '6', '20年', '13145678902', '测试企业2', '2', '88888882', '22', '300-500人', '2', '53', '2', '0', '0,1,2,4,6,12', '软件工程师', '要求1，要求2，要求3', '3', '2018-03-21 00:00:00', '22', '软件1', '5');


-- add 学生详细信息
INSERT INTO "public"."general_person_student" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "address", "birthday", "classid", "code", "email", "entranceyear", "homephone", "identificationcard", "instructor", "joinpartydate", "majorid", "mobile", "name", "nation", "period", "phone", "placeoforigin", "politicalstatus", "postalcode", "province", "sex", "traininglevel")
  VALUES ('109959', '测试学生1', '782', '2018-07-26 14:16:25', '测试学生1', '782', '2018-07-26 14:16:25', '北京市瀛海镇四海三村北十条8号院', '1994-08-10 00:00:00', NULL, 'xs001', '222', '2012-01-01 00:00:00', '222', '222', '刘微', '2018-07-30 00:00:00', NULL, '222', '测试学生1', '汉族', '4年', '222', '北京市', '共青团员', '100176', '11', '1', '本科');
-- classname='2014级三维特效2班'

-- add 学生应聘信息
DELETE FROM public.art_candidate;

INSERT INTO "public"."art_candidate" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "careergoal", "city", "education", "expectingindustry", "jobtype", "learningsofts", "position", "region", "salary", "skills", "studentid")
  VALUES ('601', '测试学生1', '782', '2018-07-26 14:35:17.641', '测试学生1', '782', '2018-07-26 14:35:17.634', NULL, '长春市', '2', '1', '0', '软件1，软件2，软件3，软件4，软件5', '岗位1，岗位2', '22', '4', '0,1,2,3,4,5,6,7,8,9,10,11,12', '109959');

-- INSERT INTO "public"."art_candidate" ("id", "createby", "createbyid", "creationdate", "updateby", "updatebyid", "updatedate", "careergoal", "city", "education", "expectingindustry", "jobtype", "learningsofts", "position", "region", "salary", "skills", "studentid")
--  VALUES ('602', '测试学生2', '783', '2018-07-26 15:35:14.627', '管理员', '-1', '2018-07-26 15:35:14.619', NULL, '长春市', '2', '0', '0', '软件1，软件2，软件3', '岗位1', '22', '5', '0,1,2,3,4,5,6', '109959');
