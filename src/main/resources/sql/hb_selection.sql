-- Create table
create table HB_SELECT
(
  ACTIVE_ID   VARCHAR2(20) not null,
  QUESTION_ID VARCHAR2(20) not null,
  SELECT_ID   VARCHAR2(20) not null,
  SELECT_DESC VARCHAR2(20),
  TEMP        VARCHAR2(4000),
  CREATE_DATE DATE,
  UPDATE_DATE DATE
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table HB_SELECT
  is '选项表';
-- Add comments to the columns
comment on column HB_SELECT.ACTIVE_ID
  is '活动ID';
comment on column HB_SELECT.QUESTION_ID
  is '问题ID';
comment on column HB_SELECT.SELECT_ID
  is '选项ID';
comment on column HB_SELECT.SELECT_DESC
  is '选项描述';
comment on column HB_SELECT.TEMP
  is '备用字段';
comment on column HB_SELECT.CREATE_DATE
  is '创建时间';
comment on column HB_SELECT.UPDATE_DATE
  is '修改时间';
-- Create/Recreate primary, unique and foreign key constraints
alter table HB_SELECT
  add constraint PK_HB_SELECT primary key (ACTIVE_ID, QUESTION_ID, SELECT_ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
